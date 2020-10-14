package com.gridin.webserver.servlets;

import com.gridin.webserver.dbService.dataSets.Customer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class RegisterUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        LocalDate dateOfBirth = LocalDate.parse(req.getParameter("dateOfBirth"));

        Customer newCustomer = new Customer(login, password, name,
                surname, dateOfBirth);


    }
}
