package jp.ac.uryukyu.ie.e175703;

public class VendingMachine {
    //商品番号
    private int productNumber;
    //商品名
    private String name;
    //商品の金額
    private int amountMoney;
    //個数
    private int number;
    //空かどうか
    private boolean empty;
    //繰り返すかどうか
    private boolean repeat;

    public VendingMachine (int productNumber, String name, int amountMoney, int number) {
        this.productNumber = productNumber;
        this.name = name;
        empty = false;
        this.amountMoney = amountMoney;
        this.number = number;
        repeat = true;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getName() {
        return name;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public int change (int sumMoney, int selectMoney) {
        return sumMoney - selectMoney;
    }

    public void decreased() {
        number -= 1;
        if(number == 0) {
            empty = true;
        }
    }
}
