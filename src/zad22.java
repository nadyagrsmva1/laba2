import java.util.Scanner;

public class zad22 {
    static private String decToBin(Integer dec) {
        return (dec != 0) ? (decToBin(dec/2) + dec%2) : "";
    }
    static public void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        Integer value = sc.nextInt();
        System.out.println("Вот ваше число в двоичной системе счисления: " + decToBin(value));
        sc.nextLine();
    }
}
