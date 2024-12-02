package zad0;

import java.time.Year;

public abstract class WorkTool {
    String name;
    int productionYear;

    private WorkTool(){
        this.name="Nardzędzie";
        this.productionYear=Year.now().getValue();

    }

    public WorkTool(String name, int productionYear){
        this.name=name;
        if(productionYear>Year.now().getValue())
        {
            productionYear=Year.now().getValue();
        }
        this.productionYear=productionYear;
    }

    public abstract void use();
}
