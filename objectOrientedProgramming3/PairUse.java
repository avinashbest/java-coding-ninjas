package objectOrientedProgramming3;

public class PairUse {
    public static void main(String[] args) {
        var p1 = new Pair<>(1, 2);
        p1.print();

        var p2 = new Pair<>("avinash", "kumar");
        p2.print();

        var p3 = new Pair<>(502.516, 533.056);
        p3.print();

        var p4 = new Pair<>("Avinash", 191041);
        p4.print();

        var p5 = new Pair<>(10, 20);
        var p6 = new Pair<>(p5, 30);
        p6.print();
    }
}
