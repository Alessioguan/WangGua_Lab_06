public class Cello implements instrument{
    private String music;

    public Cello(String music){
        this.music = music;
    }
    public void play() {
        System.out.println("It is playing with Cello : " + music);
    }
    public void tune(char note) {
        System.out.println("Tuning of Cello to note: " + note);
        // Additional logic to adjust the violin's strings to match the specified note
    }
}
