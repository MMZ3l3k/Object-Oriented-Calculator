package processes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divide implements Calculating{
    protected int wynik ;
    protected Boolean decision=true;
    @Override
    public void calulating() {

        Scanner scanner = new Scanner(System.in);
        int a;
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Podaj liczby do podzielenia");
        a = scanner.nextInt();
        numbers.add(a);
        wynik = a;

        while(decision=true) {

            System.out.println("Czy chcesz dalej podawać liczby do dzielenia?T/N");
            String d = scanner.nextLine();

            if (d.contains("T")) {
                System.out.println("Podaj liczbę: ");
                a = scanner.nextInt();
                numbers.add(a);
                wynik/=a;

            } else if (d.contains("N")) {

                for (Integer n : numbers) {
                    System.out.println(n);

                }

                System.out.println("iloraz tych liczb wynosi: " + wynik);
                System.out.println(" ");
                wynik = 0;
                numbers.clear();
                break;
            }
        }

    }
}
