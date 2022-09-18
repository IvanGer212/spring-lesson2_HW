package com.geekbrains.ru.springlesson2_hw;

import com.geekbrains.ru.springlesson2_hw.config.AppConfig;
import com.geekbrains.ru.springlesson2_hw.service.ArchiveService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringLesson2HwApplication {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ArchiveService archiveServiceImpl = context.getBean("archiveServiceImpl", ArchiveService.class);

        System.out.println(archiveServiceImpl.findClientCardByName("Ivanov").toString());

    }

}
