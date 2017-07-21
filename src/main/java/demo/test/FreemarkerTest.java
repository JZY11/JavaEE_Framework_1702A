package demo.test;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/19.
 * JavaEE_Framework_1702A.
 */
public class FreemarkerTest {
    public static void main(String[] args) throws IOException, TemplateException {
        //获取spring容器这么一个变量
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中取得freeMarkerConfig这个bean
        //1.freemarker
        FreeMarkerConfig freeMarkerConfig = (FreeMarkerConfig) applicationContext.getBean("freemarker");

        String model = "Student";

        //2.模板
        Template template = freeMarkerConfig.getConfiguration().getTemplate("dao.ftl");
        //3.Java对象(Map<>对象，存放键值对)
        Map<String, String> map = new HashMap<>();
//        map.put("name", "world");
        map.put("model",model);

        //4.准备好一个输出的内容
//        Writer writer = new FileWriter("test.html");
        Writer writer = new FileWriter("src/main/java/demo/dao/" + model + "Dao.java");
        //4.准备好一个输出的内容
//        Writer writer = new FileWriter("Hello.html");

        //5.最后一步操作，生成结果
        template.process(map, writer);//FreeMarker Processing...



        /*
    Student
    fields:
        Integer id;
        String name;
        int age;
        double height;
        boolean married;
 */
    }
}
