import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        System.out.println("hello nikhil");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("enter your name"+ name);
        System.out.println("enter your height in m : ");
        float height= input.nextFloat();
        System.out.println("enter your weight in kgs : ");
        float weight= input.nextFloat();
        System.out.println("enter number of days you workout : ");
        float days= input.nextInt();
        float BMI= weight/(height*height);
        System.out.println("HEY"+ name + "your height is" + height + "and your weight is" + weight + "so your BMI is " + BMI);
    }
}