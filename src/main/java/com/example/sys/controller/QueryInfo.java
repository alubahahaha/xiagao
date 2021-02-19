package com.example.sys.controller;

import lombok.Data;

@Data
public class QueryInfo {
    private String query;    //查询 id
    private int pageNum=1;    //页数
    private int pageSize=1;     //页容量
}
