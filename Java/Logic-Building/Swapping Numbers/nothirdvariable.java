class nothirdvariable{
    int num1= 2;
    int num2 = 4;

    num1 = num1 + num2; // num1 = 5
    num2 = num1 - num2; // num2 = 6 - 4 = 2
    num1 = num1 - num2; // num1 = 6 - 2 = 4

    System.out.println("num1 = " + num1 + " num2 = " + num2);
}