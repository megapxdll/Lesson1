package ru.geekbrains.lesson8.Objects;

public class Wall {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean CheckJump(int jump_length, String participant) {
        if(jump_length >= height) {
            System.out.println(participant + " passed the barrier");
            return true;
        }
        else {
            System.out.println(participant + " failed");
            return false;
        }
    }
}
