package printing_m14;

public class UtilPrintIfNotNull {
    public static <T> void printIfNotNull(T[] arr){
        for(T i: arr)
        {
            if(i!=null)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Student[] arr = new Student[4];
        arr[0]= new Student("Jacek",1);
        arr[1]= null;
        arr[2]= new Student("Elsa",3);
        arr[3]= new Student("Magda",2);

        printIfNotNull(arr);
    }
}
