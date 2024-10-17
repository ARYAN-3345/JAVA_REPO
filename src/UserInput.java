import java.util.*;

public class UserInput {
    public static void main(String[] args){
        System.out.print("Enter the valve : ");
        Scanner scan = new Scanner(System.in);
        //int a = scan.nextInt();
        //float a = scan.nextFloat();
       // char ch = scan.next().charAt(0);
        String st = scan.nextLine();
        System.out.println("your entered value is "+st);

    }

}
