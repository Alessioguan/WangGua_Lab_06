import java.util.ArrayList;
import java.util.Iterator;

/// Use arrayList
public class OrchestraArrayList {
    private ArrayList<instrument> unbounded;


    public OrchestraArrayList() {
        unbounded = new ArrayList<>();
    }

    public void addInstrument(instrument Instrument){
        unbounded.add(Instrument);
    }


    public Iterator<instrument> iterator() {
        return unbounded.iterator();
    }


    public void playAll(){
        for (instrument ins:unbounded){
            ins.play();
        }
    }

    public void tuneAll(char note){
        for (instrument ins:unbounded){
            ins.tune(note);
        }
    }
}


