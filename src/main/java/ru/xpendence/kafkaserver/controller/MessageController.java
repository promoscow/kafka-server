package ru.xpendence.kafkaserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.xpendence.kafkaserver.kafka.ProducerService;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.02.19
 * Time: 19:02
 * e-mail: vyacheslav.chernyshov@stoloto.ru
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    private final ProducerService service;

    @Autowired
    public MessageController(ProducerService service) {
        this.service = service;
    }

    @PostMapping
    public void send(@RequestParam("message") String message) {
        service.send(message);
    }
}
