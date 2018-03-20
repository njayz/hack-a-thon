package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ehaform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("        <h3>User Electonic health Assesment Form</h3>\n");
      out.write("        <form action=\" ehaform\" method=\"Post\">\n");
      out.write("            <pre>\n");
      out.write("Mobile           :  <input type=\"text\" name=\"mob\"/>           \n");
      out.write("Age              :  <input type=\"number\" name=\"age\"/>\n");
      out.write("Sex              :  <select name=\"sex\"    />\n");
      out.write("                    <option>Male</option>\n");
      out.write("                    <option>Female</option>\n");
      out.write("                    </select>\n");
      out.write("Weight           :  <input type=\"number\" name=\"weight\"/>\n");
      out.write("past diseases    :  <input type=\"text\" name=\"pdise\"/> \n");
      out.write("Current diseases :  <input type=\"text\" name=\"cdise\"/> \n");
      out.write("Vital signs      :  <input type=\"text\" name=\"vital\"/> \n");
      out.write("Medication       :  <input type=\"text\" name=\"medic\"/> \n");
      out.write("immunization     :  <input type=\"text\" name=\"immun\"/>\n");
      out.write("Company          :  <input type=\"text\" name=\"company\"/> \n");
      out.write("City             :  <input type=\"text\" name=\"city\"/> \n");
      out.write("State            :  <input type=\"text\" name=\"state\"/> \n");
      out.write("                  <input type=\"submit\" value=\"save\"/>\n");
      out.write("            </pre>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
      out.write("\n");
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
