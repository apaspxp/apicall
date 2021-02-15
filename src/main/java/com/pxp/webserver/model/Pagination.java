package com.pxp.webserver.model;

public class Pagination {

    private int total;
    private int pages;
    private int page;
    private int limit;

    public Pagination(int total, int pages, int page, int limit) {
        this.total = total;
        this.pages = pages;
        this.page = page;
        this.limit = limit;
    }

    public Pagination() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
