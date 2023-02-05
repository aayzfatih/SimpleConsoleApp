package Busieness;

import Entities.Gamer;
import Games.BaseGame;

public class GamerMethods implements BaseGame {
    @Override
    public String add(Gamer gamer) {
        return gamer.getName();

    }

    @Override
    public String remove(Gamer gamer) {
        return gamer.getName();

    }

    @Override
    public String update(Gamer gamer) {
        return gamer.getName();

    }
}
