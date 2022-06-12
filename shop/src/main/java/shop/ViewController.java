package shop;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qna.QnaDAO;
import qna.QnaDTO;

//클래스 위에다가 어테이션 할당
@WebServlet("/shop/view.do")
public class ViewController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get 요청시 처리 블락
		//System.out.println("ViewController 작동잘됨 (Get 방식 요청처리)");
		
		//게시물 정보 불러오기 (1. 조회수 증가, 2. 게시물 정보 가져오기)
		QnaDAO qdao = new QnaDAO();
		
		int q_id = Integer.parseInt(req.getParameter("q_id"));
		System.out.println(q_id); 
		//조회수 증가
		qdao.updateVisitCount(q_id);
		
		//게시물의 자세한 정보 값 가져오기
		QnaDTO qdto = qdao.selectView(q_id);
		
		qdao.close(); //객체 반납
		
		//DataBase의 content 컬럼의 \r\n을 <== <<ENTER>>을 "<br />태그로 변환
		qdto.setContent(qdto.getContent().replaceAll("\r\n", "<br>"));
		
		//게시물 (dto) 객체를 view페이지로 전달하기 위한 변수 저장
		req.setAttribute("qdto", qdto);
		req.getRequestDispatcher("/shop/qnaview.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Post 요청시 처리 블락
		System.out.println("ViewController 작동잘됨 (Post 방식 요청처리)");
	}

	
	
}
