package Concrete;

import Abstract.ISalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class SalesManager implements ISalesService{

	@Override
	public void sales(Member member, Game game) {
		System.out.println("Oyun satın alındı: "+member.getId()+"; "+game.getId());
		
	}

	@Override
	public void campaignSales(Member member, Game game, Campaign campaign) {
		System.out.println("Oyun satın alındı: "+member.getId()+"; "+game.getId()+"; "+campaign.getId());
		
	}

}
