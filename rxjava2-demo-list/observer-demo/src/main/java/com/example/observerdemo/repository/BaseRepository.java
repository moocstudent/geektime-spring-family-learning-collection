package com.example.observerdemo.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 16:57
 */
@NoRepositoryBean
public interface BaseRepository<T,Long> extends PagingAndSortingRepository<T,Long> {
}
