package Entities;

public class Campaign {

	private int id;
	private String campaignName;
	private int discountPercent;

	public Campaign(int id, String campaignName, int discountPercent) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPercent = discountPercent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
}
