import java.util.*;
public class FindVelocity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter displacement in meters");
        int disp = sc.nextInt();
        System.out.println("Enter time in sec");
        int time = sc.nextInt();
        float velocity ;
        velocity = disp/time;
        System.out.println("The velocity is "+velocity+" m/s^2 ");
    }
}
