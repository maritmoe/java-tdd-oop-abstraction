package com.booleanuk.core;


// Morning activity
public class TodoItem {
    private String title;
    private String detail;
    private String status;

    public TodoItem(String title, String detail, String status) {
        this.setTitle(title);
        this.setDetail(detail);
        this.setStatus(status);
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setDetail(String detail) {

        this.detail = detail;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public String getTitle() {

        return this.title;
    }

    public String getDetail() {

        return this.detail;
    }

    public String getStatus() {

        return this.status;
    }
}
