import java.util.ArrayList;
import java.util.Scanner;

public class zad23 {
    Scanner sc = null;
    static final int ARRAY_SIZE = 10;

    private zad23() {
        sc = new Scanner(System.in);
    }

    private ArrayList<Integer> input(ArrayList<Integer> array) {
        if (array == null)
            array = new ArrayList<Integer>();

        array.add(sc.nextInt());
        if (array.size() < ARRAY_SIZE)
            array = input(array);


        return array;
    }
    private void output(ArrayList<Integer> array) {
        if (array.isEmpty())
            return;
        System.out.print(array.get(0) + " ");
        if (array.size() > 1)
            output(new ArrayList<Integer>(array.subList(1, array.size())));
    }

    private void doABarrelRoll() {
        //input(null);
        output(input(null));
    }

    public static void main(String[] args) {
        System.out.println("Введите " + ARRAY_SIZE + " целых чисел ");
        zad23 zadanie = new zad23();
        zadanie.doABarrelRoll();
    }
}
