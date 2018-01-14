package jp.ac.uryukyu.ie.e175703;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine product1 = new VendingMachine(1,"コーラ", 120, 5);
        VendingMachine product2 = new VendingMachine(2,"コーヒー", 130, 5);
        VendingMachine product3 = new VendingMachine(3,"お茶", 120, 5);

        int input;
        Scanner in = new Scanner(System.in);

        System.out.println("購入商品を番号で選んでください");
        System.out.printf("%d.%s\n", product1.getProductNumber(), product1.getName());
        System.out.printf("%d.%s\n", product2.getProductNumber(), product2.getName());
        System.out.printf("%d.%s\n", product3.getProductNumber(), product3.getName());
        input = in.nextInt();
        VendingMachine select = null;
        while (select == null) {
            switch (input) {
                case 1:
                    select = product1;
                    break;
                case 2:
                    select = product2;
                    break;
                case 3:
                    select = product3;
                    break;
                default:
                    System.out.println("番号が違います。もう一度入力してください。");
            }
        }
        System.out.printf("選択された商品は%sです\n", select.getName());

        System.out.println("お金を入れてください");
        int sumMoney = 0;
        int restNumber;
        int money = -1;
        while(money != 0 && sumMoney < select.getAmountMoney()) {
            money = in.nextInt();
            sumMoney = sumMoney + money;
            System.out.printf("只今の合計投入金額は%d円です\n", sumMoney);
        }
        restNumber = select.getNumber() - 1;
        select.setNumber(restNumber);
        int change = sumMoney - select.getAmountMoney();
        System.out.printf("[%s]\n", select.getName());
        System.out.printf("おつりは%d円です\n", change);
    }
}
