
//Problem 1
//void main(String[] args){
//    int sum=0;
//    for(String number:args){
//        sum+=Integer.parseInt(number);
//    }
//    System.out.println(sum);



//import java.util.Random;
//Problem 2
//void main(){
//    Random rand = new Random();
//    int radius = rand.nextInt(1,10);
//    double circumference = 2*Math.PI*radius;
//    double area = Math.PI*Math.pow(radius, 2);
//    System.out.printf("Circumference: %.2f%n", circumference);
//    System.out.printf("Area: %.2f%n",area);
//}

//Problem 3
//import java.util.Scanner;
//void main() {
//    Scanner input = new Scanner(System.in);
//    int score = input.nextInt();
//
//    if (score < 0 || score > 100) {
//        System.out.println("Invalid score");
//    } else if (score >= 90) {
//        System.out.println("Grade: A");
//    } else if (score >= 80) {
//        System.out.println("Grade: B");
//    } else if (score >= 70) {
//        System.out.println("Grade: C");
//    } else if (score >= 60) {
//        System.out.println("Grade: D");
//    } else {
//        System.out.println("Grade: F");
//    }
//}


//Problem 4
//
//import java.util.Scanner;
//void main(){
//    Scanner input = new Scanner(System.in);
//    System.out.println("Hello, \nEnter your weight in KG: ");
//    float weight = input.nextFloat();
//    System.out.println("Enter you height in meter");
//    float height = input.nextFloat();
//    float BMI = (float) (weight/Math.pow(height, 2));
//    System.out.println("Your BMI is: "+BMI);
//    if (BMI>30){
//        System.out.println("Obese");
//    }else if(BMI>25 && BMI<29.9){
//        System.out.println("Overweight");
//    }else if(BMI>18.5 && BMI<24.9){
//        System.out.println("Normal weight");
//    }else{
//        System.out.println("Underweight");
//    }
//}

