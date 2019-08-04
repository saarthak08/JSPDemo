import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/addAlien")
public class idFilter implements Filter{
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("In Filter");
        HttpServletRequest request=(HttpServletRequest) req;
        PrintWriter writer=resp.getWriter();
        int aid=Integer.parseInt(request.getParameter("aid"));
        if(aid>0) {
            chain.doFilter(req, resp);
        }
        else{
            writer.println("Invalid Input");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
