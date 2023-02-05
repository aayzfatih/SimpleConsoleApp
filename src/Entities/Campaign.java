package Entities;

public class Campaign {
    private int campaignId;
    private String getCampaignName;
    private String description;

    public Campaign(int campaignId, String getCampaignName, String description) {
        this.campaignId = campaignId;
        this.getCampaignName = getCampaignName;
        this.description = description;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getGetCampaignName() {
        return getCampaignName;
    }

    public void setGetCampaignName(String getCampaignName) {
        this.getCampaignName = getCampaignName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
