package com.lvxueqing.wiki.service;

import com.lvxueqing.wiki.dao.ITestDao;
import com.lvxueqing.wiki.domain.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//写业务逻辑的地方
@Service
public class testService {

    @Resource
    private ITestDao iTestDao;

    public List<Test> list(){
        return iTestDao.getTestList();
    }
}
