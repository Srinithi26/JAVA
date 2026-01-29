public class Student{

    static String  CollegeName="Kongunadu college of engineering and technology";
    static String  Department="CSE";

    int Reg(int RegisterNumber){
        return RegisterNumber;

    }
    String Name(String NameOfTheStudent){
        return NameOfTheStudent;
    }
    int age(int Age){
        return Age;

    }
    public static void main(String[] args) {
    Student s2 = new Student();
    Student s1 = new Student();
    Student s3 = new Student();
    s1.Reg(23);
    s2.Name("Sri");
    s3.age(22);
    
    //System.out.println("Name"+ NameOfTheStudent +"Age"+Age+"College"+CollegeName +RegisterNumber);

}

}