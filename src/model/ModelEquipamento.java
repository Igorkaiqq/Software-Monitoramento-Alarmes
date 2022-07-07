package model;

import java.sql.Date;

/**
*
* @author Igor
*/
public class ModelEquipamento {

    private int idEquipamento;
    private String equipamento_nome;
    private String equipamento_tipo;
    private Date equipamento_cadastro;
    private String equipamento_descricao;

    /**
    * Construtor
    */
    public ModelEquipamento(){}

    /**
    * seta o valor de idEquipamento
    * @param pIdEquipamento
    */
    public void setIdEquipamento(int pIdEquipamento){
        this.idEquipamento = pIdEquipamento;
    }
    /**
    * @return pk_idEquipamento
    */
    public int getIdEquipamento(){
        return this.idEquipamento;
    }

    /**
    * seta o valor de equipamento_nome
    * @param pEquipamento_nome
    */
    public void setEquipamento_nome(String pEquipamento_nome){
        this.equipamento_nome = pEquipamento_nome;
    }
    /**
    * @return equipamento_nome
    */
    public String getEquipamento_nome(){
        return this.equipamento_nome;
    }

    /**
    * seta o valor de equipamento_tipo
    * @param pEquipamento_tipo
    */
    public void setEquipamento_tipo(String pEquipamento_tipo){
        this.equipamento_tipo = pEquipamento_tipo;
    }
    /**
    * @return equipamento_tipo
    */
    public String getEquipamento_tipo(){
        return this.equipamento_tipo;
    }

    /**
    * seta o valor de equipamento_cadastro
    * @param pEquipamento_cadastro
    */
    public void setEquipamento_cadastro(Date pEquipamento_cadastro){
        this.equipamento_cadastro = pEquipamento_cadastro;
    }
    /**
    * @return equipamento_cadastro
    */
    public Date getEquipamento_cadastro(){
        return this.equipamento_cadastro;
    }

    /**
    * seta o valor de equipamento_descricao
    * @param pEquipamento_descricao
    */
    public void setEquipamento_descricao(String pEquipamento_descricao){
        this.equipamento_descricao = pEquipamento_descricao;
    }
    /**
    * @return equipamento_descricao
    */
    public String getEquipamento_descricao(){
        return this.equipamento_descricao;
    }

    @Override
    public String toString(){
        return "ModelEquipamento {" + "::idEquipamento = " + this.idEquipamento + "::equipamento_nome = " + this.equipamento_nome + "::equipamento_tipo = " + this.equipamento_tipo + "::equipamento_cadastro = " + this.equipamento_cadastro + "::equipamento_descricao = " + this.equipamento_descricao +  "}";
    }
}