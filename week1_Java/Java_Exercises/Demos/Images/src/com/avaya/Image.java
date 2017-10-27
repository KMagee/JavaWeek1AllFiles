package com.avaya;

public class Image {

    //Properties
    private String filename;
    private String category;
    private String description;
    private String photographer;

    //FILENAME getter/setter
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }

    //CATEGORY getter/setter
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // DESCRIPTION getter/setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //PHOTOGRAPHER getter/setter
    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    //method1 0 args
    public String showFullPath(){

        return "data/gallery/" + this.filename + ".jpg";
    }

    //method2 1 arg
    public String showFullPath(String newPath){

        return newPath + "/" + this.showFullPath();
    }

    // method3 2 args
    public String showFullPath(String newPath, String newFileType) {
        return newPath + "/" + this.filename + "." + newFileType;
    }

    public void showDetails(){
        System.out.println("Filename: " + this.filename);
        System.out.println("Photographer " + this.photographer);
        System.out.println("Category: " + this.category);
        System.out.println("Description: " + this.description);
        System.out.println("Full Path: " + this.showFullPath());

    }

    public void commitToDB(){


    }

}

