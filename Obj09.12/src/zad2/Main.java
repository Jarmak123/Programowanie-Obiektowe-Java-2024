package zad2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> clt = new ArrayList<>();
        clt.add(new Client("Alberto",1, Date.valueOf("2024-03-12")));
        clt.add(new Client("Marta",2, Date.valueOf("2022-03-12")));
        clt.add(new Client("Sherlock",3, Date.valueOf("2023-03-12")));
        clt.add(new Client("Antonio",4, Date.valueOf("2021-03-12")));
        clt.add(new Client("Klemens",5, Date.valueOf("2020-03-12")));

        System.out.println(clt);
        Collections.sort(clt);
        System.out.println(clt);
    }
}
