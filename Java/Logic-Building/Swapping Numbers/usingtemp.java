class usingtemp{
    int num1= 2;
    int num2 = 4;
    int temp = 0;

    temp = num1;
    num1 = num2;
    num2 = temp;

    System.out.println("num1 = " + num1 + " num2 = " + num2);
}