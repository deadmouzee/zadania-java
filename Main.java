//
////Zad.1 FizzBuzz
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<String> liczby = new ArrayList<>();
//
//        int x;
//        String xtekst;
//        String Fizz;
//        String Buzz;
//        String FizzBuzz;
//
//        System.out.println("FizzBuzz v1.0");
//        System.out.println("Wprowadź 10 wybranych przez siebie liczb");
//        System.out.println("Jeżeli liczba jest podzielna przez 3 program doda do niej słowo 'Fizz', jeżeli przez 5 'Buzz', a jeżeli przez 3 i 5 to 'FizzBuzz'");
//
//        for (int i = 0; i < 10; i++)
//        {
//            System.out.println("\nWprowadź "+(i+1)+" liczbę");
//            x = scanner.nextInt();
//            if (x%3 == 0 && x%5 == 0){
//                FizzBuzz = Integer.toString(x);
//                liczby.add(FizzBuzz + " FizzBuzz");
//            } else if (x % 5 == 0){
//                Buzz = Integer.toString(x);
//                liczby.add(Buzz + " Buzz");
//            } else if  (x % 3 == 0){
//                Fizz = Integer.toString(x);
//                liczby.add(Fizz + " Fizz");
//            } else {
//                xtekst = Integer.toString(x);
//                liczby.add(xtekst);
//            }
//        }
//        System.out.println(liczby);
//    }
//}
//
//
////Zad.2 Fibonacci
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<Integer> fibonaci = new ArrayList<>();
//        int x;
//        int y;
//        int z;
//
//        System.out.println("Program wyświetli następne 10 liczb ciągu Fibonacciego");
//
//        System.out.println("\nWprowadź 1 liczbę");
//
//        x = scanner.nextInt();
//
//        fibonaci.add(x);
//
//        System.out.println("Wprowadź 2 liczbę");
//
//        y = scanner.nextInt();
//
//        fibonaci.add(y);
//
//        for (int i = 0; i < 10; i++) {
//            z = x + y;
//            fibonaci.add(z);
//            x = (y);
//            y = (z);
//        }
//        System.out.println(fibonaci);
//    }
//}
//
//// Zad.3 Kalkulator
//}
//        import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("Kalkulator v1.1");
//        double liczba1, liczba2, liczba3, wynik1, wynik2;
//        char funkcja, funkcja2;
//        boolean x = false, potega = true, potega2 = true, potega3 = true;
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("\n\nObsługiwane funkcje:");
//        System.out.println("Aby wykonać funkcję dodawania - wpisz +");
//        System.out.println("Aby wykonać funkcję odejmowania - wpisz -");
//        System.out.println("Aby wykonać funkcję mnożenia - wpisz *");
//        System.out.println("Aby wykonać funkcję dzielenia - wpisz /");
//
//        System.out.println("Wybierz 3 liczby na których wykonywane będą działania - pamiętaj, że wpisane przez Ciebie liczby mają przypisaną kolejność i działania wykonywane będą według schematu [l1 - x1 - l2 - x2 - l3](w miejsciu x1 i x2 wybrane działanie)!");
//
//        System.out.println("\nWpisz pierwszą liczbę:");
//
//        liczba1 = scanner.nextDouble();
//
//        System.out.println("Czy liczba ma zostać podniesiona do potęgi? Jeśli tak - wpisz 'tak', jeśli nie - wpisz 'nie'");
//
//        while (!x) {
//            potega = scanner.hasNext();
//
//            if (scanner.hasNext("tak")) {
//                potega = true;
//                x = true;
//            } else if (scanner.hasNext("nie")) {
//                potega = false;
//                x = true;
//            } else {
//                System.out.println("Wpisz prawidłowo tak/nie");
//            }
//        }
//
//        if (potega) {
//            liczba1 = liczba1 * liczba1;
//        }
//
//        System.out.println("\nWybierz pierwszą obsługiwaną funkcję:");
//
//        funkcja = scanner.next().charAt(0);
//        funkcja = scanner.next().charAt(0);
//
//        while (funkcja != '+' && funkcja != '-' && funkcja != '*' && funkcja != '/') {
//            System.out.println("Funkcja nieprawidłowa! Wybierz obsługiwaną funkcję:");
//
//            funkcja = scanner.next().charAt(0);
//        }
//
//        x = false;
//
//        System.out.println("\nWpisz drugą liczbę:");
//
//        liczba2 = scanner.nextDouble();
//
//        System.out.println("Czy liczba ma zostać podniesiona do potęgi? Jeśli tak - wpisz 'tak', jeśli nie - wpisz 'nie'");
//
//        while (!x) {
//            potega2 = scanner.hasNext();
//
//            if (scanner.hasNext("tak")) {
//                potega2 = true;
//                x = true;
//            } else if (scanner.hasNext("nie")) {
//                potega2 = false;
//                x = true;
//            } else {
//                System.out.println("Wpisz prawidłowo tak/nie");
//            }
//        }
//        if (potega2) {
//            liczba2 = liczba2 * liczba2;
//        }
//
//        System.out.println("\nWybierz drugą obsługiwaną funkcję:");
//
//        funkcja2 = scanner.next().charAt(0);
//        funkcja2 = scanner.next().charAt(0);
//
//        while (funkcja2 != '+' && funkcja2 != '-' && funkcja2 != '*' && funkcja2 != '/') {
//
//            funkcja2 = scanner.next().charAt(0);
//            System.out.println("Funkcja nieprawidłowa! Wybierz obsługiwaną funkcję:");
//
//        }
//        x = false;
//        System.out.println("\nWpisz trzecią liczbę:");
//
//        liczba3 = scanner.nextDouble();
//
//        System.out.println("Czy liczba ma zostać podniesiona do potęgi? Jeśli tak - wpisz 'tak', jeśli nie - wpisz 'nie'");
//
//        while (!x) {
//            potega3 = scanner.hasNext();
//
//            if (scanner.hasNext("tak")) {
//                potega3 = true;
//                x = true;
//            } else if (scanner.hasNext("nie")) {
//                potega3 = false;
//                x = true;
//            } else {
//                System.out.println("Wpisz prawidłowo tak/nie");
//            }
//        }
//        if (potega3) {
//            liczba3 = liczba3 * liczba3;
//        }
//
//        wynik1 = 0;
//
//        switch (funkcja) {
//            case '+': {
//                wynik1 = liczba1 + liczba2;
//                break;
//            }
//            case '-': {
//                wynik1 = liczba1 - liczba2;
//                break;
//            }
//            case '*': {
//                wynik1 = liczba1 * liczba2;
//                break;
//            }
//            case '/': {
//                wynik1 = liczba1 / liczba2;
//                if (liczba2 == 0.0) {
//                    System.out.println("Nie dzielimy przez 0!");
//                    break;
//                }
//                break;
//            }
//        }
//
//        switch (funkcja2) {
//            case '+': {
//                wynik2 = wynik1 + liczba3;
//                System.out.println("Wynik: " + (wynik2));
//                break;
//            }
//            case '-': {
//                wynik2 = wynik1 - liczba3;
//                System.out.println("Wynik: " + (wynik2));
//                break;
//            }
//            case '*': {
//                wynik2 = wynik1 * liczba3;
//                System.out.println("Wynik: " + (wynik2));
//                break;
//            }
//            case '/': {
//                wynik2 = wynik1 / liczba3;
//                System.out.println("Wynik: " + (wynik2));
//                if (liczba3 == 0.0) {
//                    System.out.println("Nie dzielimy przez 0!");
//                    break;
//                }
//                break;
//            }
//        }
//    }
//}