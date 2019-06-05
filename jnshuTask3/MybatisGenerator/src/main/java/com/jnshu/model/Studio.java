package com.jnshu.model;

public class Studio {
    private Long id;

    private String title;

    private Integer status;

    private Long create_time;

    private Long update_time;

    private String editor;

    private String picture;

    private String text;

    public Studio(Long id, String title, Integer status, Long create_time, Long update_time, String editor, String picture, String text) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.create_time = create_time;
        this.update_time = update_time;
        this.editor = editor;
        this.picture = picture;
        this.text = text;
    }

    public Studio() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Long update_time) {
        this.update_time = update_time;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}