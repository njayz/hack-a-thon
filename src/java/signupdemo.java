/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RP~HiT
 */
public class signupdemo extends HttpServlet {

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
        PrintWriter out = response.getWriter(); 
              
                  try 
         {
           if(request.getParameter("user_type") != null){
           if(request.getParameter("user_type").equals("patient")){
             Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pha", "root", "root");
   PreparedStatement ps=con.prepareStatement("insert into patient values(?,?,?,?,?,?)");
   ps.setString(1, request.getParameter("number"));
   ps.setString(2, request.getParameter("pwd"));
   ps.setString(3, request.getParameter("name"));
   ps.setString(4, request.getParameter("city"));
   ps.setString(5, request.getParameter("state"));
   ps.setString(6, request.getParameter("email"));
   ps.executeUpdate();
   //out.println("<center><h1><br><br><br><br><br>User registered Successfully.....</h1></center>");
   response.sendRedirect("login.jsp");
   out.println("<script> alert(You have registered "
           + "succesfully)</script>") ;
          
           }
           if(request.getParameter("user_type").equals("doctor")){
             Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pha", "root", "root");
   PreparedStatement ps=con.prepareStatement("insert into doctor values(?,?,?,?,?,?)");
   ps.setString(1, request.getParameter("number"));
   ps.setString(2, request.getParameter("pwd"));
   ps.setString(3, request.getParameter("name"));
   ps.setString(4, request.getParameter("city"));
   ps.setString(5, request.getParameter("state"));
   ps.setString(6, request.getParameter("email"));
   ps.executeUpdate();
   //out.println("<center><h1><br><br><br><br><br>User registered Successfully.....</h1></center>");
   response.sendRedirect("login.jsp");
   out.println("<script> alert(You have registered "
           + "succesfully)</script>") ;
          
           }
           }
   //out.println("<a href=login.jsp><b><h1><center>Login Now</center></h2></b></a>");
        } 
                  
         catch (Exception ex) {
           out.println(ex);
        } finally {            
            out.close();
             
             
             
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
