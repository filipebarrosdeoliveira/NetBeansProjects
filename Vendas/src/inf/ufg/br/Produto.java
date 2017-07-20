package inf.ufg.br;

/**
 * Created by FilipeBarros on 16/06/17.
 * Classe responsável pelo cadastro de produtos e sua manutenção
 */
public class Produto extends Fornecedor {

    private String nome;
    private int codigo;
    private String descricao;


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}




