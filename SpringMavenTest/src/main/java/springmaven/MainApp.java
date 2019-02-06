package springmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext
//                ("Beans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.getMessage();

        //需要注册一个在 AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法。
        // 它将确保正常关闭，并且调用相关的 destroy 方法。
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }


}
