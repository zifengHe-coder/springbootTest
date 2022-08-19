import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

/**
 * @author hezifeng
 * @create 2022/8/19 16:59
 */
public class SpringApplication {
    public static void run() {
        //创建tomcat实例
        Tomcat tomcat = new Tomcat();
        //设置tomcat端口
        tomcat.setPort(8993);
        try {
            tomcat.addWebapp("/","D:\\");
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }

    }
}
