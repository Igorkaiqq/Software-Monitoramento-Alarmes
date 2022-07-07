package DAO;

import model.ModelEquipamento;
import connection.Conexao;
import java.util.ArrayList;
/**
*
* @author Igor
*/
public class DAOEquipamento extends Conexao {

    /**
    * grava Equipamento
    * @param pModelEquipamento
    * @return int
    */
    public int salvarEquipamentoDAO(ModelEquipamento pModelEquipamento){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_equipamento ("
                    + "pk_id_equipamento,"
                    + "equipamento_nome,"
                    + "equipamento_tipo,"
                    + "equipamento_cadastro,"
                    + "equipamento_descricao"
                + ") VALUES ("
                    + "'" + pModelEquipamento.getIdEquipamento() + "',"
                    + "'" + pModelEquipamento.getEquipamento_nome() + "',"
                    + "'" + pModelEquipamento.getEquipamento_tipo() + "',"
                    + "'" + pModelEquipamento.getEquipamento_cadastro() + "',"
                    + "'" + pModelEquipamento.getEquipamento_descricao() + "'"
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
    * recupera Equipamento
    * @param pIdEquipamento
    * @return ModelEquipamento
    */
    public ModelEquipamento getEquipamentoDAO(int pIdEquipamento){
        ModelEquipamento modelEquipamento = new ModelEquipamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_equipamento,"
                    + "equipamento_nome,"
                    + "equipamento_tipo,"
                    + "equipamento_cadastro,"
                    + "equipamento_descricao"
                 + " FROM"
                     + " tbl_equipamento"
                 + " WHERE"
                     + " pk_id_equipamento = '" + pIdEquipamento + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelEquipamento.setIdEquipamento(this.getResultSet().getInt(1));
                modelEquipamento.setEquipamento_nome(this.getResultSet().getString(2));
                modelEquipamento.setEquipamento_tipo(this.getResultSet().getString(3));
                modelEquipamento.setEquipamento_cadastro(this.getResultSet().getDate(4));
                modelEquipamento.setEquipamento_descricao(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelEquipamento;
    }

    public ModelEquipamento getEquipamentoDAO(String pNomeEquipamento){
        ModelEquipamento modelEquipamento = new ModelEquipamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_equipamento,"
                    + "equipamento_nome,"
                    + "equipamento_tipo,"
                    + "equipamento_cadastro,"
                    + "equipamento_descricao"
                 + " FROM"
                     + " tbl_equipamento"
                 + " WHERE"
                     + " equipamento_nome = '" + pNomeEquipamento + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelEquipamento.setIdEquipamento(this.getResultSet().getInt(1));
                modelEquipamento.setEquipamento_nome(this.getResultSet().getString(2));
                modelEquipamento.setEquipamento_tipo(this.getResultSet().getString(3));
                modelEquipamento.setEquipamento_cadastro(this.getResultSet().getDate(4));
                modelEquipamento.setEquipamento_descricao(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelEquipamento;
    }
    
    /**
    * recupera uma lista de Equipamento
        * @return ArrayList
    */
    public ArrayList<ModelEquipamento> getListaEquipamentoDAO(){
        ArrayList<ModelEquipamento> listamodelEquipamento = new ArrayList();
        ModelEquipamento modelEquipamento = new ModelEquipamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_equipamento,"
                    + "equipamento_nome,"
                    + "equipamento_tipo,"
                    + "equipamento_cadastro,"
                    + "equipamento_descricao"
                 + " FROM"
                     + " tbl_equipamento"
                + ";"
            );

            while(this.getResultSet().next()){
                modelEquipamento = new ModelEquipamento();
                modelEquipamento.setIdEquipamento(this.getResultSet().getInt(1));
                modelEquipamento.setEquipamento_nome(this.getResultSet().getString(2));
                modelEquipamento.setEquipamento_tipo(this.getResultSet().getString(3));
                modelEquipamento.setEquipamento_cadastro(this.getResultSet().getDate(4));
                modelEquipamento.setEquipamento_descricao(this.getResultSet().getString(5));
                listamodelEquipamento.add(modelEquipamento);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelEquipamento;
    }

        public ModelEquipamento retornarEquipamentoDAO (int pIdEquipamento){
    ModelEquipamento modelEquipamento = new ModelEquipamento();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_equipamento,"
                    + "equipamento_nome,"
                    + "equipamento_tipo,"
                    + "equipamento_cadastro,"
                    + "equipamento_descricao "
                    + "FROM tbl_equipamento WHERE pk_id_equipamento = '"+pIdEquipamento+"';");
            
            while (this.getResultSet().next()){
                modelEquipamento = new ModelEquipamento();
                modelEquipamento.setIdEquipamento(this.getResultSet().getInt(1));
                modelEquipamento.setEquipamento_nome(this.getResultSet().getString(2));
                modelEquipamento.setEquipamento_tipo(this.getResultSet().getString(3));
                modelEquipamento.setEquipamento_cadastro(this.getResultSet().getDate(4));
                modelEquipamento.setEquipamento_descricao(this.getResultSet().getString(5));
            }
            
       } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }       
        
        return modelEquipamento;
        
    }
    public ModelEquipamento retornarEquipamentoDAO (String pNomeEquipamento){
    ModelEquipamento modelEquipamento = new ModelEquipamento();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_equipamento,"
                    + "equipamento_nome,"
                    + "equipamento_tipo,"
                    + "equipamento_cadastro,"
                    + "equipamento_descricao "
                    + "FROM tbl_equipamento WHERE pk_id_equipamento = '"+pNomeEquipamento+"';");
            
            while (this.getResultSet().next()){
                modelEquipamento = new ModelEquipamento();
                modelEquipamento.setIdEquipamento(this.getResultSet().getInt(1));
                modelEquipamento.setEquipamento_nome(this.getResultSet().getString(2));
                modelEquipamento.setEquipamento_tipo(this.getResultSet().getString(3));
                modelEquipamento.setEquipamento_cadastro(this.getResultSet().getDate(4));
                modelEquipamento.setEquipamento_descricao(this.getResultSet().getString(5));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        
        return modelEquipamento;
        
    }
    
    /**
    * atualiza Equipamento
    * @param pModelEquipamento
    * @return boolean
    */
    public boolean atualizarEquipamentoDAO(ModelEquipamento pModelEquipamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_equipamento SET "
                    + "pk_id_equipamento = '" + pModelEquipamento.getIdEquipamento() + "',"
                    + "equipamento_nome = '" + pModelEquipamento.getEquipamento_nome() + "',"
                    + "equipamento_tipo = '" + pModelEquipamento.getEquipamento_tipo() + "',"
                    + "equipamento_cadastro = '" + pModelEquipamento.getEquipamento_cadastro() + "',"
                    + "equipamento_descricao = '" + pModelEquipamento.getEquipamento_descricao() + "'"
                + " WHERE "
                    + "pk_id_equipamento = '" + pModelEquipamento.getIdEquipamento() + "'"
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
    * exclui Equipamento
    * @param pIdEquipamento
    * @return boolean
    */
    public boolean excluirEquipamentoDAO(int pIdEquipamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_equipamento "
                + " WHERE "
                    + "pk_id_equipamento = '" + pIdEquipamento + "'"
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