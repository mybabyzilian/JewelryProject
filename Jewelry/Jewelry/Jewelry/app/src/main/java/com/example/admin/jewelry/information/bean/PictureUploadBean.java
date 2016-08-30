package com.example.admin.jewelry.information.bean;

/**
 * Created by JINDAPENG on 2016/8/16.
 */
public class PictureUploadBean {
    private String upload_dir,user_id;
    private int file;

    public String getUpload_dir() {
        return upload_dir;
    }

    public void setUpload_dir(String upload_dir) {
        this.upload_dir = upload_dir;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }
}
