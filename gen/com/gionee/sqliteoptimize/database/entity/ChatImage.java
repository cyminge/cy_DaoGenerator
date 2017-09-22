package com.gionee.sqliteoptimize.database.entity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CHAT_IMAGE.
 */
public class ChatImage implements java.io.Serializable {

    private Long id;
    private String localPath;
    private String localResz;
    private String url;
    private String urlResz;

    public ChatImage() {
    }

    public ChatImage(Long id) {
        this.id = id;
    }

    public ChatImage(Long id, String localPath, String localResz, String url, String urlResz) {
        this.id = id;
        this.localPath = localPath;
        this.localResz = localResz;
        this.url = url;
        this.urlResz = urlResz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public String getLocalResz() {
        return localResz;
    }

    public void setLocalResz(String localResz) {
        this.localResz = localResz;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlResz() {
        return urlResz;
    }

    public void setUrlResz(String urlResz) {
        this.urlResz = urlResz;
    }

}
