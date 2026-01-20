package conditionalStatement;

public class IfElse {
    public static void main(String[] args) {
//        int age = 10;
//        if(age >=18){
//            System.out.println("Eligible for vote casting ");
//
//        }else {
//            System.out.println("Not eligible age < 18");
//        }



//        int day = 3;
//        if(day == 1){
//            System.out.println("Go to home ");
//        } else if (day == 3) {
//            System.out.println("Go for Meeting");
//
//        } else{
//            System.out.println("Go to office");
//        }


        // You are given three numbers , find the maximum number


        int a = 12;
        int b = 6;
        int c = 9;

        if(a>b) {
            System.out.println(" a is Greater than b");
            if (a>c) {
                System.out.println(" a is Greater than c");
            }
                else {
                    System.out.println(" c is Maximum");
                }
        } else  {
            System.out.println("b is bigger than a");
            if(b > c){
                System.out.println("b is bigger than c");
            }
            
        }


    }
}
