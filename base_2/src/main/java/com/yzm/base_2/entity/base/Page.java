package com.yzm.base_2.entity.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page<E> implements Serializable {
    private static final long serialVersionUID = -8093992033805880632L;
    private int start;
    private int nowPage;
    private int pageShow = 2;
    private int totalPage;
    private int totalCount;
    private List<E> result = Collections.emptyList();

    public int getStart() {
        start = (getNowPage() - 1) * getPageShow();
        if (start < 0) {
            start = 0;
        }
        return start;
    }

    public int getTotalPage() {
        return (int) Math.ceil(totalCount * 1.0 / pageShow);
    }

    public int getNowPage() {
        if (nowPage <= 0)
            nowPage = 1;
        if (nowPage > getTotalPage())
            nowPage = getTotalPage();
        return nowPage;
    }

}