package io.github.meloncode.clientserviceapi.transportlayers.controllers;

import io.github.meloncode.clientserviceapi.interactors.ports.CreateClientInputPort;
import io.github.meloncode.clientserviceapi.transportlayers.dtos.CreateClientRequest;
import io.github.meloncode.clientserviceapi.transportlayers.dtos.CreateClientResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import static io.github.meloncode.clientserviceapi.transportlayers.converters.ClientConverter.createClientRequestToCreateClientModel;

@Slf4j
@RestController
@RequestMapping("api/v1/clients")
@RequiredArgsConstructor
public class ClientController {

    private final CreateClientInputPort createClient;

    @PostMapping
    public ResponseEntity<CreateClientResponse> createClient(@RequestBody final CreateClientRequest request) {
        ClientController.log.info("TRANSPORT LAYER - createClient - REQUEST: ");

        final var requestModel = createClientRequestToCreateClientModel(request);
        this.createClient.execute(requestModel);

        final var headLocation = ServletUriComponentsBuilder.fromCurrentRequest()
                .query("cpf={cpf}")
                .buildAndExpand(requestModel.getDocumentNumber())
                .toUri();

        ClientController.log.info("TRANSPORT LAYER - createClient - successfully created client. Available at: " + headLocation);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CreateClientResponse.builder().headerLocation(headLocation.toString()).build());
    }
}
