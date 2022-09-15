package day3;

public class ExampleThree {
  public static void main(String[] args) {
    System.out.println(17/5);   //division
    System.out.println(17%5);   //modules (reminder)
    System.out.println((9+10)%12);
    System.out.println(5+8/3*2);

    int number=123456;
    System.out.println(number/10);  //12345
    System.out.println(number%10);  //6

    int digit1=number/100000;
    int digit2=number/10000%10; 
    int digit3=number/1000%10;
    int digit4=number/100%10;
    int digit5=number/10%10;
    int digit6=number%10;

    int sum=digit1+digit2+digit3+digit4+digit5+digit6;
    System.out.println(sum);

  }  
}
