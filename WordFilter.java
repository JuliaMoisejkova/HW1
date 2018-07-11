package ru.raiffeisen.courses.homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class WordFilter {

    public static void main(String[] args) {

        Scanner userScanner = new Scanner(System.in);

        System.out.println("Введите строку ");
        String str = userScanner.nextLine();

        System.out.println("Введите подстроку или регулярное выражение для поиска ");
        String substr = userScanner.next();

        System.out.println("Содержат " + substr + ":");

        findString(str.toLowerCase(),substr.toLowerCase());
    }

   private static void findString (String str, String substr) {

       ArrayList<String> arrayList = new ArrayList();

       String[] arrStr = str.split(" ");

       for (String s : arrStr) {
           arrayList.add(s);
           if (s.contains(substr)) {
               System.out.println(s);
           }
           if (str.matches(substr)) {
               System.out.println(s);
           }
       }
   }
}
