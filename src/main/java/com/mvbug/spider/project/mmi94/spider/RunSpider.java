package com.mvbug.spider.project.mmi94.spider;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

@Component
public class RunSpider  implements PageProcessor ,CommandLineRunner {
	
	private Site site = Site.me().setRetryTimes(3).setSleepTime(2000);


	HtmlSpider htmlSpider=new HtmlSpider();
	
	 @Override
	    // process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
	    public void process(Page page) {


		 	
		 	Html html= page.getHtml();
		 	
		 	Selectable select=  html.xpath("//div[@class='excerpts']");
		 	
		 	
		 	List<String> UrlList=  	select.$("article>h2>a:eq(1)").links().all();
		 	for (String a : UrlList) {
				  OOSpider.create(htmlSpider).addUrl(a).thread(10).run();
			}
	    }

	
	

	    @Override
	    public Site getSite() {
	        return site;
	    }
	
 



	@Override
	public void run(String... args) throws Exception {
		 for (int i = 0; i < 85; i++) {
			 OOSpider.create(new RunSpider()).addUrl("https://www.94imm.com/type/3/?page="+i).thread(10).run();
		}
		
	}
 



}
