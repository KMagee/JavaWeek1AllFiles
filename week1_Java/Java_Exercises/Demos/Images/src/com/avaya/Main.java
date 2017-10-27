package com.avaya;



public class Main {

    public static void main(String[] args) {

        //New Image instance
        Image image1 = new Image();

        //populate data
        image1.setCategory("animals");
        image1.setDescription("chubby donkey");
        image1.setFilename("animals03");
        image1.setPhotographer("Emily Kim");

        image1.showDetails();

        //0 args
        System.out.println(image1.showFullPath());

        // 1 arg
        System.out.println(image1.showFullPath("testnewpath"));

        // 2 args
        System.out.println(image1.showFullPath("testnewpath", "png"));

        //write to DB

    }

}
