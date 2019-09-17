package com.ryan.shorturl.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhangjianbing
 * time 2019/9/17
 */
public interface ShortenerMapper {


    @Select({
            "SELECT",
            "original_url",
            "FROM",
            "t_short_url",
            "WHERE",
            "short_key = #{key}",
    })
    String lookup(@Param("key") String key);

}
