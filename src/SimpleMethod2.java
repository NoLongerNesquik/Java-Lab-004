import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int s1) {
        return s1*s1;
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        System.out.println("The integer you would like squared is:");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        int output = square(input);
        // Put the result System.out code here.
        System.out.printf("If the integer %d was squared, you would get %d.", input, output);
    }
}
