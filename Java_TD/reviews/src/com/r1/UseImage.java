// see https://pastebin.com/QSPcZFUu

package com.r1;

public class UseImage {

    public static void main(String[] args) {
        // create an image instance
        Image donkey = new Image();
        donkey.setFilename("animals03");
        donkey.setPhotographer("Emily Kim");
        donkey.setCategory("animals");
        donkey.setDescription("Chubby donkey");

        donkey.showDetails();
    }
}
