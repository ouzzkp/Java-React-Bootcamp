package Concrete;
import Abstract.ICampaignService;
import Entities.Campaign;
public class CampaignManager implements ICampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+"'kampanyası "+campaign.getDiscountPercent()+" indirim oranıyla oluşturuldu.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyasının indirim oranı "+campaign.getDiscountPercent()+" indirim oranına uyarlanmıştır.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi: "+ campaign.getCampaignName());
		
	}

}
