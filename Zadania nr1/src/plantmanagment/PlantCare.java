package plantmanagment;

import java.util.Objects;

public class PlantCare {
    private String plantName;
    private String careDate;
    private Species species;
    private int waterAmount;

    public PlantCare(String plantName, String careDate, Species species, int waterAmount) {
        if (plantName == null) {
            plantName = "";
        }
        if (careDate == null) {
            careDate = "";
        }
        if (waterAmount < 0) {
            waterAmount = 0;
        }
        this.plantName = plantName;
        this.careDate = careDate;
        this.species = species;
        this.waterAmount = waterAmount;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        if(plantName==null)
        {
            plantName="";
        }
        this.plantName = plantName;
    }

    public String getCareDate() {
        return careDate;
    }

    public void setCareDate(String careDate) {
        if(careDate==null)
        {
            careDate="";
        }
        this.careDate = careDate;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(int waterAmount) {
        if(waterAmount<0)
        {
            waterAmount=0;
        }
        this.waterAmount = waterAmount;
    }

    @Override
    public String toString() {
        return "PlantCare{" +
                "plantName='" + plantName + '\'' +
                ", careDate='" + careDate + '\'' +
                ", species=" + species +
                ", waterAmount=" + waterAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlantCare plantCare = (PlantCare) o;
        return waterAmount == plantCare.waterAmount && Objects.equals(plantName, plantCare.plantName) && Objects.equals(careDate, plantCare.careDate) && Objects.equals(species, plantCare.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plantName, careDate, species, waterAmount);
    }
}
