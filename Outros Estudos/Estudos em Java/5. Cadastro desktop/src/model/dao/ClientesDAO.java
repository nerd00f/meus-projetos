/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import connection.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Clientes;

public class ClientesDAO {

    public void create(Clientes c) {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO clientes (nome, endereco, telefone) VALUES(?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEndereco());
            stmt.setString(3, c.getTelefone());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
    }

    public List<Clientes> read() throws SQLException {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Clientes> cli = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("select * from clientes");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Clientes c = new Clientes();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                cli.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt, rs);
        }
        return cli;
    }

    public void update(Clientes c) {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE clientes SET nome = ?, endereco = ?, telefone = ? where id = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEndereco());
            stmt.setString(3, c.getTelefone());
            stmt.setInt(4, c.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
    }

    public void delete(Clientes c) {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM clientes WHERE id = ?");
            stmt.setInt(1, c.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir");
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
    }

    public List<Clientes> readForDesc(String desc) throws SQLException {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Clientes> cli = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Clientes WHERE nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Clientes c = new Clientes();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                cli.add(c);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na leitura" + ex);
        } finally {
            ConnectionFactory.closeConnection(null, stmt, rs);
        }
        return cli;
    }
}
