public class StaticKeyword {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.schoolName = "MVJ";
        Stud s2 = new Stud();
        System.out.println(s2.schoolName);
        // When static no need to define again and again
        // Once changed changes for everything

    }
}
class Stud{
    String name;
    int roll;

    static String schoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}