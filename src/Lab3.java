public class Lab3 {
    public static void main(String[] args) {
        Everyone c = new Everyone();
Newspaper n = new Newspaper();
n.releaseAnArticle();
c.sell();
Stock s = new Stock(80);
Person f = new Skuperfield("Скуперфильд");
s.startPrice(Place.BARGA);
for (int i = 0; i<7; i++) {
    s.reduce();
}
f.wandering(Place.PANOPTIKUM, s.getValue());
    }
}