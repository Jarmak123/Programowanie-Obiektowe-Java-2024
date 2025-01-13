package delegates;

public class Dagger implements Weapon{
    @Override
    public void attack() {
        System.out.println("Zaatakowano sztyletem");
    }
}
