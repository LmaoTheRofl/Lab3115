public class Stock {
    int value;
    public Stock(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public void reduce() {
        value -= 10;
        System.out.println("\n" + " акция теперь стоит: " + value);
    }
}
