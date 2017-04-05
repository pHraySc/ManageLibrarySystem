package com.sccc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class setCharactorEncodingFilter implements Filter {

	private String encode = null;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// 转换
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		/*
		 * 1.判断在web.xml中是否配置了编码格式的信息 2.如果不为空，则设置为编码格式为配置文件中的编码格式
		 * 3.否则，设置为UTF-8编码格式
		 */
		if (this.encode != null && !this.encode.equals("")) {
			request.setCharacterEncoding(this.encode);
			response.setCharacterEncoding(this.encode);
		} else {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
		}
		/*
		 * 使用doFilter方法调用链中的下一个过滤器或目标资源（servlet或JSP页面）。
		 * chain.doFilter处理过滤器的其余部分（如果有的话），最终处理请求的servlet或JSP页面。
		 */
		System.out.println("执行filter");
		arg2.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		//获取web.xml中的编码配置信息
		this.encode = arg0.getInitParameter("encode");
	}
}
