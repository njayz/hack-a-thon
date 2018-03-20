package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("           /* *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            header{\n");
      out.write("                background-image: url(pic.jpeg);\n");
      out.write("                height: 100vh;\n");
      out.write("                background-size:cover;\n");
      out.write("                background-position: center;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            .navbar{\n");
      out.write("                background: rgb(0,0,0,0.5);\n");
      out.write("                height: 80px;\n");
      out.write("                }\n");
      out.write("                .logo{\n");
      out.write("                    margin: 10px 50px;\n");
      out.write("                    height: 60px;\n");
      out.write("                }\n");
      out.write("                .menu{\n");
      out.write("                    float: right;\n");
      out.write("                    list-style: none;\n");
      out.write("                    margin: 20px;\n");
      out.write("                }\n");
      out.write("                .menu li{\n");
      out.write("                    display: inline-block;\n");
      out.write("                    margin: 10px 5px;\n");
      out.write("                }\n");
      out.write("                .menu li a{\n");
      out.write("                    text-decoration: none;\n");
      out.write("                    color:white;\n");
      out.write("                    padding: 5px 10px;\n");
      out.write("                    font-family: sans-serif;\n");
      out.write("                    letter-spacing: 2px;\n");
      out.write("                    border: 1px solid #fff;\n");
      out.write("                }\n");
      out.write("                .menu li a:hover{\n");
      out.write("                    background: #fff;\n");
      out.write("                    transition: .4s;\n");
      out.write("                    color: #000;\n");
      out.write("                } */ \n");
      out.write("           body{\n");
      out.write("               margin: 0;\n");
      out.write("               padding: 0;\n");
      out.write("               background: url(\"3.jpg\");\n");
      out.write("               background-size: cover;\n");
      out.write("               background-position: center;\n");
      out.write("               font-family: sans-serif;\n");
      out.write("           }\n");
      out.write("                .loginbox{\n");
      out.write("                    width: 380px;\n");
      out.write("                    height: 400px;\n");
      out.write("                    background: black;\n");
      out.write("                    opacity: 0.7;\n");
      out.write("                    color: #fff;\n");
      out.write("                    top:10%;\n");
      out.write("                    left: 38%;\n");
      out.write("                    position: relative;\n");
      out.write("                    box-sizing: border-box;\n");
      out.write("                    padding: 70px 30px; \n");
      out.write("                      }\n");
      out.write("                      .avatar{\n");
      out.write("                          width: 100px;\n");
      out.write("                          height: 100px;\n");
      out.write("                          border-radius: 50%;\n");
      out.write("                          position: absolute ;\n");
      out.write("                          top: -50px;\n");
      out.write("                          left: 135px;\n");
      out.write("                          \n");
      out.write("                           \n");
      out.write("                      }\n");
      out.write("                      h1{\n");
      out.write("                          margin: 0;\n");
      out.write("                          padding: 0 0 20px;\n");
      out.write("                          text-align: center;\n");
      out.write("                          font-size: 5opx;\n");
      out.write("                      }\n");
      out.write("                      .loginbox p{\n");
      out.write("                          margin: 0;\n");
      out.write("                          padding: 0;\n");
      out.write("                          font-weight: bold;\n");
      out.write("                      }\n");
      out.write("                      .loginbox input{\n");
      out.write("                          width: 310px;\n");
      out.write("                          margin-bottom: 20px;\n");
      out.write("                          }\n");
      out.write("                          .loginbox input[type=\"number\"], input[type=\"password\"]{\n");
      out.write("                              border: none;\n");
      out.write("                              border-bottom: 1px solid #fff;\n");
      out.write("                              background: transparent;\n");
      out.write("                              outline: none;\n");
      out.write("                              height: 40px;\n");
      out.write("                              color: #fff;\n");
      out.write("                              font-size: 16px;\n");
      out.write("                          }\n");
      out.write("                          .loginbox input[type=\"submit\"]{\n");
      out.write("                              border: none;\n");
      out.write("                              outline: none;\n");
      out.write("                              height: 40px;\n");
      out.write("                              background: #fb2525;\n");
      out.write("                              color: #fff;\n");
      out.write("                              font-size: 18px;\n");
      out.write("                              border-radius: 20px;\n");
      out.write("                          }\n");
      out.write("                          .loginbox input[type=\"submit\"]:hover{\n");
      out.write("                              cursor: pointer;\n");
      out.write("                              background: #ffc107;\n");
      out.write("                              color: #000;\n");
      out.write("                          }\n");
      out.write("                          .loginbox a{\n");
      out.write("                              text-decoration: none;\n");
      out.write("                              font-size: 12px;\n");
      out.write("                              line-height: 20px;\n");
      out.write("                              color: darkgrey;\n");
      out.write("                          }\n");
      out.write("                          .loginbox a:hover{\n");
      out.write("                              color: #ffc107;\n");
      out.write("                          }\n");
      out.write("        </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write(" \n");
      out.write("    <body>\n");
      out.write("        <div class=\"loginbox\">\n");
      out.write("            <img src=\"avater.png\" class=\"avatar\"></img>\n");
      out.write("            <h1>You are Ready Now !</h1>\n");
      out.write("        <form action=\"login\" method=\"post\">\n");
      out.write("<p>Mobile Number</p> <input type=\"password\" name=\"number\" placeholder=\"Mobile Number\"/>\n");
      out.write("<p>Password</p> <input type=\"password\" name=\"pwd\"  placeholder=\"Enter Password\"/>\n");
      out.write("<p>User Type:</p><br>\n");
      out.write("<p align=\"left\">Patient<input type=\"radio\" name=\"user_type\">Doctor<input type=\"radio\" name=\"user_type\">\n");
      out.write("    <input type=\"submit\" value=\"Login\"/> \n");
      out.write("                          <a href=\"signup.jsp\">Don't Have an Account?</a><br/>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
