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
import model.bean.Fornecedor;

public class FornecedorDAO {

    public void create(Fornecedor f) {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO fornecedor (RazaoSocial, NomeFantasia, CNPJ, InscricaoEstadual, Endereço, Chars) VALUES(?,?,?,?,?,?)");
            stmt.setString(1, f.getRazaoSocial());
            stmt.setString(2, f.getNomeFantasia());
            stmt.setString(3, f.getCNPJ());
            stmt.setString(4, f.getInscricaoEstadual());
            stmt.setString(5, f.getEndereço());
            stmt.setString(6, f.getChars());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
    }

    public List<Fornecedor> read() throws SQLException {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Fornecedor> fo = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("select * from fornecedor");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Fornecedor f = new Fornecedor();
                f.setId(rs.getInt("id"));
                f.setRazaoSocial(rs.getString("RazaoSocial"));
                f.setNomeFantasia(rs.getString("NomeFantasia"));
                f.setCNPJ(rs.getString("CNPJ"));
                f.setInscricaoEstadual(rs.getString("InscricaoEstadual"));
                f.setEndereço(rs.getString("Endereço"));
                f.setChars(rs.getString("Chars"));
                fo.add(f);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt, rs);
        }
        return fo;
    }

    public void update(Fornecedor f) {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE fornecedor SET RazaoSocial = ?, NomeFantasia = ?, CNPJ = ?, InscricaoEstadual = ?, Endereço = ?, Chars = ? where id = ?");
            stmt.setString(1, f.getRazaoSocial());
            stmt.setString(2, f.getNomeFantasia());
            stmt.setString(3, f.getCNPJ());
            stmt.setString(4, f.getInscricaoEstadual());
            stmt.setString(5, f.getEndereço());
            stmt.setString(6, f.getChars());
            stmt.setInt(7, f.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + ex);
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
    }

    public void delete(Fornecedor f) {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM fornecedor WHERE id = ?");
            stmt.setInt(1, f.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir");
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
    }

    public List<Fornecedor> readForDesc(String desc) throws SQLException {
        Connection con = (Connection) ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Fornecedor> fo = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM fornecedor WHERE NomeFantasia LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedor f = new Fornecedor();
                f.setId(rs.getInt("id"));
                f.setRazaoSocial(rs.getString("RazaoSocial"));
                f.setNomeFantasia(rs.getString("NomeFantasia"));
                f.setCNPJ(rs.getString("CNPJ"));
                f.setInscricaoEstadual(rs.getString("InscricaoEstadual"));
                f.setEndereço(rs.getString("Endereço"));
                f.setChars(rs.getString("Chars"));
                fo.add(f);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na leitura" + ex);
        } finally {
            ConnectionFactory.closeConnection(null, stmt, rs);
        }
        return fo;
    }
}
