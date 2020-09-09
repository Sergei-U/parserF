//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class StartRequest {
//        String reqvestUrl = "sql.ru";
//        String vacancyRequest = null;
//        System.out.println("Enter yuor vacancy Request");
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String str = bf.readLine();
//        boolean execute = true;
//        while (execute) {
//            String operation = str;
//            boolean resultExecute = true;
//            switch (operation) {
//                case "1" :
//                case "sql.ru" :
//                    try {
//                        if (resultExecute) {
//                            System.out.println("Input your vacancy Request: ");
//                            reqvestUrl = bf.readLine();
//                            resultExecute = true;
//                        } else {
//                            break;
//                        }
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//            }}}
