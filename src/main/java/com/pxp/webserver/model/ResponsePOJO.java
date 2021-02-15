package com.pxp.webserver.model;

import java.sql.Timestamp;

public class ResponsePOJO {

    private int id;
    private int user_id;
    private String title;
    private String body;
    private Timestamp created_at;
    private Timestamp updated_at;

    public ResponsePOJO(int id, int user_id, String title, String body, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.body = body;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public ResponsePOJO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
