package ru.geekbrains.lesson8.Participants;

public interface Abstract_Participant {
    void Run();
    void Jump();
    String Get_Label();
    int Get_Max_run_length();
    int Get_Max_jump_length();
}
