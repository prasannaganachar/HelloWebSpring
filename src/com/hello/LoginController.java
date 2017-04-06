package com.hello;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller @RequestMapping("/login")
public class LoginController extends AbstractController  
{

	@Override
	@RequestMapping(method = RequestMethod.GET)
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{
		ModelAndView modelNView = new ModelAndView();
		String userName = request.getParameter("username");
		String pwd = request.getParameter("password");
		try {
			boolean userFlag = false;
			if("prasanna".equals(userName) && "prasanna".equals(pwd)) {
					userFlag = true;
				}
			if( userFlag )
				modelNView.setViewName("success");
			else
				modelNView.setViewName("failurelogin");
		}
		catch( Exception e ) {
			e.printStackTrace();
			modelNView.setViewName("failurelogin");
		}
		
		return modelNView;
	}

}
