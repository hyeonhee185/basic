package chapter7;

public class LprodVO {
	private int lpodId;
	private String lprodGu;
	private String lprodNm;
	public LprodVO(int lpodId, String lprodGu, String lprodNm) {
		super();
		this.lpodId = lpodId;
		this.lprodGu = lprodGu;
		this.lprodNm = lprodNm;
	}
	public int getLpodId() {
		return lpodId;
	}
	public void setLpodId(int lpodId) {
		this.lpodId = lpodId;
	}
	public String getLprodGu() {
		return lprodGu;
	}
	public void setLprodGu(String lprodGu) {
		this.lprodGu = lprodGu;
	}
	public String getLprodNm() {
		return lprodNm;
	}
	public void setLprodNm(String lprodNm) {
		this.lprodNm = lprodNm;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LprodVO [lpodId=");
		builder.append(lpodId);
		builder.append(", lprodGu=");
		builder.append(lprodGu);
		builder.append(", lprodNm=");
		builder.append(lprodNm);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
