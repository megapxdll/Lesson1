package ru.geekbrains.lesson8.Objects;

public class Running_Track {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean CheckRun(int run_length, String participant) {
        if(run_length >= length) {
            System.out.println(participant + " passed the barrier");
            return true;
        }
        else {
            System.out.println(participant + " failed");
            return false;
        }
    }
}
