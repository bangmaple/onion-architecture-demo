package com.bangmaple.onion_architecture_demo.controllers;

import com.bangmaple.onion_architecture_demo.dtos.UsersDTO;
import com.bangmaple.onion_architecture_demo.services.UsersService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Users")
public class ManageUsersController extends HttpServlet {
    public static final String ADMIN = "admin.jsp";
    public static final String ERROR = "error.jsp";
    @Inject
    private UsersService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = ERROR;
        try {
            String action = req.getParameter("btnAction");
            if (action.equals("Add")) {
                service.addNewUser(getUserDTO(req));
                req.setAttribute("STATUS", "Successfully added a new user!");
                url = ADMIN;
            } else if (action.equals("Remove")) {

            } else if (action.equals("Update")) {

            }
        } catch (Exception e) {
            log("ERROR at ManageUsersController: " + e.getMessage());
        }finally  {
            req.getRequestDispatcher(url).forward(req, resp);
        }
    }

    private UsersDTO getUserDTO(HttpServletRequest req) {
        String username = req.getParameter("txtUsername");
        String password = req.getParameter("txtPassword");
        String description = req.getParameter("txtDescription");
        String role = req.getParameter("txtRole");
        String fullname = req.getParameter("txtFullname");
        UsersDTO dto = new UsersDTO();
        dto.setUsername(username);
        dto.setPassword(password);
        dto.setFullname(fullname);
        dto.setDescription(description);
        dto.setRoles(role);
        return dto;
    }
}
