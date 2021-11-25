package chapter7;

import java.util.List;

public class JDBCTest {
	public static void main(String[] args) throws Exception {
		LprodDao dao = new LprodDao();
		List<LprodVO> vos = dao.select();
		System.out.println("ID\t\t구분\t\t이름");
		for (LprodVO vo : vos) {
			System.out.println(vo.getLpodId() + "\t" + vo.getLprodGu() + "\t" + vo.getLprodNm());
			
		}
	}
}
