package delegates;

public class Sword implements Weapon{
    @Override
    public void attack() {
        System.out.println("Zaatakowano mieczem");
    }
}
