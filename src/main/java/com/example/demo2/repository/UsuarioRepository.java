//package com.example.demo2.repository;
//
//import com.example.demo2.models.Usuario;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
//    @Query(value = "SELECT * FROM usuario WHERE correo_electronico = ?1 and usuario_contrasenia = ?2", nativeQuery = true)
//    Usuario login(String usuario, String contrasenia);
//
//}
