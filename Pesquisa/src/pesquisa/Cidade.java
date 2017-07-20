/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa;

/**
 *
 * @author FilipeBarros
 */
public class Cidade {
    
   int codigo;
   String cidade;
   String estado;
   int acidentes;
   int veiculos;
   
   int codigo (String cidade) {
       
       int cadastro = codigo + 1;
       return codigo;
       
   }
   
   String cidade (int codigo, String cadastro ) {
       
        cidade = cadastro;
       return cidade;
       
   }
   
   int acidente (int quantidade) {
       
       int quantidades = acidentes + quantidade;
       return quantidades;
    }
    
   int veiculos () {
       
       veiculos = veiculos + 1;
       return veiculos;
       
   }
   
}
