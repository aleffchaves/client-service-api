package io.github.meloncode.clientserviceapi.transportlayers.controllers;

import io.github.meloncode.clientserviceapi.interactors.ports.CreateClientInputPort;
import io.github.meloncode.clientserviceapi.transportlayers.dtos.CreateClientResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ClientController {

    private final CreateClientInputPort createClient;

    public ResponseEntity<CreateClientResponse> createClient() {
        return null;
    }
}
