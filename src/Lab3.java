import java.util.stream.Stream;

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
c.buy(s.getValue());
c.beingDesperate();
c.staring();
Stream.of(new Hanakonda("Ханаконда"), new Teftel("Тефтель"), new Zhmurik("Жмурик")).forEach(IRich::thinkUp);
Person gad = new Gadkinz("Гадкинз");
new Hanakonda("Ханаконда").pay(gad);
new Teftel("Тефтель").pay(gad);
new Zhmurik("Жмурик").pay(gad);
gad.promisePrint();
new Newspaper.Article().fixTheCase();
    }
}