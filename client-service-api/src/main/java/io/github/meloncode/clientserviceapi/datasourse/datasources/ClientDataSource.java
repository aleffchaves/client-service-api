package io.github.meloncode.clientserviceapi.datasourse.datasources;

import io.github.meloncode.clientserviceapi.datasourse.converter.ClientConverter;
import io.github.meloncode.clientserviceapi.datasourse.repository.ClientRepository;
import io.github.meloncode.clientserviceapi.entities.Client;
import io.github.meloncode.clientserviceapi.providers.ClientProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ClientDataSource implements ClientProvider {

    private final ClientRepository clientRepository;

    @Override
    public void save(Client client) {
        log.info("DATA SOURCE LAYER - save - ClientDataSource");

        final var clientData = ClientConverter.clientDataToClient(client);
        this.clientRepository.saveClient(clientData);
    }
}
