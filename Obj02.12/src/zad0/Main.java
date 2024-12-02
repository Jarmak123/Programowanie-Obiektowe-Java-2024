package zad0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WorkTool> workTools = new ArrayList<>();

        workTools.add(new Hammer("młotek",2024));
        workTools.add(new Screwdriver("śrubokręt płaski",2004));
        workTools.add(new Screwdriver("śrubokręt krzyżak",2019));
        workTools.add(new Saw("piła do drewna",2124));
        workTools.add(new Saw("piła do metalu",2024));

        for(WorkTool wt: workTools){
            wt.use();
        }

        WorkTool lyzka = new WorkTool("łyżka", 1881) {
            @Override
            public void use() {
                System.out.println("Nałożono zupę na łyżkę");
            }
        };

        lyzka.use();
        System.out.println(lyzka);


        zad0.Hammer mlotek = new zad0.Hammer("młotek", 2024);
        mlotek.use();
    }
}
