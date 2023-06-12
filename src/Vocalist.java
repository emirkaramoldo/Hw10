public class Vocalist extends Musician{
    private String microphone;
    private String vocalType;
    public Vocalist(String name, int experience, String microphone, String vocalType) {
        super(name, experience);
        this.microphone = microphone;
        this.vocalType = vocalType;
    }

    @Override
    public void print() {
        System.out.println("Vocalist uses microphone " + microphone + ". "
                + "\nHis vocal type - " + vocalType + ".");
    }
}
