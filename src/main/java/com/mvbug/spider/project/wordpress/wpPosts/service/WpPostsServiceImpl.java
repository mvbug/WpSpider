package com.mvbug.spider.project.wordpress.wpPosts.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mvbug.spider.project.wordpress.wpPosts.mapper.WpPostsMapper;
import com.mvbug.spider.project.wordpress.wpPosts.domain.WpPosts;
import com.mvbug.spider.project.wordpress.wpPosts.service.IWpPostsService;

/**
 * post 服务层实现
 * 
 * @author Lin
 * @date 2019-01-19
 */
@Service
public class WpPostsServiceImpl implements IWpPostsService 
{
	@Autowired
	private WpPostsMapper wpPostsMapper;

	/**
     * 查询post信息
     * 
     * @param iD postID
     * @return post信息
     */
    @Override
	public WpPosts selectWpPostsById(Long iD)
	{
	    return wpPostsMapper.selectWpPostsById(iD);
	}
	
	/**
     * 查询post列表
     * 
     * @param wpPosts post信息
     * @return post集合
     */
	@Override
	public List<WpPosts> selectWpPostsList(WpPosts wpPosts)
	{
	    return wpPostsMapper.selectWpPostsList(wpPosts);
	}
	
    /**
     * 新增post
     * 
     * @param wpPosts post信息
     * @return 结果
     */
	@Override
	public int insertWpPosts(WpPosts wpPosts)
	{
	    return wpPostsMapper.insertWpPosts(wpPosts);
	}
 
	
}
