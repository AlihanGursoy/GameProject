
public class GameManager {
	
	public void buy(Game game, Customer customer) {
		System.out.println(customer.getFirstName() + ", " + game.getGameName() + " kütüphaneye eklendi. ");
	}
	
	public void sell(Game game, Customer customer) {
		System.out.println(customer.getFirstName() + ", " + game.getGameName() + " satýldý. ");
	}
	
	public void showTheGamePrice(Game game) {
		System.out.println(game.getGameName() + " fiyatý: " + game.getPrice());
	}
	
	public void showTheDiscountGamePrice(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " indirimli fiyatý: " + (game.getPrice() - (game.getPrice() * campaign.getCampaignPercentange() / 100)));
	}
}
