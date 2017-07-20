package inf.ufg.br;

import java.util.Date;

/**
 * Created by FilipeBarros on 16/06/17.
 * Classe responsável pela criação e emissão de pedido
 */


public class Pedido   {

  private Date dataPedido;
  private String vendedor;
  private Boolean status;
  private String observacoes;

  public static void criarPedido (String args[]) {

  }

  public static void cancelarPedido (String args[]) {

  }

  public static void encerrarPedido (String args[]) {

  }


    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getVendedor() {

      return vendedor;
    }

    public void setVendedor(String vendedor)
    {
        this.vendedor = vendedor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
