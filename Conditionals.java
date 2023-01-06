import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Q1 - Write a program which takes the values of length and breadth from user and check if it is
//        a square or not.
        System.out.println("Enter Length");
        int length = sc.nextInt();
        System.out.println("Enter Breadth");
        int breadth = sc.nextInt();
        if (length == breadth){
            System.out.println("Yes, It is a Square");
        } else {
            System.out.println("No, It is not a Square");
        }

//        Q2 - Write a program to print absolute value of a number entered by the user.
        int num = sc.nextInt();
        if ( num < 0){
            num = num*(-1);
        }
        System.out.println(num);

//        Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
//        calculate Profit or Loss.
        System.out.print("Enter Cost Price: ");
        int costPrice = sc.nextInt();
        System.out.print("Enter Selling Price: ");
        int sellingPrince = sc.nextInt();
        if (costPrice < sellingPrince){
            System.out.println("You make the profit of: "+(sellingPrince-costPrice));
        } else if (costPrice == sellingPrince) {
            System.out.println("You have not make any profit or loss");
        } else {
            System.out.println("You made the loss of: "+(costPrice-sellingPrince));
        }

//        Q4 - Write a program to print positive number entered by the user, if user enters a negative
//        number, it is skipped.
        System.out.print("Enter a Integer: ");
        int number = sc.nextInt();
        if (number<0){
            System.out.println("The number is negative and skipped");
        }else {
            System.out.println(number+" is a positive number");
        }

//         Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication
//         and division.
        System.out.print("Enter an operator: ");
        String Operator = sc.next();
        char operation = Operator.charAt(0);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans;
        switch (operation){
            case '+':
                ans = num1 + num2;
                System.out.println(num1+" + "+num2+" = "+ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println(num1+" - "+num2+" = "+ans);
                break;
            case '*':
                ans = num1 * num2;
                System.out.println(num1+" * "+num2+" = "+ans);
                break;
            case '/':
                ans = num1 / num2;
                System.out.println(num1+" / "+num2+" = "+ans);
                break;
        }

//        Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below :
        System.out.print("Enter Your Mark: ");
        int mark = sc.nextInt();
        if(mark >= 90 && mark < 100){
            System.out.println("Your Grade is A+");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("Your Grade is A");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("Your Grade is B+");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("Your Grade is B");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("Your Grade is C");
        } else if (mark >= 40 && mark < 50) {
            System.out.println("Your Grade is D");
        } else if (mark >= 30 && mark < 40) {
            System.out.println("Your Grade is E");
        } else if(mark<30) {
            System.out.println("Fail");
        } else {
            System.out.println("Wrong Input");
        }
    }
}
