package com.santosh.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.santosh.dto.ImageDTO;
import com.santosh.utils.DatabaseConnectionUtil;

public class ImagDao {
	private Connection conn;
	private PreparedStatement statement;

	public String uploadImage(InputStream inputStream, ImageDTO imageDTO) {
		String message = null; // message will be sent back to client
		try {
			conn = DatabaseConnectionUtil.getConnection();
			String sql = "INSERT INTO contacts (first_name, last_name, photo) values (?, ?, ?)";
			statement = conn.prepareStatement(sql);
			statement.setString(1, imageDTO.getFirstName());
			statement.setString(2, imageDTO.getLastName());

			if (inputStream != null) {
				// fetches input stream of the upload file for the blob column
				statement.setBlob(3, inputStream);
			}

			int row = statement.executeUpdate();
			if (row > 0) {
				message = "Image is uploaded successfully into the Database";
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException ex) {
			message = "ERROR: " + ex.getMessage();
			ex.printStackTrace();
		}
		return message;
	}
}
