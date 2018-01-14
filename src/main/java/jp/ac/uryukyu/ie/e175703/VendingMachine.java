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

    public VendingMachine (int productNumber, String name, int amountMoney, int number) {
        this.productNumber = productNumber;
        this.name = name;
        this.amountMoney = amountMoney;
        this.number = number;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
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
}
