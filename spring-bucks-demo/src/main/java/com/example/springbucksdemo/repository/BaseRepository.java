package com.example.springbucksdemo.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 *  extends 分页and排序
 * @param <T>
 * @param <Long>
 */
@NoRepositoryBean
public interface BaseRepository<T,Long> extends PagingAndSortingRepository<T,Long> {
    List<T> findTop3ByOrderByUpdateTimeDescIdAsc();
}
