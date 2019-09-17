package com.ryan.shorturl.controller;

import com.ryan.shorturl.service.IShortenerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

/**
 * @author zhangjianbing
 * time 2019/9/16
 */
@Controller
public class ClickController {

    @Resource
    private IShortenerService shortenerService;

    @GetMapping("/{key}")
    public String lookup(@PathVariable String key) {
        String originalUrl = shortenerService.lookup(key);
        if (StringUtils.isBlank(originalUrl)) {
            // 如果没有找到长链接，跳转到首页
            return "redirect:https://www.zhangjianbing.com";
        }
        return "redirect:" + originalUrl;
    }
    
}
