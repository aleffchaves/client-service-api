package io.github.meloncode.clientserviceapi.datasourse.converter;

import io.github.meloncode.clientserviceapi.datasourse.models.ClientData;
import io.github.meloncode.clientserviceapi.entities.Client;

public class ClientConverter {

    private ClientConverter() {
        throw new IllegalStateException("Utility Class");
    }

    public static ClientData clientDataToClient(final Client client) {

        return ClientData.builder()
                .id(client.getId())
                .name(client.getName())
                .age(client.getAge())
                .documentNumber(client.getDocumentNumber())
                .build();
    }
}
