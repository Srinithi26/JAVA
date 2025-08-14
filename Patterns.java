
public class Patterns{
    public static void main(String[] args) {
        pattern(4);  //method call          //java doesnt create an object  of class before calling main    
        }                                    // so inside main you can only call other static methods directly
        static void pattern(int n){    
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                     System.out.print("*");
            }System.out.println();
        } 
    
        }  
}