/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-01 23:29:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t\t<title>Login Application</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"resources/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"resources/css/styles.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"resources/text/css\" href=\"css/me.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<div class=\"container\" style=\"margin-top:9%\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-sm-offset-3 col-md-6 col-md-offset-3 \">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"resources/image/download.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2 style=\"text-shadow: 3px 2.5px 2.5px #FF8C00;color:#00008B;font-weight: bold;\">Admin <font style=\"color: green;\">Login</font></h2><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p style=\"color: red;font-weight: bold;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<form class=\"form-horizontal\" role=\"form\" action=\"LoginController\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t    <label class=\"control-label col-sm-3\" for=\"username\">Username : </label>\r\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t      <input type=\"text\" class=\"form-control\" id=\"username\" placeholder=\"Enter Username\" name=\"uname\">\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t    <label class=\"control-label col-sm-3\" for=\"pwd\">Password : </label>\r\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"col-sm-9\"> \r\n");
      out.write("\t\t\t\t\t\t\t      <input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Enter password\" name=\"pass\">\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"form-group\"> \r\n");
      out.write("\t\t\t\t\t\t\t    <div cl\tass=\"col-sm-offset-3 col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t      <center><button type=\"submit\" class=\"btn btn-primary\" style=\"font-weight: bold;\">Login</button></center>\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<script src=\"resources/js/jquery-2.2.0.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/js/bootstrap.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
