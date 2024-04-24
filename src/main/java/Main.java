import java.util.Scanner;

public class Main {

    /*
    1-while(true)
    2-scanner => operatorName
    3-for(operatorName){scanner=> oprator info
    info=name , invoiceCount}
    4-for( invoiceCount){ scanner=> invoicePrice}
    5-average( operatorName){sumprice/invoiceCount }
    6-if (operator strengh)
    7-shopPrice (sumprice)

     */

    public static void main(String[] args) {


        while (true) {
            System.out.println("please enter operators count or enter '0' to exite");
            Scanner scanner = new Scanner(System.in);
            int operatorCount = scanner.nextInt();
            if (operatorCount == 0) {
                System.out.println("have a nice Day.");
                break;

            }

            double shopSumPrice = 0;
            for (int count = 0; count < operatorCount; count++) {

                System.out.println("please enter Operator" + (count + 1) + " " + "name");
                String name = scanner.next();
                System.out.println("please enter " + name + "  invoiceCount :");
                int invoiceCount = scanner.nextInt();

                ;
                double sumPrice = 0;
                double bestPrice = 0;
                String bestOpertor = "";


                for (int countinvoiceCount = 0; countinvoiceCount < invoiceCount; countinvoiceCount++) {
                    System.out.println("please enter " + (name) + " invoice" + (countinvoiceCount + 1));
                    double price = scanner.nextInt();
                    sumPrice += price;
                    shopSumPrice += sumPrice;


                }
                System.out.println(" SumPrice" + "  " + (name) + " " + "is :" + " " + (sumPrice));
                double avrage = sumPrice / invoiceCount;
                System.out.println("the Avrage of " + " " + (name) + " " + "is :" + " " + avrage);

                if (sumPrice > bestPrice) {
                    bestPrice = sumPrice;
                    bestOpertor = name;
                }
                if (sumPrice >= 10) {
                    System.out.println("the operato" + " " + (name) + " " + "is perfect.");
                } else if (sumPrice < 10 && sumPrice > 5) {
                    System.out.println("the operato" + " " + (name) + " " + "is good.");
                } else {
                    System.out.println("the operato" + " " + (name) + " " + "is bad.");
                }
                System.out.println("teh remain of operator is :" + " " + (operatorCount - count-1));

            }
            System.out.println("the sum of shop is :" + " " + (shopSumPrice));

        }
    }
}
