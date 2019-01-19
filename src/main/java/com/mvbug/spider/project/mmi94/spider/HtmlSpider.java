package com.mvbug.spider.project.mmi94.spider;

import java.util.Date;
import java.util.UUID;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.mvbug.spider.project.wordpress.wpPosts.domain.WpPosts;
import com.mvbug.spider.project.wordpress.wpPosts.mapper.WpPostsMapper;
import com.mvbug.spider.project.wordpress.wpPosts.service.IWpPostsService;
import com.mvbug.spider.project.wordpress.wpPosts.service.WpPostsServiceImpl;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

@Controller
public class HtmlSpider  implements PageProcessor {

	
	private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

	@Autowired
	private IWpPostsService postsService;
 
	
	@Override
	public void process(Page page) {
	 
		Html html= page.getHtml();
		
		String title=html.xpath("//h1[@class='focusbox-title']/text()").get();
		String keywords=html.xpath("//meta[@name='keywords']/@content").get()+"MVBUG";
		String body= html.xpath("//article[@class='article-content']").replace("<!--(.*?)-->", "").replace("<article class=\"article-content\">","").replace("</article>","").get();
		String [] stringArr= keywords.split(",");
	
		
		
		for (String key : stringArr) {
			System.out.println("Key:"+key);
		}
		
		WpPosts wpPosts=new WpPosts();
		
		wpPosts.setPostAuthor(1L);  //作者
		wpPosts.setPostDate(new Date());
		wpPosts.setPostDateGmt(new Date());
		wpPosts.setPostContent(body); //文章内容
		wpPosts.setPostTitle(title);//文章标题
		wpPosts.setPostStatus("publish");
		wpPosts.setCommentStatus("open");
		wpPosts.setPingStatus("closed");
		wpPosts.setPostName(UUID.randomUUID()+"");
		wpPosts.setPostModified(new Date());
		wpPosts.setPostModifiedGmt(new Date());
		wpPosts.setPostType("post");
 		postsService.insertWpPosts(wpPosts);

	
	}

	public static void main(String[] args) throws Exception {
		
 
		
	}
	

    @Override
    public Site getSite() {
        return site;
    }
}
