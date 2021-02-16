package com.bangmaple.onion_architecture_demo;


import com.bangmaple.onion_architecture_demo.services.HelloService;
import com.bangmaple.onion_architecture_demo.services.impl.HelloServiceImpl;

import java.io.*;
import javax.inject.Inject;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {


    @Inject
    private HelloService service;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + service.getMessage() + "</h1>");
        out.println("</body></html>");
    }

}