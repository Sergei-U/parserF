import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class JsoupParseRequest {
    public void jsoupParseRequest (String[] args) throws IOException {
    ArrayList<PageElement> pageElementList = new ArrayList <>();
    System.out.println ("Введите поисковый запрос");
    Scanner scannerReq = new Scanner(System.in);
    String strReq = scannerReq.nextLine();
    System.out.println ("Введите количество дней за которое нужно осуществить поиск от 2 до 180");
    Scanner scannerNum = new Scanner(System.in);
    int numReq = scannerNum.nextInt();
    Document doc = Jsoup.connect("https://www.sql.ru/forum/actualsearch.aspx?search="+strReq+"&sin=1&bid=66&a=&ma=0&dt="+numReq+"&s=4&so=1").get();
    Elements pageElements = doc.body().getElementsByAttributeValue("class", "postslisttopic");
     pageElements.forEach(pageElement -> {
        Element aElement = pageElement.child(0);
        String url = aElement.attr("href");
        String name = aElement.child(0).text();
        pageElementList.add(new PageElement(url, name));
    });
        pageElementList.forEach(System.out::println);
    }
}
