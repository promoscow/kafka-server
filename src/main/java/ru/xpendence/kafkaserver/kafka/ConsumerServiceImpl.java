package ru.xpendence.kafkaserver.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.02.19
 * Time: 18:57
 * e-mail: vyacheslav.chernyshov@stoloto.ru
 */
@Service
@Slf4j
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    @KafkaListener(topics = "message", groupId = "group_id")
    public void consume(String message) {
        log.info("=> consumed {}", message);
    }
}
