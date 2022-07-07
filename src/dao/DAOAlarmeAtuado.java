package DAO;

import model.ModelAlarmeAtuado;
import connection.Conexao;
import java.util.ArrayList;
/**
*
* @author Igor
*/
public class DAOAlarmeAtuado extends Conexao {

    /**
    * grava AlarmeAtuado
    * @param pModelAlarmeAtuado
    * @return int
    */
    public int salvarAlarmeAtuadoDAO(ModelAlarmeAtuado pModelAlarmeAtuado){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_alarmeatuado ("
                    + "fk_fk_equipamento,"
                    + "fk_fk_alarme,"
                    + "data_entrada,"
                    + "data_saida,"
                    + "alarme_status"
                + ") VALUES ("
                    + "'" + pModelAlarmeAtuado.getFk_fk_equipamento() + "',"
                    + "'" + pModelAlarmeAtuado.getFk_fk_alarme() + "',"
                    + "'" + pModelAlarmeAtuado.getData_entrada() + "',"
                    + "'" + pModelAlarmeAtuado.getData_saida() + "',"
                    + "'" + pModelAlarmeAtuado.getAlarme_status() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }
    
    public int salvarAlarmeAtuadoOnDAO(ModelAlarmeAtuado pModelAlarmeAtuado){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_alarmeatuado ("
                    + "fk_fk_equipamento,"
                    + "fk_fk_alarme,"
                    + "data_entrada,"
                    + "alarme_status"
                + ") VALUES ("
                    + "'" + pModelAlarmeAtuado.getFk_fk_equipamento() + "',"
                    + "'" + pModelAlarmeAtuado.getFk_fk_alarme() + "',"
                    + "'" + pModelAlarmeAtuado.getData_entrada() + "',"
                    + "'" + pModelAlarmeAtuado.getAlarme_status() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }
    public int salvarAlarmeAtuadoOffDAO(ModelAlarmeAtuado pModelAlarmeAtuado){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_alarmeatuado ("
                    + "fk_fk_equipamento,"
                    + "fk_fk_alarme,"
                    + "data_entrada,"
                    + "data_saida,"
                    + "alarme_status"
                + ") VALUES ("
                    + "'" + pModelAlarmeAtuado.getFk_fk_equipamento() + "',"
                    + "'" + pModelAlarmeAtuado.getFk_fk_alarme() + "',"
                    + "'" + pModelAlarmeAtuado.getData_entrada()+ "',"
                    + "'" + pModelAlarmeAtuado.getData_saida() + "',"
                    + "'" + pModelAlarmeAtuado.getAlarme_status() + "'"
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
    * recupera AlarmeAtuado
    * @param pPk_id_alarmeAtuado
    * @return ModelAlarmeAtuado
    */
    public ModelAlarmeAtuado getAlarmeAtuadoDAO(int pPk_id_alarmeAtuado){
        ModelAlarmeAtuado modelAlarmeAtuado = new ModelAlarmeAtuado();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_alarmeAtuado,"
                    + "fk_fk_equipamento,"
                    + "fk_fk_alarme,"
                    + "data_entrada,"
                    + "data_saida,"
                    + "alarme_status"
                 + " FROM"
                     + " tbl_alarmeatuado"
                 + " WHERE"
                     + " pk_id_alarmeAtuado = '" + pPk_id_alarmeAtuado + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelAlarmeAtuado.setPk_id_alarmeAtuado(this.getResultSet().getInt(1));
                modelAlarmeAtuado.setFk_fk_equipamento(this.getResultSet().getInt(2));
                modelAlarmeAtuado.setFk_fk_alarme(this.getResultSet().getInt(3));
                modelAlarmeAtuado.setData_entrada(this.getResultSet().getDate(4));
                modelAlarmeAtuado.setData_saida(this.getResultSet().getDate(5));
                modelAlarmeAtuado.setAlarme_status(this.getResultSet().getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelAlarmeAtuado;
    }

    /**
    * recupera uma lista de AlarmeAtuado
        * @return ArrayList
    */
    public ArrayList<ModelAlarmeAtuado> getListaAlarmeAtuadoDAO(){
        ArrayList<ModelAlarmeAtuado> listamodelAlarmeAtuado = new ArrayList();
        ModelAlarmeAtuado modelAlarmeAtuado = new ModelAlarmeAtuado();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_alarmeAtuado,"
                    + "fk_fk_equipamento,"
                    + "fk_fk_alarme,"
                    + "data_entrada,"
                    + "data_saida,"
                    + "alarme_status"
                 + " FROM"
                     + " tbl_alarmeatuado"
                + ";"
            );

            while(this.getResultSet().next()){
                modelAlarmeAtuado = new ModelAlarmeAtuado();
                modelAlarmeAtuado.setPk_id_alarmeAtuado(this.getResultSet().getInt(1));
                modelAlarmeAtuado.setFk_fk_equipamento(this.getResultSet().getInt(2));
                modelAlarmeAtuado.setFk_fk_alarme(this.getResultSet().getInt(3));
                modelAlarmeAtuado.setData_entrada(this.getResultSet().getDate(4));
                modelAlarmeAtuado.setData_saida(this.getResultSet().getDate(5));
                modelAlarmeAtuado.setAlarme_status(this.getResultSet().getString(6));
                listamodelAlarmeAtuado.add(modelAlarmeAtuado);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelAlarmeAtuado;
    }

    /**
    * atualiza AlarmeAtuado
    * @param pModelAlarmeAtuado
    * @return boolean
    */
    public boolean atualizarAlarmeAtuadoDAO(ModelAlarmeAtuado pModelAlarmeAtuado){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_alarmeatuado SET "
                    + "pk_id_alarmeAtuado = '" + pModelAlarmeAtuado.getPk_id_alarmeAtuado() + "',"
                    + "fk_fk_equipamento = '" + pModelAlarmeAtuado.getFk_fk_equipamento() + "',"
                    + "fk_fk_alarme = '" + pModelAlarmeAtuado.getFk_fk_alarme() + "',"
                    + "data_entrada = '" + pModelAlarmeAtuado.getData_entrada() + "',"
                    + "data_saida = '" + pModelAlarmeAtuado.getData_saida() + "',"
                    + "alarme_status = '" + pModelAlarmeAtuado.getAlarme_status() + "'"
                + " WHERE "
                    + "pk_id_alarmeAtuado = '" + pModelAlarmeAtuado.getPk_id_alarmeAtuado() + "'"
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
    * exclui AlarmeAtuado
    * @param pPk_id_alarmeAtuado
    * @return boolean
    */
    public boolean excluirAlarmeAtuadoDAO(int pPk_id_alarmeAtuado){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_alarmeatuado "
                + " WHERE "
                    + "pk_id_alarmeAtuado = '" + pPk_id_alarmeAtuado + "'"
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