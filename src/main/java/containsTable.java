/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author malik
 */
@WebServlet(urlPatterns = {"/containsTable"})
public class containsTable extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.print("<table border = " + 1 + ">");
            out.print("<tr>");
            out.print("<td>" + "host" + "</td>");
            out.print("<td>" + request.getHeader("Host") + "</td>");
            out.print("</tr>");
            out.print("<tr>");
            out.print("<td>" + "connection" + "</td>");
            out.print("<td>" + request.getHeader("Connection") + "</td>");
            out.print("</tr>");
            out.print("<tr>");
            out.print("<td>" + "cache-control" + "</td>");
            out.print("<td>" + request.getHeader("Cache-Control") + "</td>");
            out.print("</tr>");
            out.print("<tr>");
            out.print("<td>" + "accept" + "</td>");
            out.print("<td>" + request.getHeader("Accept") + "</td>");
            out.print("</tr>");
            out.print("<tr>");
            out.print("<td>" + "user-agent" + "</td>");
            out.print("<td>" + request.getHeader("User-Agent") + "</td>");
            out.print("</tr>");
            out.print("<tr>");
            out.print("<td>" + "accept-encoding" + "</td>");
            out.print("<td>" + request.getHeader("accept-encoding") + "</td>");
            out.print("</tr>");
            out.print("<tr>");
            out.print("<td>" + "accept-language" + "</td>");
            out.print("<td>" + request.getHeader("accept-language") + "</td>");
            out.print("</tr>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
