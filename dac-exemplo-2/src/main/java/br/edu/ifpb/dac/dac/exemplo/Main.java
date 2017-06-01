/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.dac.exemplo;

import java.util.List;

/**
 *
 * @author miolivc
 */
public class Main {
    
    public static void main(String[] args) {
        
        UsuarioDao usuarioDao = new UsuarioDaoDatabase();
        
        List<Usuario> usuarios = usuarioDao.list();
        
        usuarios.forEach(u -> System.out.println(u));
        
    }
    
}
