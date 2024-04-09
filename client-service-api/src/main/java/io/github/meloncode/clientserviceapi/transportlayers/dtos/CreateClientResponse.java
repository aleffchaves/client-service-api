package io.github.meloncode.clientserviceapi.transportlayers.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateClientResponse {

    private final String headerLocation;
}
