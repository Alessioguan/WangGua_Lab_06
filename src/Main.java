import javax.sound.midi.Instrument;

public class Main {
    public static void main(String[] args) {
        /// test for Orchestra with standard array
//        Orchestra orchestra = new Orchestra();
        /// test for Orchestra with ArrayList
        OrchestraArrayList orchestra = new OrchestraArrayList();



        // Adding instruments to the orchestra
        orchestra.addInstrument(new Viola("Bach: suites for solo Violoncello"));
        orchestra.addInstrument(new Cello("Andrew Macdonald: The Great Square of Pegasus"));
        orchestra.addInstrument(new Tuba("Bach: Symphony no 1 to 4", 3)); // Plays oom pa pa 3 times
        orchestra.addInstrument(new Tuba("Bach: Suite no 1", 4)); // Plays oom pa pa 4 times
        orchestra.addInstrument(new instrument() { // Anonymous class representing a Trumpet
            @Override
            public void play() {
                System.out.println("It is playing with Cello : Sonata no 1");
            }

            @Override
            public void tune(char note) {
                System.out.println("Tuning Trumpet to note: " + note);
            }
        });


        // Play all instruments in the orchestra1
        orchestra.playAll();

        // Tune all instruments in the orchestra1 to note 'C'
        orchestra.tuneAll('C');

    }
}