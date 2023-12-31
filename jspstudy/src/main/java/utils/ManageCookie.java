package utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ManageCookie{
	//쿠키 생성
	public static void makeCookie(HttpServletResponse response,
			String cName,String cValue, int cTime) {
		
		Cookie cookie=new Cookie("popupMode","off");
		cookie.setPath("/");
		cookie.setMaxAge(cTime);
		response.addCookie(cookie);
		
	}
	
	//쿠키값 읽기(반환)
	public static String readCookie(HttpServletRequest request,String cName) {
		String cookieValueString="";
		Cookie[] cookies = request.getCookies(); //요청 헤더에서 모든 쿠키를 얻기
		if(cookies!=null){
			for(Cookie c : cookies){
				String cookieName = c.getName();
				if(cookieName.equals(cName)) {
					cookieValueString=c.getValue();
					
				}
			}
		}
		return cookieValueString;
	}
	
	//쿠키를 삭제
	public static void deleteCookie(HttpServletResponse response,String cName) {
		makeCookie(response, cName,"",0);
	}
	
}