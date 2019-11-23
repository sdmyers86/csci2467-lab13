package edu.cscc;

public class Surname {
    private String name;
    private int rank;
    private int count;
    private double proportion;

    public Surname(String name, int rank, int count, double proportion) {
        this.name = name;
        this.rank = rank;
        this.count = count;
        this.proportion = proportion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getProportion() {
        return proportion;
    }

    public void setProportion(double proportion) {
        this.proportion = proportion;
    }
}