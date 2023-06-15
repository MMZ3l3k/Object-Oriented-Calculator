package processes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiplication extends Divide implements Calculating {


    @Override
    public void calulating() {

        Scanner scanner = new Scanner(System.in);
        int a;
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Podaj liczby do przemnożenia");
        a = scanner.nextInt();
        numbers.add(a);
        wynik = a;

        while(decision=true) {

            System.out.println("Czy chcesz dalej podawać liczby do mnożenia?T/N");
            String d = scanner.nextLine();

            if (d.contains("T")) {
                System.out.println("Podaj liczbę: ");
                a = scanner.nextInt();
                numbers.add(a);
                wynik*=a;

            } else if (d.contains("N")) {

                for (Integer n : numbers) {
                    System.out.println(n);

                }

                System.out.println("iloczyn wszystkich tych liczb wynosi: " + wynik);
                System.out.println(" ");
                wynik = 0;
                numbers.clear();
                break;
            }
        }

    }
}
