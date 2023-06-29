<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.BoardDAO" %>
<%@ page import="board.BoardDTO" %>
<%@ page import="utils.AlertFunc" %>
<%
	String num=request.getParameter("num");

	BoardDAO dao=new BoardDAO(application);
	int res=dao.deletPost(num);
	dao.close();
	
	if(res==1){
		AlertFunc.alertLocation("삭제완료", "List.jsp", out);
	}
	else{
		AlertFunc.alertBack("삭제 실패", out);
	}
	
%>