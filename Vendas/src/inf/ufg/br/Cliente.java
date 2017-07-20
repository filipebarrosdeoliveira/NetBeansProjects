package inf.ufg.br;


import java.util.ArrayList;
import java.util.Vector;
/**
 * Created by FilipeBarros on 16/06/17.
 *  Classe responsável pelo cadastro e manutenção dos clientes
 */
public class Cliente {

    private int codigo;
    private String nome;
    private int telefone;
    private String endereco;
    private String email;






    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}