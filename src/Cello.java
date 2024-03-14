public abstract class Viola implements instrument{
    public void play(){
        System.out.println("It is playing with Violin!");
    }
    public void tune(char note) {
        System.out.println("Tuning the violin to note: " + note);
        // Additional logic to adjust the violin's strings to match the specified note
    }
}
