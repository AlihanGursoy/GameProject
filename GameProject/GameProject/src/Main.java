
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1,"15269429544","Alihan","GÜRSOY","01/01/2002");
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.register(customer);
		customerManager.update(customer);
		customerManager.delete(customer);
		
		Campaign campaign = new Campaign(45, "Öðrenci", 21);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		
		Game game = new Game(32, "FIFA 22", 299);
		
		GameManager gameManager = new GameManager();
		gameManager.showTheGamePrice(game);
		gameManager.showTheDiscountGamePrice(game, campaign);
		gameManager.buy(game, customer);
		gameManager.sell(game, customer);
		
	}

}
