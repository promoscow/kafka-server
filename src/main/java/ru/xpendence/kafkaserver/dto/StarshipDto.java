package ru.xpendence.kafkaserver.dto;

import lombok.Data;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 12.02.19
 * Time: 18:52
 * e-mail: vyacheslav.chernyshov@stoloto.ru
 */
@Data
public class StarshipDto extends AbstractDto {

    private String name;
    private String model;
}
