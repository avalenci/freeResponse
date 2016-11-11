package com.company;

public class HighSchoolClass {
    private void students(double[] x) {
        gpa = x;
    }
    public double getValedictorian() {
        int count = 0;
        double a;
        double b = -1;
        while (count < gpa.length) {
            a = gpa[count];
            if (a > b) {
                b = a;
            }
            count++;
        }
        return b;
    }
    public double getHonorsPercentage() {
        double count = 0;
        while (count < gpa.length) {
        }
        return 0;
    }
    public double getGPA(double z) {
        return z;
    }
    public boolean isHonors(double y) {
        if (y >= 3)
            return true;
        else
            return false;
    }
    public double[] gpa;
}
