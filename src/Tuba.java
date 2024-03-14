public class Tuba implements instrument{
    private String music;
    private int times;

    public Tuba(String music,int times){
        this.music = music;
        this.times = times;
    }
    public void play(){
        System.out.println("It is playing with Tuba : " + music);
        for(int i = 0; i < times; i++){
            System.out.println("oom pa pa");
        }
    }
    public void tune(char note) {
        System.out.println("Tuning of Tuba to note : " + note);
        // Additional logic to adjust the violin's strings to match the specified note
    }
}
