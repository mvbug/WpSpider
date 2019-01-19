package com.mvbug.spider.project.wordpress.service.serviceimpl;


 import com.mvbug.spider.project.wordpress.mapper.WpTermsMapper;
 import com.mvbug.spider.project.wordpress.service.WpTermsService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

@Service
public class WpTermsServiceImpl implements WpTermsService {

    @Autowired
    private WpTermsMapper wpTermsDao;

    @Override
    public int findTerms(String name) {
        return wpTermsDao.findTerms(name);
    }


}
