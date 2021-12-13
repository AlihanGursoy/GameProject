
public class CampaignManager {
	
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyanýz " + campaign.getCampaignPercentange() + " eklendi");
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyanýz " + campaign.getCampaignPercentange() + " silindi.");
	}
}
