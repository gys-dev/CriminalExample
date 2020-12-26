package com.uni.officecriminal.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Criminal {
    @Id(autoincrement = true)
    long id;
    String title;
    String description;
    Boolean sovled;
    @Property(nameInDb = "image_path")
    String imagePath;
    @Transient
    Date creationDate;
    public Criminal() {
    }

    public Criminal(String title, Date creationDate) {
        this.title = title;
        this.creationDate = creationDate;
    }

    @Generated(hash = 2056019325)
    public Criminal(long id, String title, String description, Boolean sovled,
            String imagePath) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.sovled = sovled;
        this.imagePath = imagePath;
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

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getSovled() {
        return this.sovled;
    }
}
