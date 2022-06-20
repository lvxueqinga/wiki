package com.lvxueqing.wiki.service;

import com.lvxueqing.wiki.dao.EbookMapper;
import com.lvxueqing.wiki.domain.Ebook;
import com.lvxueqing.wiki.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//写业务逻辑的地方
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
