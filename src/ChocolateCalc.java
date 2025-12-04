public class ChocolateCalc {
    int money;
    int price;
    int wrap;

    public ChocolateCalc(int money, int price, int wrap) {
        this.money = money;
        this.price = price;
        this.wrap = wrap;
    }

    public int calculate(){
        int chock = money/price;
        int res = chock/wrap;
        return res+chock;
    }
}
