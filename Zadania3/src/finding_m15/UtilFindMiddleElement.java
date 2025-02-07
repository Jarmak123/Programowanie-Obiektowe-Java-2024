package finding_m15;

import pl.progGeneryczne_L33.UtilcountUniqueElements;

public class UtilFindMiddleElement {
    public static <T extends Comparable<T>> T findMiddleElement(T a,T b,T c){
        if(a.compareTo(b)>0)
        {
            if(b.compareTo(c)>0)
            {
                return b;
            }
            else if(a.compareTo(c)>0){
                return c;
            }
            else{
                return a;
            }
        }else{
            if(a.compareTo(c)>0){
                return a;
            }else if(b.compareTo(c)>0){
                return c;
            }else{
                return b;
            }
        }
    }

    public static void main(String[] args) {
        Vehicle a = new Vehicle("F",2000);
        Vehicle b = new Vehicle("D",2000);
        Vehicle c = new Vehicle("G",2000);

        System.out.println(findMiddleElement(a,b,c));
    }
}
