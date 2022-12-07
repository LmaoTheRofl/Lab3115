public class Everyone implements ISomebody {
    String name = "Все";
    @Override
    public void sell() {
        System.out.println(name + ", у кого были гигантские акции, бросились продавать их");
    }
    @Override
    public void staring() {
        System.out.println(name + " видели, что затратили свои деньги впустую и теперь не смогут вернуть их");
    }
    @Override
    public void buy(int value) {
        if (value<50) {
        System.out.println("но все равно никто не покупал их.");
    } else  {
            System.out.println("все бросились скупать их.");
        }
    }
    @Override
    public void beingDesperate() {
        System.out.println("Владельцы гигантских акций были в отчаянии");
    }

}
