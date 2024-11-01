/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibmec.meninasabores.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author gabri
 */

@Entity
@Table(name = "TB_Produto", schema = "MenSab")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PRODUTO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduto;
    @Column(name = "NOME", nullable = false, unique = true, length = 20)
    private String nome;
    @Column(name = "PRECO", nullable = false)
    private double percentual;
    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;
    @Column(name = "CATEGORIA", nullable = false)
    private String categoria;
    //@Column(name = "PRODUTO_IMAGEM", nullable = false)
    //private byte[] image;
    //@Column(name = "PRODUTO_TABELA_NUTRITIVA", nullable = false)
    //private byte[] tnutrient;
    @Column(name = "STATUS", nullable = false)
    private String status;
    @Column(name = "DESTAQUE",nullable = false)
    private String emdestaque;
    
    public Produto() {
    
    }

    public Produto(String nome, double percentual, String descricao) {
        this.nome = nome;
        this.percentual = percentual;
        this.descricao = descricao;
    }

    public UUID getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(UUID idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

/*    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }*/

    public boolean isStatus() {
        return "SIM".equals(status);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getEmdestaque() {
        return emdestaque;
    }

    public void setEmdestaque(String emdestaque) {
        this.emdestaque = emdestaque;
    }
    
    public boolean isDestaque() {
        return "SIM".equals(emdestaque);
    }

/*    public byte[] getTnutrient() {
        return tnutrient;
    }

    public void setTnutrient(byte[] tnutrient) {
        this.tnutrient = tnutrient;
    }*/
    
    
    
    
}
