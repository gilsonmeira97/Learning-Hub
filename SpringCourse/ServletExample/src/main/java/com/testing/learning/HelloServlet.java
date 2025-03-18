package com.testing.learning;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("Service running...");
    }
}
