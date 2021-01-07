package com.hq.config;

import com.hq.config.Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Config.class)
public class Config1 {

}
