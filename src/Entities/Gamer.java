package Entities;

public class Gamer {
    private int id;
    private String name;
    private String email;
    private String password;
    private Game game;

    public Gamer(int id, String name, String email, String password, Game game) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
