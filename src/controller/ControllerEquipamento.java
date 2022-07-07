package controller;

import model.ModelEquipamento;
import DAO.DAOEquipamento;
import java.util.ArrayList;

/**
*
* @author Igor
*/
public class ControllerEquipamento {

    private DAOEquipamento daoEquipamento = new DAOEquipamento();

    /**
    * grava Equipamento
    * @param pModelEquipamento
    * @return int
    */
    public int salvarEquipamentoController(ModelEquipamento pModelEquipamento){
        return this.daoEquipamento.salvarEquipamentoDAO(pModelEquipamento);
    }

    /**
    * recupera Equipamento
    * @param pIdEquipamento
    * @return ModelEquipamento
    */
    public ModelEquipamento getEquipamentoController(int pIdEquipamento){
        return this.daoEquipamento.getEquipamentoDAO(pIdEquipamento);
    }

    public ModelEquipamento getEquipamentoController(String pNomeEquipamento){
        return this.daoEquipamento.getEquipamentoDAO(pNomeEquipamento);
    }
    public ModelEquipamento retornarEquipamentoController(int pCodigo){
        return this.daoEquipamento.retornarEquipamentoDAO(pCodigo);
    }
     public ModelEquipamento retornarEquipamentoController(String pNomeEquipamento){
        return this.daoEquipamento.retornarEquipamentoDAO(pNomeEquipamento);
    }
    
    /**
    * recupera uma lista deEquipamento
    * @param pIdEquipamento
    * @return ArrayList
    */
    public ArrayList<ModelEquipamento> getListaEquipamentoController(){
        return this.daoEquipamento.getListaEquipamentoDAO();
    }

    /**
    * atualiza Equipamento
    * @param pModelEquipamento
    * @return boolean
    */
    public boolean atualizarEquipamentoController(ModelEquipamento pModelEquipamento){
        return this.daoEquipamento.atualizarEquipamentoDAO(pModelEquipamento);
    }

    /**
    * exclui Equipamento
    * @param pIdEquipamento
    * @return boolean
    */
    public boolean excluirEquipamentoController(int pIdEquipamento){
        return this.daoEquipamento.excluirEquipamentoDAO(pIdEquipamento);
    }
}