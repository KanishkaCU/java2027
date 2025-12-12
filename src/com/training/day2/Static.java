package com.training.day2;

public class Static {
    int rollno;
    String name;
    int mark1;
    int mark2;
    int total;

    Static(int r, String n, int m1, int m2) {
        rollno = r;
        name = n;
        mark1 = m1;
        mark2 = m2;
        total = mark1 + mark2;
    }

    void print() {
        System.out.println(rollno + " " + name + " " + mark1 + " " + mark2 + " " + total);
    }

    public static void main(String[] args) {
        Static s1 = new Static(101, "Bhumika", 45, 48);
        Static s2 = new Static(102, "Harismitha", 50, 49);
        Static s3 = new Static(103, "Vishal", 40, 42);
        Static s4 = new Static(104, "Midun", 48, 47);

        s1.print();
        s2.print();
        s3.print();
        s4.print();
    }
}