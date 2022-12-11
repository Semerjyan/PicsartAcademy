import java.util.Scanner;

//public class HomeWork {
//
//    public static void main(String[] args) {

////        Մուտքագրել թիվ, ստուգել արդյոք թիվը զույգ է, թե ոչ։ Տպել էկրանին ստուգման արդյունքը։
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter any number you want");
//        int number = scan.nextInt();
//
//       String result = number % 2 == 0 ? "You enter EVEN number" : "You enter ODD number";
//       System.out.println(result);

////        Մուտքագրել օգտագործողի անունն ու տարիքը։ Տպել էկրանին ողջույնի հաղորդագրություն։
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = scan.next();
//        System.out.println("Enter your age");
//        int age = scan.nextInt();
//
//            System.out.println("Ողջունում ենք " + age + "-ամյա " + name + "'ին");

////        Մուտքագրել num փոփոխականը որպես int եւ օգտագործողի անունը։ Տպել անունը էկրանին num անգամ։
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any number you want");
//        int num = scan.nextInt();
//        System.out.println("Enter your name");
//        String name = scan.next();
//        int i = 0;
//
//        while ( i < num ) {
//            System.out.println(name);
//            i++;
//        }

////        Տպել 0-100 միջակայքի միայն կենտ թվերը
//            System.out.println("The Odd Numbers are:");
//            for (int i = 1; i <= 100; i++) {
//                if (i % 2 != 0) {
//                    System.out.println(i + " ");
//                }
//            }

////        Տպել 0-100 միջակայքի միայն զույգ թվերը
//            System.out.println("The Even Numbers are:");
//            for (int i = 1; i <= 100; i++) {
//                if (i % 2 == 0) {
//                    System.out.println(i + " ");
//                }
//            }

////       Հայտարարել եւ մուտքագրել երկու փոփոխականներ։ Փոխել փոփոխականների արժեքները տեղերով եւ տպել էկրանին։
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any number you want");
//        int x = scan.nextInt();
//        System.out.println("One mor time, enter any number you want");
//        int y = scan.nextInt();
//        x = x + y;
//        y = x - y;
//        x = x - y;
//
//            System.out.println(x+" "+y);

////        Մուտքագրել թիվ։ Եթե թիվը զույգ է, տպել 0-100 թվերն ըստ աճման, հակառակ դեպքում՝ ըստ նվազման։
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any number you want");
//        int x = scan.nextInt();
//
//        if (x % 2 == 0) {
//            for (x = 0; x <= 100; x++)
//            System.out.println(x);
//        }
//        else {
//            for (x = 100; x >= 0; x--)
//            System.out.println(x);
//        }

////        Տպել 0-100 թվերի քառակուսիների արժեքները էկրանին։
//        for (int i = 100; i >= 0; --i) {
//            System.out.println(i*i);
//        }

////        Տպել 0-100 թվերը ըստ աճման (օգտագործելով ցիկլ)։
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }

////       Մուտքագրել չորս փոփոխականներ, տպել նվազագույնի արժեքը, եթե չորս փոփոխականների գումարը հավասար է զրոյի։
////                                գիտեմ, որ Scanner'ի մասը կարող եմ օպտիմիզացնել։ Դեռ չեմ հասցրել դա անել
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter any number you want");
//            int one = scan.nextInt();
//            System.out.println("Enter any number you want one more time");
//            int two = scan.nextInt();
//            System.out.println("Enter any number you want one more time");
//            int three = scan.nextInt();
//            System.out.println("Enter any number you want last time");
//            int four = scan.nextInt();
//
//            if (one + two + three + four == 0) {
//                int[] arr = new int[]{one, two, three, four};
//                int small = arr[0];
//                for (int i = 1; i < arr.length; i++) {
//                    if (arr[i] < small){
//                        small = arr[i];
//                    }
//                }
//                System.out.println(small);
//            }
//                else {
//                    System.out.println("Sum is not 0");
//        }

////        Մուտքագրել տող, տպել տողը էկրանին հակառակ կարգով։
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any word");
//        String str = scan.next();
//        char[] chars = str.toCharArray();
//        char[] reverseChars = new char[chars.length];
//
//        for (int i = 0; i < chars.length; i++) {
//            reverseChars[reverseChars.length - 1 - i] = chars[i];
//        }
//        System.out.println(reverseChars);

////        Հայտարարել բուլյան փոփոխականներ տարբեր արժեքներով։ Տպել էկրանին AND եւ OR գործողությունների արդյունքները։
//
//        int x = 1;
//        int y = 2;
//
//        System.out.println((x == 1) && (y == 1)); //false
//        System.out.println((x == 1) && (y == 2)); //true
//
//        System.out.println((x == 1) || (y == 1 )); //true
//        System.out.println((x == 2) || (y == 1 )); //false

////        Տպել 100-0 թվերը ըստ նվազման։
//        for (int i = 100; i >= 0; --i) {
//            System.out.println(i);
//        }

//    }
//}