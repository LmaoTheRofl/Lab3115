public class Everyone implements ISomebody {
    String name = "Все";
    @Override
    public void sell() {
        System.out.println(","+name + ", у кого были гигантские акции, бросились продавать их");
    }
    @Override
    public void staring() {
        System.out.println(name + "видели, что затратили свои деньги впустую и теперь не смогут вернуть их");
    }
}
