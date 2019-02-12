package ru.xpendence.kafkaserver.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.02.19
 * Time: 18:56
 * e-mail: vyacheslav.chernyshov@stoloto.ru
 */
@Service
@Slf4j
public class ProducerServiceImpl implements ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public ProducerServiceImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void send(String message) {
        log.info("<= produced {}", message);
        kafkaTemplate.send("message", message);
    }
}
