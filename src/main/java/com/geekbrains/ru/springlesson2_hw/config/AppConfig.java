package com.geekbrains.ru.springlesson2_hw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({"com.geekbrains.ru.springlesson2_hw.repository","com.geekbrains.ru.springlesson2_hw.service"})
@Configuration
public class AppConfig {
}
