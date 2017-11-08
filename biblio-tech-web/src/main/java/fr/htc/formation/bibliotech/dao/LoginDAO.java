package fr.htc.formation.bibliotech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.htc.formation.bibliotech.web.controller.DataConnect;

public class LoginDAO {

	public static boolean validate(String email, String password) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("Select email, password from personne where email = ? and password = ?");
			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				//result found, means valid inputs
				return true;
			}
		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return false;
		} finally {
			DataConnect.close(con);
		}
		return false;
	}
}