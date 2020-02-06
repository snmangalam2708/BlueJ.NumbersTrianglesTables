public class TableUtilities {
    public static String getSmallMultiplicationTable() {
      String ftable1 = "";
        for(int i=1; i <= 5; i++){
            for(int j=1; j <= 5; j++) {
                int m = i * j;
                if (m < 10)
                {
                    ftable1 += "  " + m + " |";
                }
                else if (m < 100 && m > 9)
                {
                    ftable1 += " " + m + " |";
                }
                else
                {
                    ftable1 += "" + m + " |" ;
                }
            }
            ftable1 += "\n" ;
        }
        return ftable1;
    }
    public static String getLargeMultiplicationTable() {
        String ftable2 = "";
        for(int i=1; i <= 10; i++){
            for(int j=1; j <= 10; j++) {
                int m2 = i * j;
                if (m2 < 10)
                {
                    ftable2 += "  " + m2 + " |";
                }
                else if (m2 < 100 && m2 > 9)
                {
                    ftable2 += " " + m2 + " |";
                }
                else
                {
                    ftable2 += "" + m2 + " |" ;
                }
            }
            ftable2 += "\n" ;
        }
        return ftable2;
    }
    public static String getMultiplicationTable(int tableSize) {
        String ftable3 = "";
        for(int i=1; i <= tableSize; i++){
            for(int j=1; j <= tableSize; j++) {
                int m3 = i * j;
                if (m3 < 10)
                {
                    ftable3 += "  " + m3 + " |";
                }
                else if (m3 < 100 && m3 > 9)
                {
                    ftable3 += " " + m3 + " |";
                }
                else
                {
                    ftable3 += "" + m3 + " |" ;
                }
            }
            ftable3 += "\n" ;
        }
        return ftable3;
        }
    }





