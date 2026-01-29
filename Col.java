public class Col {
    static String CollegeName="Kongunadu college of engineering and technology ";
    static String Department = "CSE";
    
     static int Det( int RegisterNumber){
            return RegisterNumber;
      
    }
    static String Nam(String Name){
            return Name;
    }
    static void fin(){
        int res=Det(113);
        String res1=Nam("Sri");
        System.out.println(res);
        System.out.println(res1);
        System.out.println(Department);
        System.out.println(CollegeName);
    }
     static void fin1(){
        int res=Det(134567813);
        String res1=Nam("Syui");
        System.out.println(res);
        System.out.println(res1);
        System.out.println(Department);
        System.out.println(CollegeName);
    }
     static void fin2(){
        int res=Det(7890143);
        String res1=Nam("Si");
        System.out.println(res);
        System.out.println(res1);
        System.out.println(Department);
        System.out.println(CollegeName);
    }
     static void fin3(){
        int res=Det(123);
        String res1=Nam("qwe");
        System.out.println(res);
        System.out.println(res1);
        System.out.println(Department);
        System.out.println(CollegeName);
    }
     static void fin4(){
        int res=Det(79);
        String res1=Nam("nisha");
        System.out.println(res);
        System.out.println(res1);
        System.out.println(Department);
        System.out.println(CollegeName);
    }


    public static void main(String[] args){
        Col a = new Col();
        a.fin();
        a.fin1();
        a.fin2();
        a.fin3();
        a.fin4();
    }
}