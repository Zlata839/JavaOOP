package ru.gb.family_tree.family_tree;

import ru.gb.family_tree.human.Human;

import java.util.Comparator;

public class FamilyTreeCoparatorByName implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) { return o1.getName().compareTo(o2.getName()); }
}