package delegates;

public class HealingGun implements Weapon{
    @Override
    public void attack() {
        System.out.println("Leczymy sojusznika");
    }
}
