package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String schoolName;
    private List<Integer> classSizes;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.classSizes = new ArrayList<>();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void addClassSize(int size) {
        this.classSizes.add(size);
    }

    public int getTotalStudents() {
        int total = 0;
        for (int size : classSizes) {
            total += size;
        }
        return total;
    }
}
