public class Teftel extends Person implements IRich {
    public Teftel(String name) {
        super(name);
    }

    @Override
    public void thinkUp() {
        System.out.println("Однако богач " + getName() + " быстро придумал, что надо делать");
    }

    @Override
    public void pay(Person n) {
        if (n.getName().equals(name)) {
            throw new CloneError("Замечены клоны...");
        }
        else {
            System.out.println(getName() + " уплатил  значительную сумму денег владельцу нескольких давилонских газет господину " + n.getName());

        }
    }
}
