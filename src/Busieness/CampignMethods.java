package Busieness;

import Entities.Campaign;
import Games.BaseCampaing;

public class CampignMethods implements BaseCampaing {
    @Override
    public String newCampaing(Campaign campaign) {
       return campaign.getGetCampaignName()+" isimli oyunda"+campaign.getDescription();

    }

    @Override
    public String removeCampaign(Campaign campaign) {
        return campaign.getGetCampaignName();
    }

    @Override
    public String updateCampaign(Campaign campaign) {
       return campaign.getGetCampaignName();
    }
}
