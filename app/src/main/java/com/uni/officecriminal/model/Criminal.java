package com.uni.officecriminal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Criminal {
    String title;
    String description;
    Boolean sovled;
    String imagePath;
    Date creationDate;

    public Criminal() {
    }

    public Criminal(String title, Date creationDate) {
        this.title = title;
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isSovled() {
        return sovled;
    }

    public void setSovled(Boolean sovled) {
        this.sovled = sovled;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public static List<Criminal> generateCriminals() {
        List<Criminal> criminals = new ArrayList<>();
        for(int i=0; i<100; i++) {
            String title = String.format("Criminal #%d", i);
            Date creationDate = new Date();
            criminals.add(new Criminal(title, creationDate));
        }
        return criminals;
    }
}
