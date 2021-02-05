package cashiersAlgorithm;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        double totalCharge = (double) (Math.random() * 100);
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("Total Charge : $" + df.format(totalCharge));

        double amountGiven = (double)(Math.random() * 100);
        System.out.println("Amount Given : $" + df.format(amountGiven));

        double changeBack = amountGiven - totalCharge;
        System.out.println("Change back: $" + df.format(changeBack));




        }



}
