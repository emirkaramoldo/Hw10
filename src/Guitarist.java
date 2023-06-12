public class Guitarist extends Musician{
    private String guitar;
    private String specialization;
    public Guitarist(String name, int experience, String guitar, String specialization) {
        super(name, experience);
        this.guitar = guitar;
        this.specialization = specialization;
    }
    @Override
    public void print() {
        System.out.println("Guitarist plays on " + guitar + ". "
                + "\nHis specialization - " + specialization + ".");
    }
}