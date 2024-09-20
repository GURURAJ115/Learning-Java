package ErrorsAndExceptions;
//Errors:
// 1.compile time 
// 2.Runtime Error - It gives exceptions and we have to handle it.
// 3.Logical Error 
public class Demo {
    public static void main(String[] args) {
        // System.out.printn(); This gives an error which is a syntactical error and you
        // will know it at compile time
        int j = 0;
        int i = 0;

        int nums[] = new int[5];
        String str = null;
        try {
            System.out.println(nums[5]);
            j = 10 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay within array limit");
        } catch (Exception e) {
            System.out.println("Something Went Wrong");
        } // This is the parent classs should be at the end
        System.out.println(j);
        System.out.println("Bye");
    }
}
