package construction;

public class BuildingMaterial {
    public String materialType;
    public String qualityType;
    public int quantityInStock;

    public BuildingMaterial(String materialType, String qualityType, int quantityInStock) {
        this.materialType = materialType;
        this.qualityType = qualityType;
        this.quantityInStock = quantityInStock;
    }

    public static boolean isSufficientQuantity(BuildingMaterial element){
        return element != null && (element.quantityInStock > 100);
    }

    public boolean isSufficientQuantity(){
        return(this.quantityInStock>100);
    }

}
