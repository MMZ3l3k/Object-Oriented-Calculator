package processes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subtraction  extends Multiplication implements Calculating{



    @Override
    public void calulating() {

        Scanner scanner = new Scanner(System.in);
        int a;
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Od jakiej liczby chcesz odejmować ");
        a = scanner.nextInt();
        numbers.add(a);
        wynik = a;

        while(decision=true) {

            System.out.println("Czy chcesz dalej podawać liczby do odejmowania?T/N");
            String d = scanner.nextLine();

            if (d.contains("T")) {
                System.out.println("Podaj liczbę: ");
                a = scanner.nextInt();
                numbers.add(a);
                wynik-=a;

            } else if (d.contains("N")) {

                for (Integer n : numbers) {
                    System.out.println(n);

                }

                System.out.println("Różnica wszystkich tych liczb wynosi: " + wynik);
                System.out.println(" ");
                wynik = 0;
                numbers.clear();
                break;
            }
        }

    }
}
