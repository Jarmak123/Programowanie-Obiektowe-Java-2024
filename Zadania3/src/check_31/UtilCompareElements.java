package check_31;

public class UtilCompareElements {
    public static <T extends Comparable<T>> int compareElements(T a, T b){
        if(a.compareTo(b)>0)
        {
            return -5;
        }
        else if(a.compareTo(b)<0)
        {
            return 5;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        Book bk1 = new Book("Astrologia","Zenek M.");
        Book bk2 = new Book("Bekasy - ptaki","Ambroży Grande");
        Book bk3 = new Book("Astrologia","Zenek M.");

        System.out.println(compareElements(bk1,bk2));
        System.out.println(compareElements(bk1,bk3));
    }
}
