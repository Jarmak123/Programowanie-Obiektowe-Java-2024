package culinary;

public class TestKitchen {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen("Kuchnia z Ikei",new Stove("Indukcyjne","Beko",24379823));
        Kitchen kitchen_c = null;

        kitchen_c = (Kitchen) kitchen.clone();

        System.out.println(kitchen);
        System.out.println(kitchen_c);
    }
}
