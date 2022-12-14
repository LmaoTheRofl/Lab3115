public class Hanakonda extends Person implements IRich, IBuy{
    public Hanakonda(String name) {
        super(name);
    }

    @Override
    public Hanakonda thinkUp() {
        System.out.print(" быстро придумал, что надо делать");
        return this;
    }

    @Override
    public Hanakonda pay(Person n) {
        if (n.getName().equals(name)) {
            throw new CloneError("Замечены клоны...");
        }
        else {
            System.out.print("\n" + getName() + " уплатил  значительную сумму денег владельцу нескольких давилонских газет господину " + n.getName());

        }
        return this;
     }

    @Override
    public Hanakonda buy() {
        System.out.print("\n" + "Однако богач " + getName() + " закупивший в целях наживы большие количества гигантских акций,");
        return this;
    }
}
