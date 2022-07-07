package controller;

import model.ModelAlarmeAtuado;
import DAO.DAOAlarmeAtuado;
import java.util.ArrayList;

/**
*
* @author Igor
*/
public class ControllerAlarmeAtuado {

    private DAOAlarmeAtuado daoAlarmeAtuado = new DAOAlarmeAtuado();

    /**
    * grava AlarmeAtuado
    * @param pModelAlarmeAtuado
    * @return int
    */
    public int salvarAlarmeAtuadoController(ModelAlarmeAtuado pModelAlarmeAtuado){
        return this.daoAlarmeAtuado.salvarAlarmeAtuadoDAO(pModelAlarmeAtuado);
    }
    
    public int salvarAlarmeAtuadoOnController(ModelAlarmeAtuado pModelAlarmeAtuado){
        return this.daoAlarmeAtuado.salvarAlarmeAtuadoOnDAO(pModelAlarmeAtuado);
    }
    
    public int salvarAlarmeAtuadoOffController(ModelAlarmeAtuado pModelAlarmeAtuado){
        return this.daoAlarmeAtuado.salvarAlarmeAtuadoOffDAO(pModelAlarmeAtuado);
    }
    

    /**
    * recupera AlarmeAtuado
    * @param pPk_id_alarmeAtuado
    * @return ModelAlarmeAtuado
    */
    public ModelAlarmeAtuado getAlarmeAtuadoController(int pPk_id_alarmeAtuado){
        return this.daoAlarmeAtuado.getAlarmeAtuadoDAO(pPk_id_alarmeAtuado);
    }

    /**
    * recupera uma lista deAlarmeAtuado
    * @param pPk_id_alarmeAtuado
    * @return ArrayList
    */
    public ArrayList<ModelAlarmeAtuado> getListaAlarmeAtuadoController(){
        return this.daoAlarmeAtuado.getListaAlarmeAtuadoDAO();
    }

    /**
    * atualiza AlarmeAtuado
    * @param pModelAlarmeAtuado
    * @return boolean
    */
    public boolean atualizarAlarmeAtuadoController(ModelAlarmeAtuado pModelAlarmeAtuado){
        return this.daoAlarmeAtuado.atualizarAlarmeAtuadoDAO(pModelAlarmeAtuado);
    }

    /**
    * exclui AlarmeAtuado
    * @param pPk_id_alarmeAtuado
    * @return boolean
    */
    public boolean excluirAlarmeAtuadoController(int pPk_id_alarmeAtuado){
        return this.daoAlarmeAtuado.excluirAlarmeAtuadoDAO(pPk_id_alarmeAtuado);
    }
}