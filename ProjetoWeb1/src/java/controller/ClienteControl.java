/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDAO;
import java.util.List;
import modelo.Cliente;
/**
 *
 * @author PC - SAMSUNG
 */
public class ClienteControl {
    
    public void adicionar(String nome, String idade){
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setIdade(Integer.parseInt(idade));
        ClienteDAO d = new ClienteDAO();
        d.adicionar(c);
    }
     public void alterar(String nome, String idade, String id){
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setId(Integer.parseInt(id));
        c.setIdade(Integer.parseInt(idade));
        ClienteDAO d = new ClienteDAO();
        d.alterar(c);
     }
      public void deletar(String query){
        ClienteDAO d = new ClienteDAO();
        d.deletar(query);
      }
      public List<Cliente> listar(String query){
          ClienteDAO d = new ClienteDAO();
          List<Cliente> clientes=d.listar(query);
          return clientes;
                  }

  
}
