public class Viola implements instrument{
    private String music;

    public Viola(String music){
        this.music = music;
    }
    public void play() {
        System.out.println("It is playing with Violin : " + music);
    }
    public void tune(char note) {
        System.out.println("Tuning of Violin to note: " + note);
        // Additional logic to adjust the violin's strings to match the specified note
    }
}
