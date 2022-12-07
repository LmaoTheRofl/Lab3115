public class Stock {
    int value;
    public Stock(int value) {
        this.value = value;
    }

    public int getValue() {

        return value;
    }
    public void startPrice(Place a) {
        Stock c = new Stock(80);
        System.out.println("На "+ a.getName() + " эти акции предлагались сначала по "+ c.getValue() +" сантиков штучка");
    }
    public void reduce() {
        value -= 10;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "по " + value;
    }
}
