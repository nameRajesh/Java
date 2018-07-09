package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.StudentDto;
import util.DbUtil;
public class StudentDao {
	
	public void saveStudentInfo(StudentDto studentDto) {
		
		String query = "INSERT INTO Student (studentName,rollNo) VALUES (?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = DbUtil.getConnection().prepareStatement(query);
			// ps.setNull(1, java.sql.Types.INTEGER);
			ps.setString(1,studentDto.getStudentName() );
			ps.setInt(2, studentDto.getRollNo());
			ps.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

		
	}
	
	public void updateStudentInfo(StudentDto studentDto) {
		
		String query = "UPDATE Student set studentName=?,rollNo=? where id=?";
		PreparedStatement ps = null;
		try {
			ps = DbUtil.getConnection().prepareStatement(query);
			// ps.setNull(1, java.sql.Types.INTEGER);
			ps.setString(1,studentDto.getStudentName() );
			ps.setInt(2, studentDto.getRollNo());
			ps.setInt(2, studentDto.getStudentId());
			ps.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void deleteStudentInfo(int studentId) {
		
		String query = "DELETE from Student where id=?";
		PreparedStatement ps = null;
		try {
			ps = DbUtil.getConnection().prepareStatement(query);
			// ps.setNull(1, java.sql.Types.INTEGER);
			ps.setInt(1,studentId);
			ps.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public List<StudentDto> allStudentInfo() {
		
		List<StudentDto> list = new ArrayList<>();
		
		String query = "SELECT * FROM Student";
		PreparedStatement ps = null;
		StudentDto studentDto = new StudentDto();
		try {
			ps = DbUtil.getConnection().prepareStatement(query);
			// ps.setNull(1, java.sql.Types.INTEGER);
			ResultSet re = ps.executeQuery();
			while(re.next()) {
				studentDto.setStudentId(re.getInt("id"));
				studentDto.setStudentName(re.getString("studentName"));
				studentDto.setRollNo(re.getInt("rollNo"));
				list.add(studentDto);
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return list;
		
	}
	
}
