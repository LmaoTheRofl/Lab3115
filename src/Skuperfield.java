public class Skuperfield extends Person {

    public Skuperfield(String name) {
        super(name);
    }
    @Override
    public void wandering(Place b) {
        System.out.println(name + " блуждал по городу " + b.getName());
    }

}
