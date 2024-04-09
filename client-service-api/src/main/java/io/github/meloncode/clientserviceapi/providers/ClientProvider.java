package io.github.meloncode.clientserviceapi.providers;

import io.github.meloncode.clientserviceapi.entities.Client;

public interface ClientProvider {

    void save(final Client client);
}
