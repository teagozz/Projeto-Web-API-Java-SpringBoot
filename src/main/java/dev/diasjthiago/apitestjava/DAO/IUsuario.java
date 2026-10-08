package dev.diasjthiago.apitestjava.DAO;

import dev.diasjthiago.apitestjava.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
