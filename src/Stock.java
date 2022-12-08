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
    public void reduce() throws Throwable {
        Throwable ex = new BelowZeroException("Акция стоит ниже нуля");
        value -= 10;
        System.out.println(toString());
        if (value <= 5) throw  ex;
    }

    @Override
    public String toString() {
        return "по " + value;
    }
}
