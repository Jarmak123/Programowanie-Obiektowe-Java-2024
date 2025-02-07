package plantmanagment;

public class TestPlantCare {
    public static void main(String[] args) {
        Species spec1 = new Species("Żonkil","Las",2,12);
        Species spec2 = new Species("Róża","Ogród",4,8);

        PlantCare pc1 = new PlantCare("Żonkil","12—12—2025",spec1,100);
        PlantCare pc2 = new PlantCare("Róża","12—12—2025",spec2,75);

        System.out.println(pc1.toString());
        System.out.println(pc2.toString());

        System.out.println(pc1.equals(pc2));
        System.out.println(pc1.hashCode());
        System.out.println(pc2.hashCode());


    }
}
