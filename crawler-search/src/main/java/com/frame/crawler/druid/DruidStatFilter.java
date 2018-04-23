package com.frame.crawler.druid;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;
/**
 * Druid 过滤器
 * Created by zhh on 2018/03/30.
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
			initParams = {
					@WebInitParam(name = "exclusions", value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*") // 忽略的资源
			})
public class DruidStatFilter extends WebStatFilter {

}
