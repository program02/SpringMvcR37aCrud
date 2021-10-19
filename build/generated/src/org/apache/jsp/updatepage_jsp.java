package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updatepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_errors_path_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_errors_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_errors_path_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Update Page</h1>\r\n");
      out.write("        <form action=\"update.htm\" method=\"post\">\r\n");
      out.write("            <table>\r\n");
      out.write("\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Id</td>\r\n");
      out.write("                        <td>:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"stid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stu.stid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Name</td>\r\n");
      out.write("                        <td>:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stu.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Email</td>\r\n");
      out.write("                        <td>:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stu.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("                         <td>");
      //  form:errors
      org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
      _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
      _jspx_th_form_errors_0.setParent(null);
      _jspx_th_form_errors_0.setPath("stu.email");
      int[] _jspx_push_body_count_form_errors_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_errors_0 = _jspx_th_form_errors_0.doStartTag();
        if (_jspx_th_form_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_errors_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_errors_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_errors_0.doFinally();
        _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_0);
      }
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Password</td>\r\n");
      out.write("                        <td>:</td>\r\n");
      out.write("                        <td><input type=\"password\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stu.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Round</td>\r\n");
      out.write("                        <td>:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"round\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stu.round}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Gender</td>\r\n");
      out.write("                        <td>:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"gender\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stu.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Skill</td>\r\n");
      out.write("                        <td>:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"skill\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stu.skill}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>DOB(YYYY-mm-dd)</td>\r\n");
      out.write("                        <td>:</td>\r\n");
      out.write("                        <td><input type=\"text\" name=\"dob\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stu.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n");
      out.write("                    </tr>                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td><input type=\"submit\" value=\"Update\"/></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
