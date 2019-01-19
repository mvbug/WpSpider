package com.mvbug.spider.project.wordpress.wpPosts.service;

import com.mvbug.spider.project.wordpress.wpPosts.domain.WpPosts;
import java.util.List;

/**
 * post 服务层
 * 
 * @author Lin
 * @date 2019-01-19
 */
public interface IWpPostsService 
{
	/**
     * 查询post信息
     * 
     * @param iD postID
     * @return post信息
     */
	public WpPosts selectWpPostsById(Long iD);
	
	/**
     * 查询post列表
     * 
     * @param wpPosts post信息
     * @return post集合
     */
	public List<WpPosts> selectWpPostsList(WpPosts wpPosts);
	
	/**
     * 新增post
     * 
     * @param wpPosts post信息
     * @return 结果
     */
	public int insertWpPosts(WpPosts wpPosts);
	
	 
	
}
