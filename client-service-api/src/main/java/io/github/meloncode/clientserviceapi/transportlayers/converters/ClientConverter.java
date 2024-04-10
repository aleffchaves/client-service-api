package io.github.meloncode.clientserviceapi.transportlayers.converters;

import io.github.meloncode.clientserviceapi.interactors.dtos.CreateClientModel;
import io.github.meloncode.clientserviceapi.transportlayers.dtos.CreateClientRequest;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@UtilityClass
public class ClientConverter {

    public static CreateClientModel createClientRequestToCreateClientModel(final CreateClientRequest request) {
        return CreateClientModel.builder()
                .name(request.getName())
                .documentNumber(request.getDocumentNumber())
                .age(request.getAge())
                .build();
    }
}
