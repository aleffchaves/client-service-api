package io.github.meloncode.clientserviceapi.entities;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Client {

    private String id;
    private String name;
    private Integer age;
    private String documentNumber;
}
