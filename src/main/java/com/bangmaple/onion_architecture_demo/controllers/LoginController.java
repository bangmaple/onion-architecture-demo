package com.bangmaple.onion_architecture_demo.controllers;

import com.bangmaple.onion_architecture_demo.dtos.UsersDTO;
import com.bangmaple.onion_architecture_demo.services.UsersService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

@WebServlet(urlPatterns = "/Login")
public class LoginController extends HttpServlet {
    public static final String ADMIN = "admin.jsp";
    public static final String ERROR = "error.jsp";

    @Inject
    private UsersService service;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = ERROR;
        try {
            String username = req.getParameter("txtUsername");
            String password = req.getParameter("txtPassword");

            UsersDTO dto = service.checkLogin(username, password);
            if (Objects.isNull(dto)) {
                req.setAttribute("ERROR", "Invalid username or password.");
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("USER", dto);
                if (dto.getRoles().equals("Administrator")) {
                    url = ADMIN;
                } else {
                    req.setAttribute("ERROR", "Invalid role.");
                }
            }
        } catch (Exception e) {
            log("Error at LoginController: " + e.getMessage());
        } finally {
            req.getRequestDispatcher(url).forward(req, resp);
        }
    }
}
