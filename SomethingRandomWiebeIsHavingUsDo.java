
/**
 * Write a description of class SomethingRandomWiebeIsHavingUsDo here.
 * 
 * @author Kevin_Nower
 * @version 3/9/16
 */
public class SomethingRandomWiebeIsHavingUsDo
{
    public static void descending(int n) {
        for(int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
    
    public static int factorial(int n) {
        
        if(n==1) {
            return 1;
        }
        
        else {
            return n*factorial(n-1);
        }
    }
}
