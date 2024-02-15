import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name1=request.getParameter("name");
        String password=request.getParameter("password");

        if(name1.equals("123")&&password.equals("123")){
            HttpSession session=request.getSession();
            session.setAttribute("name2",name1);
            response.sendRedirect(request.getContextPath()+"/ProductListServlet");
        }else {
            response.getWriter().write("登陆失败！3秒后跳转回主页面");
            response.setHeader("refresh","3;/test2/login.html");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
