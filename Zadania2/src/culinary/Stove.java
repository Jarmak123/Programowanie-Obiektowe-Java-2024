package culinary;

public class Stove implements Cloneable{
    public String burners;
    public String brand;
    public int serialNumber;

    public Stove(String burners, String brand, int serialNumber) {
        this.burners = burners;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Stove{" +
                "burners='" + burners + '\'' +
                ", brand='" + brand + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }

    @Override
    public Stove clone() {
        try {
            Stove clone = (Stove) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
