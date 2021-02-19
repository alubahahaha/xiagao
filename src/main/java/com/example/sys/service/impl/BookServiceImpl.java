package com.example.sys.service.impl;

import com.example.sys.entity.Book;
import com.example.sys.mapper.BookMapper;
import com.example.sys.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author example
 * @since 2021-02-14
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
