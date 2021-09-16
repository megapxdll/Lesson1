package ru.geekbrains.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private ArrayList<T> FruitBox = new ArrayList<>();


    public List<T> getFruitBox() {
        return FruitBox;
    }

    public void AddFruits (Fruit fruit) {
        FruitBox.add((T) fruit);
    }

    public float GetWeight() {
        if(FruitBox.size() > 0) {
            return FruitBox.size() * FruitBox.get(0).getWeight();
        }
        return 0f;
    }

    public boolean Compare(Box<T> box) {
        return box.GetWeight() == GetWeight();
    }

    public void ShiftFruits(Box<T> box) {
        for (int i = 0; i < getFruitBox().size(); i++) {
            box.getFruitBox().add(getFruitBox().get(i));
        }
        getFruitBox().clear();
    }
}
