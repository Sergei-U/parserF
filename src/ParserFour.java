import java.util.Scanner;

public class ParserFour {
    public static void main(String[] args) {
        System.out.println("1. Для парсинга по ключевому слову и дате публикации");
        System.out.println("2. Для парсинга по дате размещения");
        System.out.println("s. Stop program");
        String parseSite = "sql.ru";
        Scanner scanner = new Scanner(System.in);
        boolean resultExecute = true;
        String str = scanner.nextLine();
        boolean execute = true;
        while (execute) {
            String operation = str;
            switch (operation) {
                case "1":
                    try {
                        if (resultExecute) {
                            JsoupParseRequest jsoupParseRequest = new JsoupParseRequest();
                            System.out.println(jsoupParseRequest);
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                case "2":
                    try {
                        if (resultExecute) {
                            JsoupParsePage jsoupParsePage = new JsoupParsePage();
                            System.out.println(jsoupParsePage);
                        } else {
                            break;
                        }


                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                case "s":
                    break;
            }
        }
    }
}
//            postElement.forEach(postElement -> {
//                Element aElement = postElement.child(0);
//                String url = aElement.attr("href");
//                String title = aElement.child(0).text();
//                articleList.add(new Article(url, title));
//            });
//            articleList.forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    class Article {
//            private String nameUrl;
//            private String dateVacancy;
//
//        public String getNameUrl() {
//            return nameUrl;
//        }
//
//        public void setNameUrl(String nameUrl) {
//            this.nameUrl = nameUrl;
//        }
//
//        public String getDateVacancy() {
//            return dateVacancy;
//        }
//
//        public void setDateVacancy(String dateVacancy) {
//            this.dateVacancy = dateVacancy;
//        }
//
//        @Override
//        public String toString() {
//            return "Article{" +
//                    "nameUrl='" + nameUrl + '\'' +
//                    ", dateVacancy='" + dateVacancy + '\'' +
//                    '}';
//        }
//    }
//
//
//
//    }