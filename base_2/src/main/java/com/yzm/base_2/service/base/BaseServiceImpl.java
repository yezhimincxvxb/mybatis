package com.yzm.base_2.service.base;

import com.yzm.base_2.entity.base.BaseEntity;
import com.yzm.base_2.entity.base.BaseVo;
import com.yzm.base_2.entity.base.Page;
import com.yzm.base_2.mapper.base.BaseMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class BaseServiceImpl<E extends BaseEntity, Q extends BaseVo> implements BaseService<E, Q> {

    private BaseMapper mapper = null;

    public void setMapper(BaseMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public boolean save(E e) {
        return mapper.save(e);
    }

    @Override
    public boolean update(E e) {
        return mapper.update(e);
    }

    @Override
    public boolean delete(Integer id) {
        return mapper.delete(id);
    }

    @Override
    public E getOne(Integer id) {
        return (E) mapper.getOne(id);
    }

    @Override
    public List<E> list() {
        return (List<E>) mapper.list();
    }

    @Override
    public Page<E> page(Q q) {
        List<E> list = mapper.page(q);
        Page<E> page = q.getPage();
        page.setResult(list);
        return page;
    }
}
