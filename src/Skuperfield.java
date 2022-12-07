public class Skuperfield extends Person {

    public Skuperfield(String name) {
        super(name);
    }
    @Override
    public void wandering(Place b, int value) {
        System.out.println("На следующий день, то есть в тот день, когда " + name + " блуждал по городу " + b.getName() + " цена на акции снизилась до " + (value-5) +" сантиков");
    }

}
