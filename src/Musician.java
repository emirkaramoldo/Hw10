public abstract class Musician implements Printable{
    private final String name;
    private final int experience;
    public Musician(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
    public String getName() {
        return name;
    }
    public int getExperience() {
        return experience;
    }
}