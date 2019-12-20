package com.freetsinghua.simplejavaapp.stock.model;

import lombok.*;

/**
 * @author octopus
 */
@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Fish {
    private String id;
    private String name;
    private Float size;
    private String remark;
}
