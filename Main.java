////Problem 1
//import java.util.Scanner;
//void main(){
//    Scanner input = new Scanner(System.in);
//    String text;
//    text = input.nextLine();
//    System.out.println(reverse(text));
//}
//
//public static String reverse(String s){
//    String reversed="";
//    for(int i=s.length()-1; i>=0; i--){
//        reversed += s.charAt(i);
//    }
//    return reversed;
//}


////Problem 2
//void main(){
//    Scanner input = new Scanner(System.in);
//
//    String text;
//    char character;
//
//    System.out.print("Enter a text a: ");
//    text = input.nextLine();
//
//    System.out.print("Enter a character: ");
//    character = input.next().charAt(0);
//
//    System.out.println(count(text, character));
//
//}
//
//public static int count(String text, char character){
//    int counter=0;
//    for (int i=0; i<text.length();i++){
//        if(text.charAt(i) == character){
//            counter++;
//        }
//    }
//
//    return counter;
//}



////Problem 3
//
//void main(String[] args){
//    if (args.length==0){
//        System.out.println("you did not enter any text!");
//        return;
//    }
//
//    int uppercasecounter =0 ;
//    int lowercasecounter = 0;
//    String text = String.join(" ", args);
//    for (int i=0; i<text.length(); i++){
//        char ch = text.charAt(i);
//        if (Character.isUpperCase(ch)){
//            uppercasecounter++;
//        }
//        else if(Character.isLowerCase(ch)){
//            lowercasecounter++;
//        }
//    }
//    System.out.println("in your text "+text+". There are ");
//    System.out.println("Uppercase letters: "+uppercasecounter);
//    System.out.println("Lowercase letters: "+lowercasecounter);
//
//}


//Problem 4
void main(){

    Scanner input = new Scanner(System.in);


}


public static int indexOfSmallestElement(double[] array){

    int index = 0;
    double min = array[0];
    for(int i; i<array.length;i++){
        if(array[i]<min){
            min=array[i];
            index=i;
        }
    }
    return index;
}
















