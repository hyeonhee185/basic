package mvc.dao;

import java.util.List;

import mvc.vo.MemberVO;

public interface IMemberDao {

	public int insertMamber(MemberVO memVo);
	
	public int deleteMember(String memID);
	
	public int updateMember(MemberVO memVo);
	
	public List<MemberVO> getAllMemberList();
	
	public int getMemberCount(String memId);
	
	
}
