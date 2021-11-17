package com.health.pojo;

import java.io.Serializable;

public class Article implements Serializable {
    private Integer id;//主键
    private String title;
    private String content;
    private String content_introduce;
    private String time;//主键
    private String imgurl;//主键

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getContent_introduce() {
        return content_introduce;
    }
    public void setContent_introduce(String content_introduce) {
        this.content_introduce = content_introduce;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public String getImgurl() {
        return imgurl;
    }
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
