package com.springbook.view.springmvc.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("로그인 처리");
		
		// 1. 사용자 입력 정보 추출
		String id = request.getParameter("id");
<<<<<<< HEAD
		String pass = request.getParameter("pass");
=======
<<<<<<< HEAD
		String pass = request.getParameter("pass");
=======
		String password = request.getParameter("password");
>>>>>>> 9e0d4adb58faea260cdc14d29e5db0017df7b0c2
>>>>>>> 7a6b14bb83f22218a13c7a0564af8bc7b4fb36c6

		//System.out.println("아이디 : " + id );
		//System.out.println("패스워드 : " + password );
		
		// 2. DB 연동 처리
		UserVO vo = new UserVO();
		vo.setId(id);
<<<<<<< HEAD
		vo.setPass(pass);
=======
<<<<<<< HEAD
		vo.setPass(pass);
=======
		vo.setPassword(password);
>>>>>>> 9e0d4adb58faea260cdc14d29e5db0017df7b0c2
>>>>>>> 7a6b14bb83f22218a13c7a0564af8bc7b4fb36c6

		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);
		/*
		if (user != null) {
			System.out.println("DB 에서 값 전송 성공 ");
		}
		*/
		// 3. 화면 네비게이션
		ModelAndView mav = new ModelAndView();
		if (user != null) {
			mav.setViewName("redirect:getBoardList.do");
		} else {
			mav.setViewName("redirect:login.jsp");
		}
		return mav;
	}

}
