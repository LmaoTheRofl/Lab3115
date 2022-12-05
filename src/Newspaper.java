public class Newspaper {
    String nameOfNewspaper = "Давилонские юморески";
    public class Article{
        String name = "статейка";
        public String getName() {
            return name;
        }
    }
    public void releaseAnArticle() {
        Article a = new Article();
        System.out.println("И действительно, в тот день, когда в газете " + nameOfNewspaper + " появилась уже известная нам " + a.getName());
    }
}
