public class Gadkinz extends Person {
    public Gadkinz(String name) {
        super(name);
    }
    @Override
    public void promisePrint() {
        Newspaper.Article a = new Newspaper.Article();
        System.out.println("\n" + "\n" +getName() + " пообещал напечатать в своих газетах несколько " + a.getName());
    }
}
