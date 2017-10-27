package com.avaya;

public interface IPoint {

    // inside an interface, declare required methods WITHOUT a body
    public void move(int x, int y, int z);

    public void translate(int x, int y, int z);

    public String showDetails();

}
