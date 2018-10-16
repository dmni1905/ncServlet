package com.netcracker.servlet.login;

import com.netcracker.model.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String msg;


        if ("dmni".equalsIgnoreCase(username) && "qwerty".equals(password)) {
            request.getSession().setAttribute("isLogin", true);

            User newUser = new User(username, password);
            newUser.setEmail("dmni.nichik@gmail.com");

            ServletContext ctx = getServletContext();
            ctx.setAttribute("user", newUser);

            response.sendRedirect(request.getContextPath() + "/private/user_info.jsp");
            return;
        } else {
            msg = "Unknown user, please try again";
        }

        request.setAttribute("error_msg", msg);
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

}
