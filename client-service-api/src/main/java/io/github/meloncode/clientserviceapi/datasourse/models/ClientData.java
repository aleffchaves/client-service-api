package io.github.meloncode.clientserviceapi.datasourse.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@Table(name = "clients")
public class ClientData {

    @Id
    private final String id;

    private final String name;

    private final String documentNumber;

    private final Integer age;
}
