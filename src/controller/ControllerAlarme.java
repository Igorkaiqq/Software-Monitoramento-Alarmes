package controller;

import model.ModelAlarme;
import dao.DAOAlarme;
import java.util.ArrayList;

/**
*
* @author Igor
*/
public class ControllerAlarme {

    private DAOAlarme daoAlarme = new DAOAlarme();

    /**
    * grava Alarme
    * @param pModelAlarme
    * @return int
    */
    public int salvarAlarmeController(ModelAlarme pModelAlarme){
        return this.daoAlarme.salvarAlarmeDAO(pModelAlarme);
    }

    /**
    * recupera Alarme
    * @param pIdAlarme
    * @return ModelAlarme
    */
    public ModelAlarme getAlarmeController(int pIdAlarme){
        return this.daoAlarme.getAlarmeDAO(pIdAlarme);
    }

    /**
    * recupera uma lista deAlarme
    * @param pIdAlarme
    * @return ArrayList
    */
    public ArrayList<ModelAlarme> getListaAlarmeController(){
        return this.daoAlarme.getListaAlarmeDAO();
    }

    /**
    * atualiza Alarme
    * @param pModelAlarme
    * @return boolean
    */
    public boolean atualizarAlarmeController(ModelAlarme pModelAlarme){
        return this.daoAlarme.atualizarAlarmeDAO(pModelAlarme);
    }

    /**
    * exclui Alarme
    * @param pIdAlarme
    * @return boolean
    */
    public boolean excluirAlarmeController(int pIdAlarme){
        return this.daoAlarme.excluirAlarmeDAO(pIdAlarme);
    }
}