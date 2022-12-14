public class Everyone extends Person implements IBuy {
    public Everyone(String name) {
        super(name);
    }

    @Override
    public void sell() {
        System.out.println(name + ", у кого были гигантские акции, бросились продавать их");
    }
    @Override
    public void staring() {
        System.out.println(name + " видели, что затратили свои деньги впустую и теперь не смогут вернуть их");
    }
    @Override
    public Everyone buy() {
        System.out.println("но все равно никто не покупал их.");
        return this;
    }
    @Override
    public void beingDesperate() {
        class Mood {
            String name = "Отчаяние";
            public String getName() {
                return name;
            }
        }
        Mood m = new Mood();
        System.out.println("Владельцы гигантских акций были в " + m.getName());
    }

}
