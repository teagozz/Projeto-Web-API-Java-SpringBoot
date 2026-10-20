package dev.diasjthiago.apitestjava.DAO;

import dev.diasjthiago.apitestjava.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuario extends JpaRepository<Usuario, Integer> {

}
