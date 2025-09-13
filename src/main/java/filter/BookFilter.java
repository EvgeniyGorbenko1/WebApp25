package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import servlet.Get;

import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter("/book")
public class BookFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Get" + LocalDateTime.now());
        filterChain.doFilter(servletRequest, servletResponse);

    }
}
