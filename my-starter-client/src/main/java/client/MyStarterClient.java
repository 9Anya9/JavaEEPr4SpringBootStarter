package client;

import library.MyLibraryClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyStarterClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MyStarterClient.class, args);

        MyLibraryClass myLibrary1 = applicationContext.getBean(MyLibraryClass.class);
        myLibrary1.printInfo();

        MyLibraryClass myLibrary2 = applicationContext.getBean(MyLibraryClass.class);
        myLibrary2.printInfo();
    }
}
