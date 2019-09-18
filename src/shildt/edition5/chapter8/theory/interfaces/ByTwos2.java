package shildt.edition5.chapter8.theory.interfaces;

public class ByTwos2 implements Series {
    int start;
    int val;

    ByTwos2() {
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

    class ByThrees implements Series {
        int start;
        int val;

        ByThrees() {
            start = 0;
            val = 0;
        }

        public int getNext() {
            val += 3;
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
}
