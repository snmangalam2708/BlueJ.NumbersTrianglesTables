 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        int i;
        String c1 = "";
        for (i=1; i<=numberOfStars; i++)
        {
            c1+="*";
        }
        
        return c1;
    }
    
    public static String getTriangle(int numberOfRows) {
       int i;
       String c2 = "";
       for (i=1; i<=numberOfRows; i++)
        {
            //c2=c2+"*";
            c2+= getRow(i) + "\n";
            
        }
        
        return c2;
    }


    public static String getSmallTriangle() {
        int i;
       String c3 = "";
       for (i=1; i<=4; i++)
        {
           c3+= getRow(i) + "\n";
            
        }
        
        return c3;
    }

    public static String getLargeTriangle() {
       int i;
       String c4 = "";
       for (i=1; i<=9; i++)
        {
            c4+= getRow(i) + "\n";
            
        }
        
        return c4;
    }
}
