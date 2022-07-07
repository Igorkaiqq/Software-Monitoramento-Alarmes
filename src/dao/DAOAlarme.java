package dao;

import model.ModelAlarme;
import connection.Conexao;
import java.util.ArrayList;
/**
*
* @author Igor
*/
public class DAOAlarme extends Conexao {

    /**
    * grava Alarme
    * @param pModelAlarme
    * @return int
    */
    public int salvarAlarmeDAO(ModelAlarme pModelAlarme){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_alarme ("
                    + "fk_equipamento,"
                    + "alarme_classificao,"
                    + "alarme_cadastro,"
                    + "alarme_descricao "
                + ") VALUES ("
                    + "'" + pModelAlarme.getFk_equipamento() + "',"
                    + "'" + pModelAlarme.getAlarme_classificao() + "',"
                    + "'" + pModelAlarme.getAlarme_cadastro() + "',"
                    + "'" + pModelAlarme.getAlarme_descricao() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Alarme
    * @param pIdAlarme
    * @return ModelAlarme
    */
    public ModelAlarme getAlarmeDAO(int pIdAlarme){
        ModelAlarme modelAlarme = new ModelAlarme();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_alarme,"
                    + "fk_equipamento,"
                    + "alarme_classificao,"
                    + "alarme_cadastro,"
                    + "alarme_descricao"
                 + " FROM"
                     + " tbl_alarme"
                 + " WHERE"
                     + " pk_id_alarme = '" + pIdAlarme + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelAlarme.setIdAlarme(this.getResultSet().getInt(1));
                modelAlarme.setFk_equipamento(this.getResultSet().getInt(2));
                modelAlarme.setAlarme_classificao(this.getResultSet().getString(3));
                modelAlarme.setAlarme_cadastro(this.getResultSet().getDate(4));
                modelAlarme.setAlarme_descricao(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelAlarme;
    }

    /**
    * recupera uma lista de Alarme
        * @return ArrayList
    */
    public ArrayList<ModelAlarme> getListaAlarmeDAO(){
        ArrayList<ModelAlarme> listamodelAlarme = new ArrayList();
        ModelAlarme modelAlarme = new ModelAlarme();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_alarme,"
                    + "fk_equipamento,"
                    + "alarme_classificao,"
                    + "alarme_cadastro,"
                    + "alarme_descricao"
                 + " FROM"
                     + " tbl_alarme"
                + ";"
            );

            while(this.getResultSet().next()){
                modelAlarme = new ModelAlarme();
                modelAlarme.setIdAlarme(this.getResultSet().getInt(1));
                modelAlarme.setFk_equipamento(this.getResultSet().getInt(2));
                modelAlarme.setAlarme_classificao(this.getResultSet().getString(3));
                modelAlarme.setAlarme_cadastro(this.getResultSet().getDate(4));
                modelAlarme.setAlarme_descricao(this.getResultSet().getString(5));
                listamodelAlarme.add(modelAlarme);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelAlarme;
    }

    /**
    * atualiza Alarme
    * @param pModelAlarme
    * @return boolean
    */
    public boolean atualizarAlarmeDAO(ModelAlarme pModelAlarme){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_alarme SET "
                    + "pk_id_alarme = '" + pModelAlarme.getIdAlarme() + "',"
                    + "fk_equipamento = '" + pModelAlarme.getFk_equipamento() + "',"
                    + "alarme_classificao = '" + pModelAlarme.getAlarme_classificao() + "',"
                    + "alarme_cadastro = '" + pModelAlarme.getAlarme_cadastro() + "',"
                    + "alarme_descricao = '" + pModelAlarme.getAlarme_descricao() + "'"
                + " WHERE "
                    + "pk_id_alarme = '" + pModelAlarme.getIdAlarme() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Alarme
    * @param pIdAlarme
    * @return boolean
    */
    public boolean excluirAlarmeDAO(int pIdAlarme){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_alarme "
                + " WHERE "
                    + "pk_id_alarme = '" + pIdAlarme + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}