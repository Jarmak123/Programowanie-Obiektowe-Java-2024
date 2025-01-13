package delegates;

public class Wand implements Weapon{

    @Override
    public void attack() {
        System.out.println("Rzucono czar");
    }
}
