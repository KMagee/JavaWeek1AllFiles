package com.r1;

public class Image {

    // props
    private String filename;
    private String photographer;
    private String category;
    private String description;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {

        this.filename = filename;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String showFullPath(){
        return  "data/gallery/" + this.filename + ".jpg";
    }

    public String showFullPath(String newPath){
        return newPath + this.filename + ".jpg"; // note the default jpg

    }
    public String showFullPath(String newPath, String newFileType){
        return newPath + this.filename + newFileType;

    }

    public void showDetails(){
        String imageDetails = "";
        imageDetails += "Filename: " + filename
                     + "\nPhotographer: " + photographer
                     + "\nCategory: " + category
                     + "\nDescription: " + description
                     + "\nFull Path: " + this.showFullPath();
        System.out.println(imageDetails);
    }


}
