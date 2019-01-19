package com.mvbug.spider.project.wordpress.wpPosts.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import us.codecraft.webmagic.selector.Selectable;

import java.io.Serializable;
import java.util.Date;

/**
 * post表 wp_posts
 * 
 * @author Lin
 * @date 2019-01-19
 */
public class WpPosts implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long iD;
	/**  */
	private Long postAuthor;
	/**  */
	private Date postDate;
	/**  */
	private Date postDateGmt;
	/**  */
	private String postContent;
	/**  */
	private String postTitle;
	/**  */
	private String postExcerpt;
	/**  */
	private String postStatus;
	/**  */
	private String commentStatus;
	/**  */
	private String pingStatus;
	/**  */
	private String postPassword;
	/**  */
	private String postName;
	/**  */
	private String toPing;
	/**  */
	private String pinged;
	/**  */
	private Date postModified;
	/**  */
	private Date postModifiedGmt;
	/**  */
	private String postContentFiltered;
	/**  */
	private Long postParent;
	/**  */
	private String guid;
	/**  */
	private Integer menuOrder;
	/**  */
	private String postType;
	/**  */
	private String postMimeType;
	/**  */
	private Long commentCount;

	public void setID(Long iD) 
	{
		this.iD = iD;
	}

	public Long getID() 
	{
		return iD;
	}
	public void setPostAuthor(Long postAuthor) 
	{
		this.postAuthor = postAuthor;
	}

	public Long getPostAuthor() 
	{
		return postAuthor;
	}
	public void setPostDate(Date postDate) 
	{
		this.postDate = postDate;
	}

	public Date getPostDate() 
	{
		return postDate;
	}
	public void setPostDateGmt(Date postDateGmt) 
	{
		this.postDateGmt = postDateGmt;
	}

	public Date getPostDateGmt() 
	{
		return postDateGmt;
	}
	public void setPostContent(String postContent) 
	{
		this.postContent = postContent;
	}

	public String getPostContent() 
	{
		return postContent;
	}
	public void setPostTitle(String postTitle) 
	{
		this.postTitle = postTitle;
	}

	public String getPostTitle() 
	{
		return postTitle;
	}
	public void setPostExcerpt(String postExcerpt) 
	{
		this.postExcerpt = postExcerpt;
	}

	public String getPostExcerpt() 
	{
		return postExcerpt;
	}
	public void setPostStatus(String postStatus) 
	{
		this.postStatus = postStatus;
	}

	public String getPostStatus() 
	{
		return postStatus;
	}
	public void setCommentStatus(String commentStatus) 
	{
		this.commentStatus = commentStatus;
	}

	public String getCommentStatus() 
	{
		return commentStatus;
	}
	public void setPingStatus(String pingStatus) 
	{
		this.pingStatus = pingStatus;
	}

	public String getPingStatus() 
	{
		return pingStatus;
	}
	public void setPostPassword(String postPassword) 
	{
		this.postPassword = postPassword;
	}

	public String getPostPassword() 
	{
		return postPassword;
	}
	public void setPostName(String postName) 
	{
		this.postName = postName;
	}

	public String getPostName() 
	{
		return postName;
	}
	public void setToPing(String toPing) 
	{
		this.toPing = toPing;
	}

	public String getToPing() 
	{
		return toPing;
	}
	public void setPinged(String pinged) 
	{
		this.pinged = pinged;
	}

	public String getPinged() 
	{
		return pinged;
	}
	public void setPostModified(Date postModified) 
	{
		this.postModified = postModified;
	}

	public Date getPostModified() 
	{
		return postModified;
	}
	public void setPostModifiedGmt(Date postModifiedGmt) 
	{
		this.postModifiedGmt = postModifiedGmt;
	}

	public Date getPostModifiedGmt() 
	{
		return postModifiedGmt;
	}
	public void setPostContentFiltered(String postContentFiltered) 
	{
		this.postContentFiltered = postContentFiltered;
	}

	public String getPostContentFiltered() 
	{
		return postContentFiltered;
	}
	public void setPostParent(Long postParent) 
	{
		this.postParent = postParent;
	}

	public Long getPostParent() 
	{
		return postParent;
	}
	public void setGuid(String guid) 
	{
		this.guid = guid;
	}

	public String getGuid() 
	{
		return guid;
	}
	public void setMenuOrder(Integer menuOrder) 
	{
		this.menuOrder = menuOrder;
	}

	public Integer getMenuOrder() 
	{
		return menuOrder;
	}
	public void setPostType(String postType) 
	{
		this.postType = postType;
	}

	public String getPostType() 
	{
		return postType;
	}
	public void setPostMimeType(String postMimeType) 
	{
		this.postMimeType = postMimeType;
	}

	public String getPostMimeType() 
	{
		return postMimeType;
	}
	public void setCommentCount(Long commentCount) 
	{
		this.commentCount = commentCount;
	}

	public Long getCommentCount() 
	{
		return commentCount;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("iD", getID())
            .append("postAuthor", getPostAuthor())
            .append("postDate", getPostDate())
            .append("postDateGmt", getPostDateGmt())
            .append("postContent", getPostContent())
            .append("postTitle", getPostTitle())
            .append("postExcerpt", getPostExcerpt())
            .append("postStatus", getPostStatus())
            .append("commentStatus", getCommentStatus())
            .append("pingStatus", getPingStatus())
            .append("postPassword", getPostPassword())
            .append("postName", getPostName())
            .append("toPing", getToPing())
            .append("pinged", getPinged())
            .append("postModified", getPostModified())
            .append("postModifiedGmt", getPostModifiedGmt())
            .append("postContentFiltered", getPostContentFiltered())
            .append("postParent", getPostParent())
            .append("guid", getGuid())
            .append("menuOrder", getMenuOrder())
            .append("postType", getPostType())
            .append("postMimeType", getPostMimeType())
            .append("commentCount", getCommentCount())
            .toString();
    }
}
