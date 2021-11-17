package com.health.entity;

import com.health.pojo.CheckItem;

import java.io.Serializable;
import java.util.List;

/**
 * 封装查询条件
 */
public class QueryPageBean2 implements Serializable{
    private Integer currentPage;//页码
    private Integer pageSize;//每页记录数
//    private List<QueryStrings> queryStrings;
    private String organization;//查询条件
    private String queryString;//查询条件

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getQueryString() {
        return queryString;
    }
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

//    public List<QueryStrings> getQueryStrings() {
//        return queryStrings;
//    }
//    public void setQueryStrings(List<QueryStrings> queryStrings) {
//        this.queryStrings = queryStrings;
//    }
}