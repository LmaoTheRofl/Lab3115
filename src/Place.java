public enum Place {
    BARGA("давилонской барже"),
    PANOPTIKUM("Паноптикуму");

    private String name;

    Place(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
