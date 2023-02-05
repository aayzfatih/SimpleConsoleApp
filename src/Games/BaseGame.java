package Games;

import Entities.Gamer;

public interface BaseGame {
    public String add(Gamer gamer);
    public String remove(Gamer gamer);
    public String update(Gamer gamer);
}
