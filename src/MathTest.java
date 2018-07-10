import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        MathQuiz qui = new MathQuiz();
        Scanner input = new Scanner(System.in);

        System.out.println("1.Podaj wynik mnożenia 3 * 5: ");
        int wynik = input.nextInt();
        qui.question1(wynik);

        System.out.println("2.Jakie jest pole kwadratu o boku 12?: ");
        int pole = input.nextInt();
        qui.question2(pole);


        System.out.println("3.Jaki jest pierwiastek kwadratowy z liczby 15129?: ");
        int pierwiastek = input.nextInt();
        qui.question3(pierwiastek);


        System.out.println("Odp. 1.: " + qui.question1(wynik));
        System.out.println("Odp. 2.: " + qui.question2(pole));
        System.out.println("Odp. 3.: " + qui.question3(pierwiastek));

        int x;


        if (qui.question1(wynik) == true) {
            x = 1;

        } else if (qui.question2(pole) == true) {
            x = 1;

        } else if (qui.question3(pierwiastek) == true){
            x = 1;

        } else {
            x = 0;

        }

        if (qui.question1(wynik) && qui.question2(pole) == true) {
            x = 2;

        } else if (qui.question1(wynik) && qui.question3(pierwiastek) == true) {
            x = 2;

        } else if (qui.question2(pole) && qui.question3(pierwiastek) == true)  {
            x = 2;

        }
        if (qui.question1(wynik) && qui.question2(pole) && qui.question3(pierwiastek) == true) {
            x = 3;

        }

        System.out.println("Twój wynik to: " + x +"/" + "3");

        input.close();


    }

}
