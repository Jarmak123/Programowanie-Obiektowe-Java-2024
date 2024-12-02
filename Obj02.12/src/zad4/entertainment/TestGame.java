package zad4.entertainment;

import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {
        ArrayList<Game> tab = new ArrayList<>();
        tab.add(new AdventureGame());
        tab.add(new AdventureGame());
        tab.add(new AdventureGame());
        tab.add(new StrategyGame());
        tab.add(new StrategyGame());

        for(Game gg: tab)
        {
            System.out.println(gg.getRating());
        }
    }
}
