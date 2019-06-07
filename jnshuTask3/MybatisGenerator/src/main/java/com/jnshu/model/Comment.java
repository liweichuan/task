package com.jnshu.model;

public class Comment {
    private Long id;

    private String title;

    private Integer type;

    private Long reply_id;

    private String nickname;

    private Integer status;

    private Long create_time;

    private Long update_time;

    private String editor;

    private String text;

    public Comment(Long id, String title, Integer type, Long reply_id, String nickname, Integer status, Long create_time, Long update_time, String editor, String text) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.reply_id = reply_id;
        this.nickname = nickname;
        this.status = status;
        this.create_time = create_time;
        this.update_time = update_time;
        this.editor = editor;
        this.text = text;
    }

    public Comment() {
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getReply_id() {
        return reply_id;
    }

    public void setReply_id(Long reply_id) {
        this.reply_id = reply_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", reply_id=" + reply_id +
                ", nickname='" + nickname + '\'' +
                ", status=" + status +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", editor='" + editor + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}