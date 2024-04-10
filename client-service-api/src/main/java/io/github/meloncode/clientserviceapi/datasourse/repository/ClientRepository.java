package io.github.meloncode.clientserviceapi.datasourse.repository;

import io.github.meloncode.clientserviceapi.datasourse.models.ClientData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientData, String> {
}
