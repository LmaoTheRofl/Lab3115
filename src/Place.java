public enum Place {
    BIRGA("давилонской бирже"),
    PANOPTIKUM("Паноптикуму");

    private String name;

    Place(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
