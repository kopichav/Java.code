package hw9.p1_p2_p3;

import hw6.Curse;

public class RepositoryCurses {
    public RepositoryCurses(int i, String s) {
    }

    public RepositoryCurses(int i) {
    }

    public static void main(String[] args) {
        Curse[] curses = new Curse[3];
        curses[0] = new Curse(01, "First");
        curses[1] = new Curse(02, "Second");

        for (int i = 0; i < curses.length; i++) {
            curses[i] = new Curse(i, "Name" + i);
            i=(i*3)/2+1;

        }
    }
}
