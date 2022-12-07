public class Newspaper {
    String nameOfNewspaper = "Давилонские юморески";
    public static class Article{
        String name = "статейка";
        public String getName() {
            return name;
        }
        public void fixTheCase() {
            System.out.println("которые должны были быстро поправить дело.");
        }
    }
    public void releaseAnArticle() {
        Article a = new Article();
        System.out.println("И действительно, в тот день, когда в газете " + nameOfNewspaper + " появилась уже известная нам " + a.getName());
    }
}
