public class Pattern3{
    public static void main(String[] args) {
        pattern(5);
    }static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1; col<=n-row+1;col++){
                  System.out.print("*");
            }System.out.println();
            
        }
    }
}


/*
public class Pattern3{
    public static void main(String[] args) {
        pattern(5);
    }static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(n);               // it only prints n value that is 5

            }System.out.println();
        }
    }
}



/*public class Pattern3{
    public static void main(String[] args) {
        pattern(5);
    }static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){                  // it prints only the row values
                System.out.print(row);

            }System.out.println();
        }
    }
}


/*public class Pattern3{
    public static void main(String[] args) {
        pattern(5);
    }static void pattern(int n){                      // it prints the column values9
 
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);

            }System.out.println();
        }
    }
}*/






