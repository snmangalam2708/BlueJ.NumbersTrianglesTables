


public class NumberUtilities {

    public static String getRange(int stop) {
        int i;
        String c1 = "";
        for (i=0; i<stop; i++)
        {
            c1+=i;
        }
        
        return c1;
    }

    public static String getRange(int start, int stop) {
        int i;
        String c2 = "";
        for (i=start; i<stop; i++)
        {
            c2+=i;
        }
        
        return c2;
    }


    public static String getRange(int start, int stop, int step) {
        int i;
        String c3 = "";
        for (i=start; i<stop; i=i+step)
        {
            c3+=i;
        }
        
        return c3;
    }

    public static String getEvenNumbers(int start, int stop) {
        int i;
        String c4 = "";
        for (i=start; i<stop; i++)
        {
            if (i%2==0){
            c4+=i;
          }
        
        }
        
        return c4;
    }


    public static String getOddNumbers(int start, int stop) {
        int i;
        String c5 = "";
        for (i=start; i<stop; i++)
        {
            if (i%2!=0){
            c5+=i;
          }
        
        }
        
        return c5;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
       int i;
        String c6 = "";
        for (i=start; i<=stop; i++)
        {
           c6+=(int)Math.pow(i,exponent);
        }
       
        return c6;
    }
}
