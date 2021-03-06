package com.social.entity;
// Generated Apr 24, 2017 9:29:38 AM by Hibernate Tools 4.3.1

import com.mysql.jdbc.Blob;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * ProfilePhotoAlbum generated by hbm2java
 */
@Entity
@Table(name = "profile_photo_album",
         catalog = "socialsite"
)
public class ProfilePhotoAlbum implements java.io.Serializable {

    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "profile_photo_id", unique = true, nullable = false)
    private Integer profilePhotoId;
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    @Column(name = "added_date", nullable = false, length = 10)
    private Date addedDate;
    @Column(name = "file_link", nullable = false, length = 45)
    private String fileLink;
    @Column(name = "status", nullable = false)
    private int status;

    public ProfilePhotoAlbum() {                                                            
    }

    public ProfilePhotoAlbum(Integer userId, Date addedDate, String  fileLink, int status) {
        this.userId = userId;
        this.addedDate = addedDate;
        this.fileLink = fileLink;
        this.status = status;
    }

    

    

    public Integer getProfilePhotoId() {
        return profilePhotoId;
    }

    public void setProfilePhotoId(Integer profilePhotoId) {
        this.profilePhotoId = profilePhotoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public String  getFileLink() {
        return fileLink;
    }

    public void setFileLink(String  fileLink) {
        this.fileLink = fileLink;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    

}
