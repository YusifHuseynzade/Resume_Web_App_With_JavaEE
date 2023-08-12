/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.resume.controller;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author YusifHuseynzade
 */
 @WebServlet("/UserController")
 public class UserController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name  = request.getParameter("name");
        String surname  = request.getParameter("surname");

        if(name.equals("admin") && surname.equals("12345")){
            response.sendRedirect("welcome.jsp");
        }
        else{
            response.sendRedirect("index.jsp");
        }


    }




}
