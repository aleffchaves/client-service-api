package io.github.meloncode.clientserviceapi.transportlayers.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateClientRequest {

    private final String name;
    private final String documentNumber;
    private final Integer age;
}
