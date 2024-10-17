//Wap to BMI (BODY MASS INDEX)
//FORMULA FOR BMI: BMI=WEIGHTS(KG)/HEIGHT^2

import java.util.*;
public class Challenge2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("BOD MASS INDEX CALCULATOR");
        System.out.println("Enter your  weight in kgs");
        int weight = sc.nextInt();
        System.out.println("Enter your  heights in cm");
        int heightcm = sc.nextInt();
        int heightm = heightcm/100;
        float BMI = weight/heightm*heightm;
        System.out.println("Your Body Mass Index is "+BMI);
    }
}
