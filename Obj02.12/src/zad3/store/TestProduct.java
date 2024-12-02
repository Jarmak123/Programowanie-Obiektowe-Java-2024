package zad3.store;

public class TestProduct {
    public static void main(String[] args) {
        Product tab[] = new Product[5];

        tab[0]=new Book();
        tab[1]=new Book();
        tab[2]=new Clothing();
        tab[3]=new Clothing();
        tab[4]=new Clothing();

        for(int i=0; i<5;i++)
        {
            System.out.println(tab[i].getPrice());
        }
    }
}
