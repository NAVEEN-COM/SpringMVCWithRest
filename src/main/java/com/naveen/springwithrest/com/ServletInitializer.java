package com.naveen.springwithrest.com;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletInitializer implements WebApplicationInitializer 
{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(AppConfiguration.class);
		
		DispatcherServlet servlet = new DispatcherServlet(ctx);
		
		Dynamic dynamic = servletContext.addServlet("dispacherservlet", servlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
	}

}
