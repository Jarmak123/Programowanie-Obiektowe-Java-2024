package zad0;

public class Hammer extends WorkTool{
    public Hammer(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println("Użyto młotka do wbicia gwoździa");
    }
}
