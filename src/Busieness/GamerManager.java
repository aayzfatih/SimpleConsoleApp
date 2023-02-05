package Busieness;

import Entities.Gamer;
import Games.BaseGame;

public class GamerManager {
    private BaseGame baseGame;

    public GamerManager(BaseGame baseGame) {
        this.baseGame = baseGame;
    }

    public void ekle(Gamer gamer) {
        System.out.println("Eklendi:" + this.baseGame.add(gamer));
    }
    public void sil(Gamer gamer) {
        System.out.println("Silindi:" + this.baseGame.remove(gamer));
    } public void update(Gamer gamer) {
        System.out.println("Guncellendi:" + this.baseGame.add(gamer));
    }



}
