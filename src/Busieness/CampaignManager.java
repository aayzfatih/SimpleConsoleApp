package Busieness;

import Entities.Campaign;
import Games.BaseCampaing;

public class CampaignManager {
    private BaseCampaing baseCampaing;

    public CampaignManager(BaseCampaing baseCampaing) {
        this.baseCampaing = baseCampaing;
    }

    public void addCampaign(Campaign campaign) {
        System.out.println(this.baseCampaing.newCampaing(campaign));
    }

    public void removeCampaign(Campaign campaign) {
        System.out.println("Silindi: " + this.baseCampaing.removeCampaign(campaign));
    }

    public void updateCampaign(Campaign campaign) {
        System.out.println("Guncellendi" + this.baseCampaing.updateCampaign(campaign));
    }
}
