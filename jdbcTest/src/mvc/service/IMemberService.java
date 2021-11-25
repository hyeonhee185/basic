package mvc.service;

import java.util.List;

import mvc.vo.MemberVO;

public interface IMemberService {
	
	public int insertMember(MemberVO memVo);
	
	public int deleteMember(String memId);
	
	public int updateMember(MemberVO memVo);
	
	public List<MemberVO> getAllMemberList();
	
	public int getMemberCount(String memId);
}
