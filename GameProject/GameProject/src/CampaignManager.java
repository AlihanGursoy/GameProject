
public class CampaignManager {
	
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyan�z " + campaign.getCampaignPercentange() + " eklendi");
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyan�z " + campaign.getCampaignPercentange() + " silindi.");
	}
}
