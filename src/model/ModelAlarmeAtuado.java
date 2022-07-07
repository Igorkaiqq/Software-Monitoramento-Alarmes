package model;

import java.sql.Date;
import util.Datas;
/**
*
* @author Igor
*/
public class ModelAlarmeAtuado {

    private int pk_id_alarmeAtuado;
    private int fk_fk_equipamento;
    private int fk_fk_alarme;
    private Date data_entrada;
    private Date data_saida;
    private String alarme_status;

    /**
    * Construtor
    */
    public ModelAlarmeAtuado(){}

    /**
    * seta o valor de pk_id_alarmeAtuado
    * @param pPk_id_alarmeAtuado
    */
    public void setPk_id_alarmeAtuado(int pPk_id_alarmeAtuado){
        this.pk_id_alarmeAtuado = pPk_id_alarmeAtuado;
    }
    /**
    * @return pk_pk_id_alarmeAtuado
    */
    public int getPk_id_alarmeAtuado(){
        return this.pk_id_alarmeAtuado;
    }

    /**
    * seta o valor de fk_fk_equipamento
    * @param pFk_fk_equipamento
    */
    public void setFk_fk_equipamento(int pFk_fk_equipamento){
        this.fk_fk_equipamento = pFk_fk_equipamento;
    }
    /**
    * @return fk_fk_fk_equipamento
    */
    public int getFk_fk_equipamento(){
        return this.fk_fk_equipamento;
    }

    /**
    * seta o valor de fk_fk_alarme
    * @param pFk_fk_alarme
    */
    public void setFk_fk_alarme(int pFk_fk_alarme){
        this.fk_fk_alarme = pFk_fk_alarme;
    }
    /**
    * @return fk_fk_fk_alarme
    */
    public int getFk_fk_alarme(){
        return this.fk_fk_alarme;
    }

    /**
    * seta o valor de data_entrada
    * @param pData_entrada
    */
    public void setData_entrada(Date pData_entrada){
        this.data_entrada = pData_entrada;
    }
    /**
    * @return data_entrada
    */
    public Date getData_entrada(){
        return this.data_entrada;
    }

    /**
    * seta o valor de data_saida
    * @param pData_saida
    */
    public void setData_saida(Date pData_saida){
        this.data_saida = pData_saida;
    }
    /**
    * @return data_saida
    */
    public Date getData_saida(){
        return this.data_saida;
    }

    /**
    * seta o valor de alarme_status
    * @param pAlarme_status
    */
    public void setAlarme_status(String pAlarme_status){
        this.alarme_status = pAlarme_status;
    }
    /**
    * @return alarme_status
    */
    public String getAlarme_status(){
        return this.alarme_status;
    }

    @Override
    public String toString(){
        return "ModelAlarmeAtuado {" + "::pk_id_alarmeAtuado = " + this.pk_id_alarmeAtuado + "::fk_fk_equipamento = " + this.fk_fk_equipamento + "::fk_fk_alarme = " + this.fk_fk_alarme + "::data_entrada = " + this.data_entrada + "::data_saida = " + this.data_saida + "::alarme_status = " + this.alarme_status +  "}";
    }

    public void setData_saida(String ainda_ativo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAlarme_status(String off) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setData_entrada(String dataentrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getData_entrada(int linhaSelecionada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}