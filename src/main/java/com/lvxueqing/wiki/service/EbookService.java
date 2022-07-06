package com.lvxueqing.wiki.service;

import com.lvxueqing.wiki.dao.EbookMapper;
import com.lvxueqing.wiki.domain.Ebook;
import com.lvxueqing.wiki.domain.EbookExample;
import com.lvxueqing.wiki.domain.User;
import com.lvxueqing.wiki.req.EbookReq;
import com.lvxueqing.wiki.resp.EbookResp;
import com.lvxueqing.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

//写业务逻辑的地方
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        //固定写法！
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())){
            criteria.andNameLike("%" + req.getName() + "%");
        }


        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebookList){
//            EbookResp ebookResp = new EbookResp();
//            BeanUtils.copyProperties(ebook,ebookResp);
//            respList.add(ebookResp);
//        }

        List<EbookResp> respList = CopyUtil.copyList(ebookList,EbookResp.class);

        return respList;
    }
}
