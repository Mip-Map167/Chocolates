import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько у вас денег?");
        int money = sc.nextInt();
        System.out.println("Сколько стоит одна шоколадка?");
        int price = sc.nextInt();
        System.out.println("За сколько обёрток дают дополнительную шоколадку?");
        int wrap = sc.nextInt();
        ChocolateCalc c = new ChocolateCalc(money, price, wrap);
        System.out.println("\nВы полуите "+c.calculate()+" шт.");
    }
}