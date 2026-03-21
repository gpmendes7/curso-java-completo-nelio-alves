package br.com.gpmendes7.interfaces4.application;

import br.com.gpmendes7.interfaces4.services.BrazilInterestService;
import br.com.gpmendes7.interfaces4.services.InterestService;
import br.com.gpmendes7.interfaces4.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new UsaInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));
    }

}
