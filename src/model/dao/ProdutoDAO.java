package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.bean.Produto;

public class ProdutoDAO {
	
	public void create(Produto p) {
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("INSERT INTO tbproduto(pronumsequencial, prodescricao, proquantidade, propreco) "
					+ "VALUES (?,?, ?, ?);");
			stmt.setLong(1, p.getNumSequencial());
			stmt.setString(2, p.getDescricao());
			stmt.setInt(3, p.getQuantidade());
			stmt.setDouble(4,  p.getPreco());
			
			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar!" + e);
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

}
