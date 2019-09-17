package com.ryan.shorturl.service.impl;

import com.ryan.shorturl.mapper.ShortenerMapper;
import com.ryan.shorturl.service.IShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangjianbing
 * time 2019/9/17
 */
@Service
public class IShortenerServiceImpl implements IShortenerService {

    @Autowired
    private ShortenerMapper shortenerMapper;

    @Override
    public String lookup(String key) {
        return shortenerMapper.lookup(key);
    }

}
