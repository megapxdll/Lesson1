package ru.geekbrains.lesson8.Participants;

public class Human implements Abstract_Participant {
    private final String label = "Human";
    private final int Max_run_length = 100;
    private final int Max_jump_length = 2;

    public String Get_Label() {
        return label;
    }

    public void Run() {
        System.out.printf("%s runs: %s m %n", label, Max_run_length);
    }

    public void Jump() {
        System.out.printf("%s jumps: %s m %n", label, Max_jump_length);
    }

    public int Get_Max_run_length() {
        return Max_run_length;
    }

    public int Get_Max_jump_length() {
        return Max_jump_length;
    }
}
