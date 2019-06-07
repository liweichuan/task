package com.jnshu.model;

public class Art {
    private Long id;

    private String title;

    private String main_menu_title;

    private String second_menu_title;

    private Integer status;

    private Long create_time;

    private Long update_time;

    private String editor;

    private String introduction;

    private String thumbnail;

    private String video_link;

    private String art_picture;

    private String text;

    public Art(Long id, String title, String main_menu_title, String second_menu_title, Integer status, Long create_time, Long update_time, String editor, String introduction, String thumbnail, String video_link, String art_picture, String text) {
        this.id = id;
        this.title = title;
        this.main_menu_title = main_menu_title;
        this.second_menu_title = second_menu_title;
        this.status = status;
        this.create_time = create_time;
        this.update_time = update_time;
        this.editor = editor;
        this.introduction = introduction;
        this.thumbnail = thumbnail;
        this.video_link = video_link;
        this.art_picture = art_picture;
        this.text = text;
    }

    public Art() {
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

    public String getMain_menu_title() {
        return main_menu_title;
    }

    public void setMain_menu_title(String main_menu_title) {
        this.main_menu_title = main_menu_title == null ? null : main_menu_title.trim();
    }

    public String getSecond_menu_title() {
        return second_menu_title;
    }

    public void setSecond_menu_title(String second_menu_title) {
        this.second_menu_title = second_menu_title == null ? null : second_menu_title.trim();
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public String getVideo_link() {
        return video_link;
    }

    public void setVideo_link(String video_link) {
        this.video_link = video_link == null ? null : video_link.trim();
    }

    public String getArt_picture() {
        return art_picture;
    }

    public void setArt_picture(String art_picture) {
        this.art_picture = art_picture == null ? null : art_picture.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    @Override
    public String toString() {
        return "Art{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", main_menu_title='" + main_menu_title + '\'' +
                ", second_menu_title='" + second_menu_title + '\'' +
                ", status=" + status +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", editor='" + editor + '\'' +
                ", introduction='" + introduction + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", video_link='" + video_link + '\'' +
                ", art_picture='" + art_picture + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}