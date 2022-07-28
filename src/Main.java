import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("giải PT: ax2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a = ");
        a = scanner.nextInt();
        System.out.println("enter b ");
        b = scanner.nextInt();
        System.out.println("enter c ");
        c = scanner.nextInt();
        if (a==0){
            if (b==0){
                System.out.println("PT vo nghiem");
            }else {
                System.out.println("PT co nghiem la X= " + (-c/b));
            }return;
        }
        QuadraticEquation tinhDelta = new QuadraticEquation(a, b, c);
        System.out.println(" b2 - 4 ac = " + tinhDelta.getDelta());

        if (tinhDelta.getDelta() < 0) {
            System.out.println("PT vo nghiem");
        } else if (tinhDelta.getDelta() == 0 ) {
            System.out.println(" PT co nghiem kep la: " + tinhDelta.nghiem1());

        }else {
            System.out.println("PT co 2 nghiem la: X1 = "+ tinhDelta.nghiem1() +"\n"+ " X2= "+ tinhDelta.nghiem2());
        }
    }
}