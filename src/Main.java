
import java.util.Scanner;
void main(){


    //Problem 3
//    float height = 7.9f;
//    float width = 4.5f;
//    float area = height*width;
//    float perimeter = 2*(height+width);
//    System.out.println("The area="+area);
//    System.out.println("Perimeter="+perimeter);


    //Problem 4
//    Scanner input = new Scanner(System.in);
//    float radius = input.nextFloat();
//    float length = input.nextFloat();
//
//    float area = radius * radius * 3.14159f;
//    float volume = area * length;
//
//    System.out.println("The area is " + area);
//    System.out.println("The volume is " + volume);

    //Problem 5
//    Scanner input = new Scanner(System.in);
//    float side = input.nextFloat();
//    float length = input.nextFloat();
//
//    float area = (float)(Math.sqrt(3) / 4) * (side * side);
//    float volume = area * length;
//
//    System.out.printf("The area is %.2f\n", area);
//    System.out.printf("The volume of the Triangular prism is %.2f\n", volume);

        //Problem 6
//    Scanner input = new Scanner(System.in);
//    float mealCost = input.nextFloat();
//
//    float tax = mealCost * 0.08f;
//    float tip = mealCost * 0.18f;
//    float total = mealCost + tax + tip;
//
//    System.out.printf("Tax: %.2f\n", tax);
//    System.out.printf("Tip: %.2f\n", tip);
//    System.out.printf("Total: %.2f\n", total);
//

    //Problem 7
//    Scanner input = new Scanner(System.in);
//
//    float distance = input.nextFloat();
//    float mpg = input.nextFloat();
//    float pricePerGallon = input.nextFloat();
//
//    float cost = (distance / mpg) * pricePerGallon;
//
//    System.out.printf("The cost of driving is $%.2f\n", cost);

    //Problem 8
//    Scanner input = new Scanner(System.in);
//    int number = input.nextInt();
//
//    int d1 = number / 1000;
//    int d2 = (number / 100) % 10;
//    int d3 = (number / 10) % 10;
//    int d4 = number % 10;
//
//    int sum = d1 + d2 + d3 + d4;
//
//    System.out.println(d1 + "+" + d2 + "+" + d3 + "+" + d4 + "=" + sum);

    //Problem 9
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    int smallest = Math.min(a, Math.min(b, c));
    int largest = Math.max(a, Math.max(b, c));
    int middle = (a + b + c) - smallest - largest;

    System.out.println(smallest + " " + middle + " " + largest);

}
