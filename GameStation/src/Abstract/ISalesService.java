package Abstract;
import Entities.*;
public interface ISalesService {
	public void sales(Member member, Game game);
	public void campaignSales(Member member, Game game, Campaign campaign);
}
