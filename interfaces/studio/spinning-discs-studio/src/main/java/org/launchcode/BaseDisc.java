package org.launchcode;

import java.util.Date;

public abstract class BaseDisc
{
    private String title;
    private double duration;
    private String genre;
    private double storageCapacity;
    private String producerName;
    private Date releaseDate;
    private String formatType;

    public BaseDisc(String title, double duration, String genre, double storageCapacity, String producerName, Date releaseDate, String formatType)
    {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.storageCapacity = storageCapacity;
        this.producerName = producerName;
        this.releaseDate = releaseDate;
        this.formatType = formatType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getFormatType() {
        return formatType;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }
}
