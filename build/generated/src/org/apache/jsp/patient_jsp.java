package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class patient_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script> \n");
      out.write("      *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            header{\n");
      out.write("               // background-image: url(\"2.jpg\");\n");
      out.write("                height: 145vh;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                background-color: blue;\n");
      out.write("            }\n");
      out.write("            .navbar{\n");
      out.write("                background: grey ;\n");
      out.write("                opacity: 0.5;\n");
      out.write("                height: 70px;\n");
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
      out.write("                    text-decoration:none;\n");
      out.write("                    color: white;\n");
      out.write("                    padding: 5px 10px;\n");
      out.write("                    font-family: sans-serif;\n");
      out.write("                    letter-spacing: 2px;\n");
      out.write("                    border: 1px solid grey;\n");
      out.write("                }\n");
      out.write("                .menu li a:hover{\n");
      out.write("                    background: #fff;\n");
      out.write("                    transition: .4s;\n");
      out.write("                    color: #000;\n");
      out.write("                }\n");
      out.write("                      \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        </script>>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("           <div class=\"navbar\">\n");
      out.write("                <img src=\"transparent.jpg\" class=\"logo\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("          <li><center><a href=\"eha.jsp\"><h1>Electonic Health Assesment Form</h1></a></li>\n");
      out.write("          <li><center><a href=\" \"><h1>update detail</h1></a></li>\n");
      out.write("          <li><center><a href=\"doctorfetch.jsp \"><h1>Search Doctor<h1></a></li>\n");
      out.write("          <li><center><a href=\" \"><h1>prescriptions</h1></a></li>\n");
      out.write("          <li><center><a href=\" \"><h1>Statstics</h1></a></li>\n");
      out.write("          <li><center><a href=\"logout\"><h1>Logout</h1></a></li>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          </ul>\n");
      out.write("                </div>\n");
      out.write("          </header>\n");
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
