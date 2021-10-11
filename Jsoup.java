package testdb;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class red {
	public static void main(String[] args) {
		String html = "https://www.webscrapingapi.com/";
		try {
			Document doc = Jsoup.connect(html).get();
			String d= doc.title();
			System.out.println(d);
			
			
			Elements para= doc.select("img");
			Elements para1= doc.getElementsByTag("li");
            for(Element e: para) {
           	//System.out.println(e.text());
//            	System.out.println("8888888888888888888888888888888888888888");
//            	System.out.println(e.attr("href"));
            }
    
           for(Element src: para) {
            	System.out.println(src.attr("abs:src"));

            }
		} catch (IOException e) {

		}
	}
}
