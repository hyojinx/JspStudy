package membership;

import common.JDBConnect;

public class MemberDAO extends JDBConnect{
	public MemberDAO(String driver,String url,String id,String pw) {
		super(driver,url,id,pw);
	}
	public MemberDTO getMember(String uid, String upw){
		String query="SELECT * FROM MEMBER WHERE ID=? AND PW=?";
		MemberDTO dto = new MemberDTO();
		try {
			
		psmt = con.prepareStatement(query);
		psmt.setString(1, uid);
		psmt.setString(2, upw);
		rs=psmt.executeQuery();
		
		if(rs.next()) {
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("id"));
			dto.setName(rs.getString("id"));
			dto.setRegdate(rs.getString("id"));
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		return dto;
	}
	
}
