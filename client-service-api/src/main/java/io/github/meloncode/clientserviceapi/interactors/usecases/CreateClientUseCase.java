package io.github.meloncode.clientserviceapi.interactors.usecases;

import io.github.meloncode.clientserviceapi.entities.Client;
import io.github.meloncode.clientserviceapi.interactors.dtos.CreateClientModel;
import io.github.meloncode.clientserviceapi.interactors.ports.CreateClientInputPort;
import io.github.meloncode.clientserviceapi.providers.ClientProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateClientUseCase implements CreateClientInputPort {

    private final ClientProvider provider;

    @Override
    public void execute(final CreateClientModel createClientModel) {
        CreateClientUseCase.log.info("USE CASE - create - CreateClientUseCase");

        final var client = this.buildClient(createClientModel);
        this.provider.save(client);
    }

    private Client buildClient(final CreateClientModel model) {
        return Client.builder()
                .id(UUID.randomUUID().toString())
                .name(model.getName())
                .age(model.getAge())
                .documentNumber(model.getDocumentNumber())
                .build();
    }
}
