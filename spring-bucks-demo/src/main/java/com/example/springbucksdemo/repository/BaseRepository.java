package com.example.springbucksdemo.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 *  extends 分页and排序
 * @param <T>
 * @param <Long>
 *
 * 分页查询
 * PagingAndSortingRepository<T,ID>
 * Pageable / Sort
 * Slice<T> / Page<T>
 *
 * @NoRepositoryBean 表示不需要为BaseRepository创建一个bean
 */
@NoRepositoryBean
public interface BaseRepository<T,Long> extends PagingAndSortingRepository<T,Long> {
    List<T> findTop3ByOrderByUpdateTimeDescIdAsc();
}
