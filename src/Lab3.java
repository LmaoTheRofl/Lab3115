public class Lab3 {
    public static void main(String[] args) throws Throwable {
       Person c = new Everyone("Все");
Newspaper n = new Newspaper();
n.releaseAnArticle();
c.sell();
Stock s = new Stock(70);
Person f = new Skuperfield("Скуперфильд");
s.startPrice(Place.BIRGA);
for (int i = 0; i<6; i++) {
    s.reduce();
}
((Everyone) c).buy();
f.wandering(Place.PANOPTIKUM, s.getValue());
((Everyone) c).buy();
c.beingDesperate();
c.staring();
Person h = new Hanakonda("Ханаконда");
Person t = new Teftel("Тефтель");
Person z = new Zhmurik("Жмурик");
Person gad = new Gadkinz("Гадкинз");
((Hanakonda) h).buy().thinkUp().pay(gad);
((Teftel) t).buy().thinkUp().pay(gad);
((Zhmurik) z).buy().thinkUp().pay(gad);
gad.promisePrint();
new Newspaper.Article().fixTheCase();
    }
}