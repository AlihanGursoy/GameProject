
public class GameManager {
	
	public void buy(Game game, Customer customer) {
		System.out.println(customer.getFirstName() + ", " + game.getGameName() + " k�t�phaneye eklendi. ");
	}
	
	public void sell(Game game, Customer customer) {
		System.out.println(customer.getFirstName() + ", " + game.getGameName() + " sat�ld�. ");
	}
	
	public void showTheGamePrice(Game game) {
		System.out.println(game.getGameName() + " fiyat�: " + game.getPrice());
	}
	
	public void showTheDiscountGamePrice(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " indirimli fiyat�: " + (game.getPrice() - (game.getPrice() * campaign.getCampaignPercentange() / 100)));
	}
}
