package Busieness;

import Entities.Gamer;
import Games.BaseGame;

public class GamerManager {
    private BaseGame baseGame;

    public GamerManager(BaseGame baseGame) {
        this.baseGame = baseGame;
    }
   public void ekle(Gamer gamer){
       System.out.println("Eklendi:"+this.baseGame.add(gamer));
   }


}
