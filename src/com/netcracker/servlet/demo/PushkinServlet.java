package com.netcracker.servlet.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PushkinServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html; charset=windows-1251");
        PrintWriter out = res.getWriter();
        out.print("<html>\n" +
                "<head>\n" +
                "\t<title>Краткая биография Пушкина</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<center><h1>Информация</h1></center>\n" +
                "Великий русский поэт, прозаик, драматург, публицист, критик.\n" +
                "\n" +
                "Родился 26 мая (6 июня) в Москве, в Немецкой слободе. Воспитанный французскими гувернерами, " +
                "из домашнего обучения вынес только прекрасное знание французского и любовь к чтению.\n" +
                "<br/><br/>\n" +
                "<center><img alt=\"pushkin\" \n" +
                "src=\"http://citaty.su/wp-content/uploads/2011/07/pushkin.jpg\">\n" +
                "</center>\n" +
                "<br/><br/>\n" +
                "<font style=\"color:green\">Образование и начало творческого пути\n" +
                "<br/><br/>\n" +
                "<b>В 1811 году Пушкин учился в Царскосельском Лицее. " +
                "В биографии Пушкина важно выделить, что впервые его стихи появляются в печати в 1814 году, " +
                "в журнале «Вестник Европы», где публикуется его стих «К другу-стихотворцу». " +
                "В этот же период поэта принимают в литературное общество «Арзамас».\n" +
                "<br/><br/>\n" +
                "На дальнейшее творчество молодого Пушкина огромное влияние оказали труды таких классиков русской литературы, " +
                "как Батюшков, Жуковский, Фонвизин и Радищев.\n" +
                "<hr>\n" +
                "<br/><br/>\n" +
                "Спасибо. До новых встреч!\n" +
                "</body>\n" +
                "</html>");
    }

}
