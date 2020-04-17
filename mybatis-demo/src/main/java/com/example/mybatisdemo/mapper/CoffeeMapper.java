package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.model.Coffee;
import org.apache.ibatis.annotations.*;

/**
 * @author ukyozq
 * @date 2020/4/11 18:29:58
 */
@Mapper
public interface CoffeeMapper {
    @Insert("insert into t_coffee (name,price,create_time,update_time)" +
            "values(#{name},#{price},now(),now())")
    //自增主键
    @Options(useGeneratedKeys = true)
    int save(Coffee coffee);

    @Select("select * from t_coffee where id = #{id}")
    //映射关系
    @Results({
            @Result(id = true,column = "id",property = "id"),
            //mybatis.configuration.map-underscore-to-camel-case=true 可以实现一样的效果
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "update_time",property = "updateTime"),
    })
    Coffee findById(@Param("id") Long id);

}
