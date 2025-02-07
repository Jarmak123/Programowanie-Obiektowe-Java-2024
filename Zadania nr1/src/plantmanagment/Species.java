package plantmanagment;

import com.sun.jdi.CharType;

import java.util.Objects;

public class Species {
    private String name;
    private String habitat;
    private int wateringFrequency;
    private int sunlightRequirement;

    public Species(String name, String habitat, int wateringFrequency, int sunlightRequirement) {
        if(name==null)
        {
            name="";
        }
        if(habitat==null)
        {
            habitat="";
        }
        if(wateringFrequency<0)
        {
            wateringFrequency=0;
        }
        if(sunlightRequirement<0)
        {
            sunlightRequirement=0;
        }
        this.name = name;
        this.habitat = habitat;
        this.wateringFrequency = wateringFrequency;
        this.sunlightRequirement = sunlightRequirement;
    }

    public String getName() {
        if(name==null)
        {
            name="";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if(habitat==null)
        {
            habitat="";
        }
        this.habitat = habitat;
    }

    public int getWateringFrequency() {
        return wateringFrequency;
    }

    public void setWateringFrequency(int wateringFrequency) {
        if(wateringFrequency<0)
        {
            wateringFrequency=0;
        }
        this.wateringFrequency = wateringFrequency;
    }

    public int getSunlightRequirement() {
        return sunlightRequirement;
    }

    public void setSunlightRequirement(int sunlightRequirement) {
        if(sunlightRequirement<0)
        {
            sunlightRequirement=0;
        }
        this.sunlightRequirement = sunlightRequirement;
    }

    @Override
    public String toString() {
        return "Species{" +
                "name='" + name + '\'' +
                ", habitat='" + habitat + '\'' +
                ", wateringFrequency=" + wateringFrequency +
                ", sunlightRequirement=" + sunlightRequirement +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Species species = (Species) o;
        return wateringFrequency == species.wateringFrequency && sunlightRequirement == species.sunlightRequirement && Objects.equals(name, species.name) && Objects.equals(habitat, species.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, habitat, wateringFrequency, sunlightRequirement);
    }
}
