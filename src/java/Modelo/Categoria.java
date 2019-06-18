package Modelo;

import java.sql.Date;
import java.sql.ResultSet;

public class Categoria {
    private int id_categoria;
    private String nome_categoria;
    private String descricao;
    private Date data_cadastro;
    private int ativo;

    public Categoria(int id_categoria, String nome_categoria, String descricao, Date data_cadastro, int ativo) {
        this.id_categoria = id_categoria;
        this.nome_categoria = nome_categoria;
        this.descricao = descricao;
        this.data_cadastro = data_cadastro;
        this.ativo = ativo;
    }

    public Categoria() {
    }

    public Categoria(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
    
    
}
