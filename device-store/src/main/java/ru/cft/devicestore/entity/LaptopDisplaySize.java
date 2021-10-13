package ru.cft.devicestore.entity;

public enum LaptopDisplaySize {
    ThirteenInches(13),
    FourteenInches(14),
    FifteenInches(15),
    SeventeenInches(17);

    private int size;
    LaptopDisplaySize(int size){
        this.size = size;
    }
}
