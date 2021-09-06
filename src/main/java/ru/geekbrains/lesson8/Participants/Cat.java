package ru.geekbrains.lesson8.Participants;

public class Cat implements Abstract_Participant {
    private final String label = "Cat";
    private final int Max_run_length = 25;
    private final int Max_jump_length = 10;

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
