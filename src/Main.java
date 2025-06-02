public class Main {
    public static void main(String[] args) {
       int a = 10, b = 3;

       int sum = a + b;
       int difference = a - b;
       int product = a * b;
       int quotient = a / b;
       int remainder = a % b;

       // 사칙 연산자
       System.out.println(sum);
       System.out.println(difference);
       System.out.println(product);
       System.out.println(quotient);
       System.out.println(remainder);

       //복합 대입 연산자
        a += 5; // a = a + 5;
        System.out.println(a);

        b += 1;
        System.out.println(b);

        b *= 4;
        System.out.println(b);

        b /= 3;
        System.out.println(b);

        b %= 2;
        System.out.println(b);
    // 증감 연산자
        a ++ ;
        System.out.println(a);
    }
    }