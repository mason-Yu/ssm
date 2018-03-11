package com.service.baseService;

import java.util.List;

public interface BaseService<T> {
public List<T> pageList(List<T> listInfo,Integer pageNum,Integer pageSize);

}
