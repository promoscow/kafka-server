package ru.xpendence.kafkaserver;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.kafka.annotation.EnableKafka;

import java.io.IOException;

@SpringBootApplication
@EnableKafka
//@EnableAutoConfiguration(exclude = {
//        KafkaAutoConfiguration.class
//})
@ComponentScan(basePackages = {
        "ru.xpendence.kafkaserver.config",
        "ru.xpendence.kafkaserver.controller",
        "ru.xpendence.kafkaserver.service",
})
@PropertySource({
        "classpath:kafka.properties"
})
public class KafkaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaServerApplication.class, args);
    }

    @Bean
    public JsonDeserializer jsonDeserializer() {
        return new JsonDeserializer() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext context) throws IOException {
                return null;
            }
        };
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}

