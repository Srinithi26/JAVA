public class Meth1{
    static int a=0;
    int b=0;
    void add(){
        a++;
        b++;
    }
    public static void main(String[] args) {
        Meth1 abc =new Meth1();
        Meth1 def=new Meth1();
        abc.add();
        def.add();
        System.out.println(a+""+def.b);
    }
}

