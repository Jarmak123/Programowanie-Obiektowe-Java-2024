package delegates;

public class Player {
    Weapon bron;
    // private String klasa;

    public Player(Weapon bron){
        this.bron = bron;
    }

    public void zaatakuj(){
        bron.attack();
    }

}
