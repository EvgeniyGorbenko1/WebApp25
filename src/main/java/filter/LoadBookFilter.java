package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter("/load-book")
public class LoadBookFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Post" + LocalDateTime.now());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
