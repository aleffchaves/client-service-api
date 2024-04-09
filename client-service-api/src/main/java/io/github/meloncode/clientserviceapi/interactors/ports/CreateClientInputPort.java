package io.github.meloncode.clientserviceapi.interactors.ports;


import io.github.meloncode.clientserviceapi.interactors.dtos.CreateClientModel;

public interface CreateClientInputPort {

    String create(final CreateClientModel createClientModel);
}
