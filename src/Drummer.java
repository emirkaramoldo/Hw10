public class Drummer extends Musician{
    private String drums;
    private int bpm;
    public Drummer(String name, int experience, String drums, int bpm) {
        super(name, experience);
        this.drums= drums;
        this.bpm= bpm;
    }

    @Override
    public void print() {
        System.out.println("Drummer plays on " + drums + ". "
                + "\nHis maximum bit per minute - " + bpm + ".");
    }
}
