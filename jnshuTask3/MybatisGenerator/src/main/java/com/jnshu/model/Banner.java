package com.jnshu.model;

public class Banner {
    private Long id;

    private String page;

    private String editor;

    private String url;

    private Integer status;

    private Long create_time;

    private Long update_time;

    public Banner(Long id, String page, String editor, String url, Integer status, Long create_time, Long update_time) {
        this.id = id;
        this.page = page;
        this.editor = editor;
        this.url = url;
        this.status = status;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public Banner() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page == null ? null : page.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", page='" + page + '\'' +
                ", editor='" + editor + '\'' +
                ", url='" + url + '\'' +
                ", status=" + status +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}