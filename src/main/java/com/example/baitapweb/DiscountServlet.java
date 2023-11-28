package com.example.baitapweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float price = Float.parseFloat(req.getParameter("price"));
        float percent = Float.parseFloat(req.getParameter("percent"));
        String product = req.getParameter("Product Description");

        float Amount = (float) (price * percent * 0.01);
        float percentAmount = (float) (price - Amount);

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h2> San pham: " + product + "</h2>");
        writer.println("<h2> Luong chiet khau: " + Amount + "</h2>");
        writer.println("<h2> Gia sau khi duoc chiet khau: " + percentAmount + "</h2>");
        writer.println("</html>");

    }
}
