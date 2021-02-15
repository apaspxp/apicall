package com.pxp.webserver.model;

import java.util.List;

public class FinalResponse {

    private int code;
    private Pagination pagination;
    private List<ResponsePOJO> data;

    public FinalResponse(int code, Pagination pagination, List<ResponsePOJO> data) {
        this.code = code;
        this.pagination = pagination;
        this.data = data;
    }

    public FinalResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<ResponsePOJO> getData() {
        return data;
    }

    public void setData(List<ResponsePOJO> data) {
        this.data = data;
    }
}
