package comparable;

public class Domino implements Comparable<Domino>{
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    public int compareTo (Domino domino) {
        if (this.left < domino.left){
            return -1;
        }if (this.left == domino.left){
            if (this.right < domino.right){
                return 0;
            }
        }
        return 1;
    }


    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }
}