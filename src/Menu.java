import processes.Add;
import processes.Divide;
import processes.Multiplication;
import processes.Subtraction;

import java.util.Scanner;

public class Menu extends Add{
    private  int p;
    Scanner scanner = new Scanner(System.in);
    public int Consol(){
        do{
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");
            System.out.println(" ");
            System.out.println("Podaj co chcesz wykonać");
            this.p = scanner.nextInt();

            switch (p){
                case 1 -> {
                    Add add = new Add();
                    add.calulating();


                }
                case 2 ->{
                    Subtraction subtraction = new Subtraction();
                    subtraction.calulating();


                }
                case 3 ->{
                    Multiplication multiplication = new Multiplication();
                    multiplication.calulating();


                }
                case 4 ->{
                    Divide divide = new Divide();
                    divide.calulating();


                }
                case 5 ->{
                    System.out.println(" Dziękuje za udział ");
                    return p = 5;
                }
            }



        }while (p < 5 );

        return 0;
    }
}
