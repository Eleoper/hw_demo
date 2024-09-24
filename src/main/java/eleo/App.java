package eleo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(add3toNum(3));
        System.out.println(powerofTwo(3));
        System.out.println(concatString("Hello ", "World"));
        
    }

    public static int add3toNum(int num){
        int total = num + 3;
        return total;
    }
    
    public static int powerofTwo(int num){
        int total = num * num;
        return total;
    }

    public static String concatString(String firstStr, String secondStr){
        String result = "";

        result = firstStr + secondStr;

        return result;
    }
}
