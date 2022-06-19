package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    String stampName;
    double stampLength;
    String haveStamp;
    public Stamp(String stampName, double stampLenght, String haveStamp){
        this.stampName = stampName;
        this.stampLength = stampLenght;
        this.haveStamp = haveStamp;


    }

    public String getStampName() {
        return stampName;
    }

    public double getStampLength() {
        return stampLength;
    }


    public String getHaveStamp() {
        return haveStamp;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampLength=" + stampLength +
                ", haveStamp='" + haveStamp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampLength, stampLength) == 0 && Objects.equals(stampName, stamp.stampName) && Objects.equals(haveStamp, stamp.haveStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampLength, haveStamp);




    }
}