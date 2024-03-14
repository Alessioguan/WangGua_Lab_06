import java.util.Arrays;
import java.util.Iterator;

/// Use array
public class Orchestra {
    private instrument[] unbounded;
    private int size;

    public Orchestra(){
        size = 0;
        this.unbounded = new instrument[2];
    }

    public void addInstrument(instrument Instrument){
        if(size == unbounded.length){
            increaseSize();
        }
        unbounded[size++] = Instrument;
    }

    public void increaseSize(){
        int newSize = (int)(size*1.5);
        this.unbounded = Arrays.copyOf(unbounded,newSize);
    }

    public Iterator<instrument> iterator() {
        return new OrchestraIterator();
    }
    private class OrchestraIterator implements Iterator<instrument>{
        private int currentIndex = 0;
        public boolean hasNext(){
            return currentIndex < size && unbounded[currentIndex] != null;
        }

        public instrument next(){
            if(!hasNext()){
                throw new IllegalStateException();
            }
            else{
                return unbounded[currentIndex++];
            }
        }


        public void remove(){
            if(currentIndex <= 0 || currentIndex > size){
                throw new IllegalStateException("Invalid remove operation");
            }
            for(int i = currentIndex; i < size; i++){
                unbounded[i-1] = unbounded[i];
            }
            unbounded[--size] = null;
            currentIndex--;
        }


    }

    public void playAll(){
        for (instrument ins:unbounded){
            if(ins != null){
                ins.play();
            }
        }
    }

    public void tuneAll(char note){
        for (instrument ins:unbounded){
            if(ins != null){
                ins.tune(note);
            }
        }
    }
}


