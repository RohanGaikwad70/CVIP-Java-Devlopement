import java.util.Scanner;



public class BMICalculator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double weight,height, BMI;

        System.out.println("Enter weight in Kg");
        weight=input.nextDouble();

        System.out.println("Enter height in Meter");
        height=input.nextDouble();

        BMI=weight/(height*height);
        System.out.println(" Youur Body Mass Index is : "+BMI);

        if(BMI<18.5){
            System.out.println("You are Under weight");

        }
        if(BMI>18.5 && BMI<24.9){
            System.out.println("Your are Normal");
        }
       if(BMI>25 && BMI<29.9){
        System.out.println("You are  Overweight");
       }
       if(BMI>=30){
        System.out.println("You are Obese");
       }

    }
}
	