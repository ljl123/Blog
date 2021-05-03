package com.ljl.service.impl;

import com.ljl.entity.Blog;
import com.ljl.mapper.BlogMapper;
import com.ljl.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注ljl
 * @since 2021-04-26
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
