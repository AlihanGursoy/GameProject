
public class CampaignManager {
	
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyanęz " + campaign.getCampaignPercentange() + " eklendi");
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyanęz " + campaign.getCampaignPercentange() + " silindi.");
	}
}
