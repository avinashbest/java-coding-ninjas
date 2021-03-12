package gettingStarted;

public class simpleInterest {
    public static void main(String[] args) {
        int principal = 1000;
        int rate = 10;
        int time = 5;

        int SI = (principal * rate * time) / 100;

        System.out.println(SI);
    }
}
