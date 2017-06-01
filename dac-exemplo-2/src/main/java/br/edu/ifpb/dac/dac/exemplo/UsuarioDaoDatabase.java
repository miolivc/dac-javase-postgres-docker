/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.dac.exemplo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miolivc
 */
public class UsuarioDaoDatabase implements UsuarioDao {
    private Connection conn;

    public UsuarioDaoDatabase() {
        conn = DatabaseConnection.getConnection();
    }
    
    @Override
    public List<Usuario> list() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM USUARIO";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return usuarios;
    }
    
}
