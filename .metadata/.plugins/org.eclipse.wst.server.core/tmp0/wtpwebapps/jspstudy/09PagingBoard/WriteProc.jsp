<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.BoardDAO" %>
<%@ page import="board.BoardDTO" %>
<%@ page import="utils.AlertFunc" %>

<%
	String title=request.getParameter("title");
	String content=request.getParameter("content");
	
	BoardDTO dto=new BoardDTO();
	dto.setTitle(title);
	dto.setContent(content);
	dto.setId(session.getAttribute("UserId").toString());
	
	BoardDAO dao=new BoardDAO(application);
	int res = dao.insertWrite(dto);
	
	//132개 게시물 한번에 작성
	//int res=0;
	//for(int i=1;i<=132;i++){
	//	dto.setTitle(title+i);
	//	dto.setContent(content+i);
	//	res=dao.insertWrite(dto);
//	}
	
	dao.close();
	
	if(res==1){
		response.sendRedirect("List.jsp");
	}else{
		AlertFunc.alertBack("글쓰기가 입력되지 않았습니다.", out);
	}
%>