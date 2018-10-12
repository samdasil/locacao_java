package modelo.bean;

import java.util.Date;

public class Locacao {

    private int codigo;
    private Date dataLocacao;
    private Date dataEntrega;
    private Double totalLocacao;
    private Date hora;
    private Date horadiarias;
    private String status;
    private Funcionario funcionario;
    private Cliente cliente;
    private Carro carro;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Double getTotalLocacao() {
        return totalLocacao;
    }

    public void setTotalLocacao(Double totalLocacao) {
        this.totalLocacao = totalLocacao;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getHoradiarias() {
        return horadiarias;
    }

    public void setHoradiarias(Date horadiarias) {
        this.horadiarias = horadiarias;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
           
    
}
