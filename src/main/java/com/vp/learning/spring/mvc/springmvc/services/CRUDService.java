package com.vp.learning.spring.mvc.springmvc.services;

import java.util.List;

public interface CRUDService<T>{
    List<?> listAll();

    T getById(Integer id);

    T saveOrUpdate(T domainObject);

    void delete(Integer id);

}
