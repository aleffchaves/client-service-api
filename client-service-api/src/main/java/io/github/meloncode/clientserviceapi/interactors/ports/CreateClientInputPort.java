package io.github.meloncode.clientserviceapi.interactors.ports;


import io.github.meloncode.clientserviceapi.interactors.dtos.CreateClientModel;

public interface CreateClientInputPort {

    void execute(final CreateClientModel createClientModel);
}
