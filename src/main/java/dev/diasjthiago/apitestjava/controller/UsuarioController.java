package dev.diasjthiago.apitestjava.controller;

import dev.diasjthiago.apitestjava.DAO.IUsuario;
import dev.diasjthiago.apitestjava.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuario dao;

    @GetMapping
    public ResponseEntity<List<Usuario>> listaUsuarios() {
        List<Usuario> lista = (List<Usuario>) dao.findAll();
        return ResponseEntity.status(200).body(lista);
    } //esse é o padrão do get

    @PostMapping
    public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return ResponseEntity.status(201).body(usuarioNovo);
    }

    @PutMapping
    public ResponseEntity<Usuario> editUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return ResponseEntity.status(201).body(usuarioNovo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delUsuario(@PathVariable Integer id) {
        dao.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
