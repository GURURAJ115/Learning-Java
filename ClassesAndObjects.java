class Calculator{
    int a ;
    public int add(int n1, int n2){
        int r = n1+n2;
        return r;
    }
    public void nothing(){
        System.out.println("nothing");
    }
}
public class ClassesAndObjects {

    public static void main(String[] args) {
        int num1=5;
        int num2=6;
        Calculator calc= new Calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);
        calc.nothing();
    }
}