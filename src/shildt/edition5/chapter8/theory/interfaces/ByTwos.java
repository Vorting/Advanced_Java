package shildt.edition5.chapter8.theory.interfaces;

public class ByTwos {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }


    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}
