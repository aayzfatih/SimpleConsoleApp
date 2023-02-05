package Games;

import Entities.Campaign;

public interface BaseCampaing {
    public String newCampaing(Campaign campaign);
    public String removeCampaign(Campaign campaign);
    public String updateCampaign(Campaign campaign);
}
