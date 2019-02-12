package ru.xpendence.kafkaserver.kafka;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.02.19
 * Time: 18:53
 * e-mail: vyacheslav.chernyshov@stoloto.ru
 */
public interface ProducerService {

    void send(String message);
}
