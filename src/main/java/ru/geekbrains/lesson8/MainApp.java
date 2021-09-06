package ru.geekbrains.lesson8;

import ru.geekbrains.lesson8.Objects.Running_Track;
import ru.geekbrains.lesson8.Objects.Wall;
import ru.geekbrains.lesson8.Participants.*;

public class MainApp {

    /**
     * Global values
     */
    public static final int object_size = 5;
    public static int length = 25;
    public static int height = 1;

    public static void main(String[] args) {
        Abstract_Participant[] participants = {new Human(), new Cat(), new Robot()};
        Running_Track[] tracks = new Running_Track[object_size];
        Wall[] walls = new Wall[object_size];

        Set_Object_Parameters(tracks, walls);

        //Tournament_Start(participants, tracks, walls);
        Tournament_Start_V2(participants, tracks, walls);
    }

    /**
     * Method for setting a barrier parameters
     * Running track becomes longer for 25 meters every level
     * Walls becomes higher for 1 meter every level
     */
    public static void Set_Object_Parameters(Running_Track[] tracks, Wall[] walls) {
        for (int i = 0; i < object_size; i++) {
            tracks[i] = new Running_Track();
            walls[i] = new Wall();
            tracks[i].setLength(length);
            length += 25;
            walls[i].setHeight(height);
            height += 1;
        }
    }

    /**
     * Method starts Tournament
     * I made 2 versions of Tournament realization
     * Accepts array of participants, arrays of objects
     */
    public static void Tournament_Start_V2(Abstract_Participant[] participants, Running_Track[] tracks, Wall[] walls) {
        outer:
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < object_size; j++) {
                participants[i].Run();
                if(tracks[j].CheckRun(participants[i].Get_Max_run_length(), participants[i].Get_Label()) == false) {
                    continue outer;
                }
                participants[i].Jump();
                if(walls[j].CheckJump(participants[i].Get_Max_jump_length(), participants[i].Get_Label()) == false) {
                    continue outer;
                }
            }
        }
    }
    public static void Tournament_Start(Abstract_Participant[] participants, Running_Track[] tracks, Wall[] walls) {
        outer:
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < object_size; j++) {
                participants[i].Run();
                if(participants[i].Get_Max_run_length() >= tracks[j].getLength()) {
                    System.out.println(participants[i].Get_Label() + " passed the barrier");
                }
                else {
                    System.out.println(participants[i].Get_Label() + " failed");
                    continue outer;

                }
                participants[i].Jump();
                if(participants[i].Get_Max_jump_length() >= walls[j].getHeight()) {
                    System.out.println(participants[i].Get_Label() + " passed the barrier");
                }
                else {
                    System.out.println(participants[i].Get_Label() + " failed");
                    continue outer;
                }
            }
        }
    }
}
