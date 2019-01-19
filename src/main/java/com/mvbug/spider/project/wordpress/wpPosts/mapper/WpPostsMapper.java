package com.mvbug.spider.project.wordpress.wpPosts.mapper;

import com.mvbug.spider.project.wordpress.wpPosts.domain.WpPosts;
import java.util.List;	

/**
 * post 数据层
 * 
 * @author Lin
 * @date 2019-01-19
 */
public interface WpPostsMapper 
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
	
	/**
     * 修改post
     * 
     * @param wpPosts post信息
     * @return 结果
     */
	public int updateWpPosts(WpPosts wpPosts);
	
	/**
     * 删除post
     * 
     * @param iD postID
     * @return 结果
     */
	public int deleteWpPostsById(Long iD);
	
	/**
     * 批量删除post
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteWpPostsByIds(String[] iDs);
	
}