package com.deji_cranium.utubedownloader.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cranium on 12/1/17.
 */

class YouTubeFile {
    private String fileName;
    private String fileDescription;
    private String fileSize;
    private String fileAuthor;
    private String dateUploaded;
    private List<String> availableQualities;

    {
        availableQualities = new ArrayList<>();
    }

    //private constructor to ensure class noninstantiability
    private YouTubeFile(){

    }

    public String getFileName(){return fileName;}
    public String getFileDescription(){return fileDescription;}
    public String getFileSize(){return fileSize;}
    public String getFileAuthor(){return fileAuthor;}
    public String getDateUploaded(){return dateUploaded;}
    public List<String> getAvailableQualities(){return availableQualities;}

    public void setFileName(String fileName){this.fileName = fileName;}
    public void setFileDescription(String description){this.fileDescription = description;}
    public void setFileSize(String size){this.fileSize = size;}
    public void setFileAuthor(String author){this.fileAuthor = author;}
    public void setDateUploaded(String dateUploaded){this.dateUploaded = dateUploaded;}
    public void setAvailableQualities(List<String> availableQualities){this.availableQualities = availableQualities;}
}
