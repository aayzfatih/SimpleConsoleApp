import Busieness.CampaignManager;
import Busieness.CampignMethods;
import Busieness.GamerMethods;
import Entities.Campaign;
import Entities.Gamer;
import Busieness.GamerManager;
import Entities.Game;

public class Main {
    public static void main(String[] args) {
        Gamer gamer=new Gamer(1,"fatih","fatih@gmail.com","12340.",new Game(1,"Valorant",1500));
        GamerManager gamerManager=new GamerManager(new GamerMethods());
        gamerManager.ekle(gamer);
        Campaign campaigg=new Campaign(1,"Valorant "," indirim yapildi");
        CampaignManager campaignManager=new CampaignManager(new CampignMethods());
        campaignManager.addCampaign(campaigg);

    }
}
