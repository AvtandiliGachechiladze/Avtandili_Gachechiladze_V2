package ge.edu.btu.finder;

import ge.edu.btu.finder.threads.Counter;
import ge.edu.btu.finder.threads.Finder;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Finder finder = new Finder();

        counter.start();
        finder.start();
    }
}
