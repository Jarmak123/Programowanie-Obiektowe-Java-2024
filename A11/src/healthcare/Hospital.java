package healthcare;

import java.util.Objects;

public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        if(name==null)
        {
            name="";
        }
        if(capacity<0)
        {
            capacity=50;
        }

        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        if(name==""){
            return Hospital.class+": Name: "+name+". Capacity: "+capacity;
        }
        else
        {
            return Hospital.class+": Capacity: "+capacity;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Double.compare(capacity, hospital.capacity) == 0 && Objects.equals(name, hospital.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
