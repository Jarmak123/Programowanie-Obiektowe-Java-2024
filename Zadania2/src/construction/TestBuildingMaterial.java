package construction;

public class TestBuildingMaterial {
    public static void main(String[] args) {
        BuildingMaterial bm = new BuildingMaterial("Beton","Wysoki",4);

        System.out.println(BuildingMaterial.isSufficientQuantity(bm));
        System.out.println(bm.isSufficientQuantity());

    }
}
