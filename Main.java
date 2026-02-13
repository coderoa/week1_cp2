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


////Problem 4
//void main(){

//    Scanner input = new Scanner(System.in);


// }


//public static int indexOfSmallestElement(double[] array){

//    int index = 0;
//    double min = array[0];
//    for(int i; i<array.length;i++){
//        if(array[i]<min){
//            min=array[i];
//            index=i;
//        }
//    }
//    return index;
// }



////Problem 5
//void main(){
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter a string: ");
//    String text = input.nextLine();
//    System.out.println(sort(text));
//}
//
//public static String sort(String s){
//    char[] chars = s.toCharArray();
//    for(int i=0;i<chars.length-1;i++){
//        for(int j=i+1;j<chars.length;j++){
//            if(chars[i] > chars[j]){
//                char temp = chars[i];
//                chars[i] = chars[j];
//                chars[j] = temp;
//            }
//        }
//    }
//    return new String(chars);
//}



////Problem 6
//void main(){
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter the number of values: ");
//    int size = input.nextInt();
//    int[] values = new int[size];
//    System.out.print("Enter the values: ");
//    for(int i=0;i<size;i++){
//        values[i] = input.nextInt();
//    }
//    if(isConsecutiveFour(values)){
//        System.out.println("The list has consecutive fours");
//    }else{
//        System.out.println("The list has no consecutive fours");
//    }
//}
//
//public static boolean isConsecutiveFour(int[] values){
//    for(int i=0;i<values.length-3;i++){
//        if(values[i]==values[i+1] && values[i]==values[i+2] && values[i]==values[i+3]){
//            return true;
//        }
//    }
//    return false;
//}



////Problem 7
//void main(){
//    Scanner input = new Scanner(System.in);
//    int[] arr = new int[10];
//    System.out.print("Enter 10 integers: ");
//    for(int i=0;i<10;i++){
//        arr[i] = input.nextInt();
//    }
//    int[] unique = removeDuplicates(arr);
//    System.out.print("Unique: ");
//    for(int i=0;i<unique.length;i++){
//        System.out.print(unique[i]+" ");
//    }
//}
//
//public static int[] removeDuplicates(int[] arr){
//    int[] temp = new int[arr.length];
//    int count = 0;
//    for(int i=0;i<arr.length;i++){
//        boolean found = false;
//        for(int j=0;j<count;j++){
//            if(arr[i]==temp[j]){
//                found = true;
//                break;
//            }
//        }
//        if(!found){
//            temp[count] = arr[i];
//            count++;
//        }
//    }
//    int[] result = new int[count];
//    for(int i=0;i<count;i++){
//        result[i] = temp[i];
//    }
//    return result;
//}



////Problem 8
//void main(){
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter a string: ");
//    String text = input.nextLine();
//    System.out.println("Vowels: "+countVowels(text));
//    System.out.println("Consonants: "+countConsonants(text));
//}
//
//public static int countVowels(String s){
//    int count = 0;
//    s = s.toLowerCase();
//    for(int i=0;i<s.length();i++){
//        char ch = s.charAt(i);
//        if(Character.isLetter(ch) && (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
//            count++;
//        }
//    }
//    return count;
//}
//
//public static int countConsonants(String s){
//    int count = 0;
//    s = s.toLowerCase();
//    for(int i=0;i<s.length();i++){
//        char ch = s.charAt(i);
//        if(Character.isLetter(ch) && !(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
//            count++;
//        }
//    }
//    return count;
//}



////Problem 9
//void main(){
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter size: ");
//    int size = input.nextInt();
//    int[] arr = new int[size];
//    System.out.print("Enter values: ");
//    for(int i=0;i<size;i++){
//        arr[i] = input.nextInt();
//    }
//    System.out.print("Enter k: ");
//    int k = input.nextInt();
//    int[] rotated = rotateLeft(arr,k);
//    System.out.print("Rotated: ");
//    for(int i=0;i<rotated.length;i++){
//        System.out.print(rotated[i]+" ");
//    }
//}
//
//public static int[] rotateLeft(int[] arr, int k){
//    int n = arr.length;
//    int[] result = new int[n];
//    k = k % n;
//    for(int i=0;i<n;i++){
//        result[i] = arr[(i+k)%n];
//    }
//    return result;
//}



////Problem 10
//void main(){
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter a credit card number: ");
//    String inputNumber = input.nextLine();
//    String cleaned = cleanNumber(inputNumber);
//    System.out.println("Type: "+getCardType(cleaned));
//    System.out.println("Masked: "+mask(cleaned));
//    if(isValid(cleaned)){
//        System.out.println("Status: Valid");
//    }else{
//        System.out.println("Status: Invalid");
//    }
//}
//
//public static String cleanNumber(String input){
//    return input.replaceAll("[ -]","");
//}
//
//public static boolean isValid(String number){
//    if(number.length()<13 || number.length()>16){
//        return false;
//    }
//    if(getCardType(number).equals("Unknown")){
//        return false;
//    }
//    int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
//    return sum % 10 == 0;
//}
//
//public static int sumOfDoubleEvenPlace(String number){
//    int sum = 0;
//    for(int i=number.length()-2;i>=0;i-=2){
//        int digit = (number.charAt(i)-'0')*2;
//        sum += getDigit(digit);
//    }
//    return sum;
//}
//
//public static int getDigit(int number){
//    if(number<10){
//        return number;
//    }else{
//        return number/10 + number%10;
//    }
//}
//
//public static int sumOfOddPlace(String number){
//    int sum = 0;
//    for(int i=number.length()-1;i>=0;i-=2){
//        sum += number.charAt(i)-'0';
//    }
//    return sum;
//}
//
//public static boolean prefixMatched(String number, String d){
//    return number.startsWith(d);
//}
//
//public static String getCardType(String number){
//    if(prefixMatched(number,"4")){
//        return "Visa";
//    }else if(prefixMatched(number,"5")){
//        return "MasterCard";
//    }else if(prefixMatched(number,"37")){
//        return "AmEx";
//    }else if(prefixMatched(number,"6")){
//        return "Discover";
//    }else{
//        return "Unknown";
//    }
//}
//
//public static String mask(String number){
//    String masked = "";
//    for(int i=0;i<number.length()-4;i++){
//        masked += "*";
//    }
//    masked += number.substring(number.length()-4);
//    return masked;
//}














