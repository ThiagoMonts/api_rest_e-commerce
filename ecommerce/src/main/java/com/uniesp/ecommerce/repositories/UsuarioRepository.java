package com.uniesp.ecommerce.repositories;

import com.uniesp.ecommerce.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
