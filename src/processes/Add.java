package processes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add  extends Subtraction implements Calculating {


    @Override
    public void calulating() {
        Scanner scanner = new Scanner(System.in);
            int a;
            List<Integer> numbers = new ArrayList<>();


            System.out.println("Podaj liczbę: ");
            a = scanner.nextInt();
            numbers.add(a);

            while(decision=true) {

                System.out.println("Czy chcesz dalej podawać liczby?T/N");
                String d = scanner.nextLine();

                if (d.contains("T")) {
                    System.out.println("Podaj liczbę: ");
                    a = scanner.nextInt();
                    numbers.add(a);

                } else if (d.contains("N")) {

                    for (Integer n : numbers) {
                        System.out.println(n);
                        wynik = wynik + n;
                    }

                    System.out.println("Suma z dodawania tych liczb wynosi: " + wynik);
                    System.out.println(" ");
                    wynik = 0;
                    numbers.clear();
                    break;
                }
            }

        }

    }

