package com.springbook.biz.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

public class LoginController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("로그인 처리 - Spring_MVC 호출");
		
		// 1. 사용자 입력 정보 추출
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		// 2. DB 연동 처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPass(pass);

		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);

		// 3. 화면 네비게이션
		//view 페이지 리턴함.
		ModelAndView mav = new ModelAndView();
		
		
		if (user != null) {
			mav.setViewName("redirect:getBoardList.do");;
			//redirect : viewResolver 설정을 무시하고 리다이렉트한다
			//redirect : viewResolver의 preix suffix가 적용되지 않도록 한다,
			//redirect가 없으면 포워드방식, 서버단에서 이동해서 클라이언트 url이 변경되지 않는다.
			//redirect가 들어가면 뷰페이지를 재요청방식으로 처리, (클라이언트가 뷰페이지를 새롭게 요청하기떄문에
				//url이 변경하게 된다.)
			
			//기본적인 Controller가 View페이지를 통해 던지는 방식은 Forward 방식입니다.
				//클라이언트의 URL이 바뀌지 않는다.
				//ViewResolver가 작동이 된다. prefix, suffix가 적용
			//redirect : 서버에서 전송한 페이지를 client가 재요청
				//클라이언트의 URL이 바뀐다.
				//ViewResolver가 작동이 앋된다.
			
		
		} else {
			mav.setViewName("redirect:login.jsp"); //ViewResolver 페이지에서 뷰페이지를 완성함.
		}
		return mav;
		
	}

	
}
