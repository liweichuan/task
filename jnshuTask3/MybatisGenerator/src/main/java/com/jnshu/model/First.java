package com.jnshu.model;

public class First {
    private Long id;

    private String title;

    private Integer status;

    private Long create_time;

    private Long update_time;

    private String editor;

    public First(Long id, String title, Integer status, Long create_time, Long update_time, String editor) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.create_time = create_time;
        this.update_time = update_time;
        this.editor = editor;
    }

    public First() {
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

    @Override
    public String toString() {
        return "First{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", editor='" + editor + '\'' +
                '}';
    }
}