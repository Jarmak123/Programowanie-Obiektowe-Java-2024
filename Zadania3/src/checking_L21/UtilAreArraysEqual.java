package checking_L21;

public class UtilAreArraysEqual {
    public static <T> boolean areArraysEqual(T[] ar1, T[] ar2){
        if(ar1.length!=ar2.length){
            return false;
        }
        for(int i=0; i< ar1.length;i++)
        {
            if(!(ar1[i].equals(ar2[i])))
            {
                return false;
            }
        }
        return true;
    }
}
