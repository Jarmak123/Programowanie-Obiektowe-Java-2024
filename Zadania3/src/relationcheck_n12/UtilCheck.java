package relationcheck_n12;

public class UtilCheck {
    public static <V extends Comparable<V>> void check(V[] arr, V element){
        if(arr==null || arr.length==0 || element==null) throw new IllegalArgumentException("Argument nie moze byc pusty");
        for(V i: arr)
        {
            if(i.compareTo(element)>=0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] inty = new Integer[3];
        inty[0]=0;
        inty[1]=1;
        inty[2]=2;

        check(inty,1);

    }
}
