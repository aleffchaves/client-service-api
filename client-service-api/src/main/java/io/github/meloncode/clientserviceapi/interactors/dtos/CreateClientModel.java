package io.github.meloncode.clientserviceapi.interactors.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateClientModel {
    private String name;
    private Integer age;
    private String documentNumber;
}
