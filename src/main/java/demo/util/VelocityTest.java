package demo.util;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.velocity.VelocityConfig;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by mingfei.net@gmail.com
 * 7/19/17 16:28
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class VelocityTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("velocity.xml");
        VelocityConfig velocityConfig = (VelocityConfig) applicationContext.getBean("velocity");

        Template template = velocityConfig.getVelocityEngine().getTemplate("test.vm");

        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("name", "Velocity");

        try (Writer writer = new FileWriter("velocity.html")) {
            template.merge(velocityContext, writer);
        }
    }
}