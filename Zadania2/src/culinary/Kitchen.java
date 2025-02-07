package culinary;

public class Kitchen implements Cloneable{
    public String name;
    public Stove stove;

    public Kitchen(String name, Stove stove) {
        this.name = name;
        this.stove = stove;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "name='" + name + '\'' +
                ", stove=" + stove +
                '}';
    }

    @Override
    public Kitchen clone() {
        try {
            Kitchen clone = (Kitchen) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
