package DAO;

import Helpers.ConexaoBancoHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOGenerico {
    private int ultimoIdInserido;
    private Connection conexao;
    
    public DAOGenerico() {
        this.conexao = new ConexaoBancoHelper().getConnection();
    }
    
    public Connection getConexao() {
        return this.conexao;
    }

    public int getUltimoIdInserido() {
        return ultimoIdInserido;
    }

    public void setUltimoIdInserido(int ultimoIdInserido) {
        this.ultimoIdInserido = ultimoIdInserido;
    }
    
    protected void insert(String sql, Object... parametros) throws SQLException {
        PreparedStatement pStmt;
        pStmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        for (int i = 0; i < parametros.length; i++) {
            pStmt.setObject(i+1, parametros[i]);
        }
        pStmt.executeUpdate();
        
        ResultSet rs = pStmt.getGeneratedKeys();
        if(rs.next()) {
            setUltimoIdInserido(rs.getInt(1));
        }
        
        pStmt.close();
        conexao.close();
    }
    
    protected void update(String sql, Object id, Object... parametros) throws SQLException {
        PreparedStatement pStmt = getConexao().prepareStatement(sql);
        
        for (int i = 0; i < parametros.length; i++) {
            pStmt.setObject(i+1, parametros[i]);
        }
        
        pStmt.setObject(parametros.length +1, id);
        
        pStmt.executeUpdate();
        
        pStmt.close();
        conexao.close();
    }
    
    protected void delete(String sql, Object... parametros) throws SQLException {
        PreparedStatement pStmt = getConexao().prepareStatement(sql);
        
        for(int i = 0; i < parametros.length; i++) {
            pStmt.setObject(i+1, parametros[i]);
        }
        
        pStmt.executeUpdate();
        pStmt.close();
        conexao.close();
    }
}
