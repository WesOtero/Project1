package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.Superhuman;
import com.revature.util.ConnectionUtil;

public class SuperDAOPostgres implements SuperDAO {

	@Override
	public void createSuperhuman(Superhuman superhuman) {

		String sql = "Insert into superhuman (supername, aliases, hometown, nemesis, alignmentid) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement stmt = null;
		Connection conn = ConnectionUtil.getConnection();

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, superhuman.getSuperName());
			stmt.setString(2, superhuman.getAlias());
			stmt.setString(3, superhuman.getHometown());
			stmt.setString(4, superhuman.getNemesis());
			stmt.setInt(5, superhuman.getAlignmentid());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// So far do not need this...
	@Override
	public Superhuman readSuperhuman(Integer superid) {
		// TODO Auto-generated method stub
		return null;
	}

	// Updates all fields
	@Override
	public void updateSuperhuman(Integer superid, String supername, String aliases, String hometown, String nemesis,
			Integer alignmentid) {

		String sql = "UPDATE superhuman SET supername =?, aliases =?, hometown=?, nemesis=?, alignmentid=? WHERE superid=?";
		PreparedStatement stmt = null;
		Connection conn = ConnectionUtil.getConnection();

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, supername);
			stmt.setString(2, aliases);
			stmt.setString(3, hometown);
			stmt.setString(4, nemesis);
			stmt.setInt(5, alignmentid);
			stmt.setInt(6, superid);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// Deletes based on superhuman id
	@Override
	public void deleteSuperhuman(Integer superid) {

		String sql = "DELETE FROM superhuman WHERE superid = ?";
		PreparedStatement stmt = null;
		Connection conn = ConnectionUtil.getConnection();

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, superid);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// Returns a list of all super humans
	@Override
	public List<Superhuman> readAllSuperhumans() {

		String sql = "select superhuman.superid, superhuman.supername, superhuman.aliases, superhuman.hometown, superhuman.nemesis, alignment.alignment from superhuman inner join alignment on superhuman.alignmentid = alignment.alignmentid;";
		PreparedStatement stmt = null;

		Connection conn = ConnectionUtil.getConnection();

		List<Superhuman> superhumans = new ArrayList<>();

		try {

			stmt = conn.prepareStatement(sql);
			ResultSet resultSet = stmt.executeQuery();
			
			while (resultSet.next()) {
				superhumans.add(new Superhuman(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
						resultSet.getString(5), resultSet.getString(6)));
			}

			resultSet.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return superhumans;
	}

}
