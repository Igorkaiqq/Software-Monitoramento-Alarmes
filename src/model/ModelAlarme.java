package model;

import java.sql.Date;

/**
*
* @author Igor
*/
public class ModelAlarme {

    private int idAlarme;
    private int fk_equipamento;
    private String alarme_classificao;
    private Date alarme_cadastro;
    private String alarme_descricao;

    /**
    * Construtor
    */
    public ModelAlarme(){}

    /**
    * seta o valor de idAlarme
    * @param pIdAlarme
    */
    public void setIdAlarme(int pIdAlarme){
        this.idAlarme = pIdAlarme;
    }
    /**
    * @return pk_idAlarme
    */
    public int getIdAlarme(){
        return this.idAlarme;
    }

    /**
    * seta o valor de fk_equipamento
    * @param pFk_equipamento
    */
    public void setFk_equipamento(int pFk_equipamento){
        this.fk_equipamento = pFk_equipamento;
    }
    /**
    * @return fk_fk_equipamento
    */
    public int getFk_equipamento(){
        return this.fk_equipamento;
    }

    /**
    * seta o valor de alarme_classificao
    * @param pAlarme_classificao
    */
    public void setAlarme_classificao(String pAlarme_classificao){
        this.alarme_classificao = pAlarme_classificao;
    }
    /**
    * @return alarme_classificao
    */
    public String getAlarme_classificao(){
        return this.alarme_classificao;
    }

    /**
    * seta o valor de alarme_cadastro
    * @param pAlarme_cadastro
    */
    public void setAlarme_cadastro(Date pAlarme_cadastro){
        this.alarme_cadastro = pAlarme_cadastro;
    }
    /**
    * @return alarme_cadastro
    */
    public Date getAlarme_cadastro(){
        return this.alarme_cadastro;
    }

    /**
    * seta o valor de alarme_descricao
    * @param pAlarme_descricao
    */
    public void setAlarme_descricao(String pAlarme_descricao){
        this.alarme_descricao = pAlarme_descricao;
    }
    /**
    * @return alarme_descricao
    */
    public String getAlarme_descricao(){
        return this.alarme_descricao;
    }

    

    @Override
    public String toString(){
        return "ModelAlarme {" + "::idAlarme = " + this.idAlarme + "::fk_equipamento = " + this.fk_equipamento + "::alarme_classificao = " + this.alarme_classificao + "::alarme_cadastro = " + this.alarme_cadastro + "::alarme_descricao = " + this.alarme_descricao+"}";
    }
}