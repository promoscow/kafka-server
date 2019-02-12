package ru.xpendence.kafkaserver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.02.19
 * e-mail: vyacheslav.chernyshov@stoloto.ru
 */
@Configuration
public class KafkaTopicConfig {

//    @Bean
//    public KafkaAdmin kafkaAdmin() {
//        Map<String, Object> configs = new HashMap<>();
//        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        return new KafkaAdmin(configs);
//    }

    @Bean
    public NewTopic sampleTopic() {
        return new NewTopic("sample", 1, (short) 1);
    }
}
