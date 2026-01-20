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

//        int a = 10;
//        int b = 5;
//        int c = 15;
//
//        if (a > b) {
//            if (a > c) {
//                System.out.println("Maximum number is: " + a);
//            } else {
//                System.out.println("Maximum number is: " + c);
//            }
//        } else {
//            if (b > c) {
//                System.out.println("Maximum number is: " + b);
//            } else {
//                System.out.println("Maximum number is: " + c);
//            }
//        }


// You are given four numbers , find the maximum number (using nested if ).


//       int a = 100;
//       int b = 20;
//       int c = 15;
//       int d = 25;
//
//       if(a > b){
//           if(a > c){
//               if(a > d){
//                   System.out.println("Maximum number is: " + a);
//               }else {
//                   System.out.println("Maximum number is: " + d);
//               }
//           }
//           else{
//               if(c > d){
//                   System.out.println("Maximum number is: " + c);
//               }else{
//                   System.out.println("Maximum number is: " +d);
//               }
//           }
//       }
//
//       else{
//           if(b>c){
//               if(b>d){
//                   System.out.println("Maximum number is:" + b);
//               }
//               else {
//                   System.out.println("Maximum number is:" +d);
//               }
//           }
//           else{
//               if(c>d){
//                   System.out.println("Maximum number is:" +c);
//               }
//               else {
//                   System.out.println("Maximum number is:" +d);
//               }
//           }
//       }



       // Ternary Operator
      // condition ? expression1 : expression2;

//        int a = 12;
//        int b = 24;
//        int c = 20;
//        int max = 0;
//
//        max = a > b ? a > c ? a : c : b > c ? b : c ;
//
//        System.out.println("value of max is : " +max);



// UseCase of logical operators

        int time = 12;

        if(time >= 10 && time <= 20){
            System.out.println("Office is open ");
        }else{
            System.out.println("Office is closed");
        }


        if(time == 12 || time == 18){
            System.out.println("Time to eat");
        }else{
            System.out.println("Time for work");
        }

    }
}