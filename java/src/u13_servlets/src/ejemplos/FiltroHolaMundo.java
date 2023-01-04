import javax.servlet.*;
import java.io.IOException;

/**
 * Servlet Filter implementation class FiltroHolaMundo
 */
//@WebFilter(servletNames = { "HolaMundo" })
public class FiltroHolaMundo implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroHolaMundo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("Antes de Servlet");

		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println("Despues de Servlet");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
