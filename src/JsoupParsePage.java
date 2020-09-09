import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JsoupParsePage {
    public void jsoupParsePage (String[] args) throws IOException {
        System.out.println("Введите номер страницы от 2 до 1000");
        Scanner scanner = new Scanner(System.in);
        int pageNumb = scanner.nextInt();
        ArrayList<PageElement> pageElementList = new ArrayList <>();
        for (int i = 1; i < pageNumb; i++) {
            Document doc = Jsoup.connect("https://www.sql.ru/forum/job/" + i).get();
            Elements postElement = doc.body().getElementsByAttributeValue("class", "postslisttopic");
            postElement.forEach(postElements -> {
                Element aElement = postElements.child(0);
                String url = aElement.attr("href");
                String name = aElement.child(0).text();
                pageElementList.add(new PageElement(url, name));
            });

            pageElementList.forEach(System.out::println);
        }
    }
}
