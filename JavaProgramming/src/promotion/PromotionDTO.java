package promotion;

public class PromotionDTO {
	private String promotionId;
	private String promotionName;
	private int promotionRate;
	private String promotionDetail;

	public PromotionDTO(String promotionId, String promotionName, int promotionRate, String promotionDetail) {
		super();
		this.promotionId = promotionId;
		this.promotionName = promotionName;
		this.promotionRate = promotionRate;
		this.promotionDetail = promotionDetail;
	}

	public String getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public int getPromotionRate() {
		return promotionRate;
	}

	public void setPromotionRate(int promotionRate) {
		this.promotionRate = promotionRate;
	}

	public String getPromotionDetail() {
		return promotionDetail;
	}

	public void setPromotionDetail(String promotionDetail) {
		this.promotionDetail = promotionDetail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PromotionDTO [promotionId=");
		builder.append(promotionId);
		builder.append(", promotionName=");
		builder.append(promotionName);
		builder.append(", promotionRate=");
		builder.append(promotionRate);
		builder.append(", promotionDetail=");
		builder.append(promotionDetail);
		builder.append("]");
		return builder.toString();
	}

}
