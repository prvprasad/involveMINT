package org.involvemint.data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.involvemint.data.manager.ConnectionManager;
import org.involvemint.data.model.ProjectCause;
import org.involvemint.data.model.ProjectType;
import org.involvemint.data.model.UserProfile;

public class IMAdminDAO {

	public static ProjectType getProjectType(Integer id) {
		Connection conn = ConnectionManager.getConnection();

		PreparedStatement stmt1;
		try {
			stmt1 = conn.prepareStatement("select * from involvemint.vol_types where VOL_TYPE_PK = ? order by VOL_TYPE_NAME");

			stmt1.setInt(1, id);
			ResultSet rs = stmt1.executeQuery();

			ProjectType projType = null;
			if (rs.next()) {
				projType = new ProjectType();
				projType.setProjTypePk(rs.getInt(1));
				projType.setProjTypeName(rs.getString(2));
				projType.setActiveInd(rs.getString(3));
				projType.setWeightage(rs.getDouble(4));
			}
			return projType;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeConnection(conn);
		}
		return null;
	}

	public static List<ProjectType> getProjectTypes() {
		List<ProjectType> typesList = new ArrayList<>();
		Connection conn = ConnectionManager.getConnection();

		PreparedStatement stmt1;
		try {
			stmt1 = conn.prepareStatement("select * from involvemint.vol_types ORDER BY VOL_TYPE_NAME");

			ResultSet rs = stmt1.executeQuery();

			while (rs.next()) {
				ProjectType projType = new ProjectType();
				projType.setProjTypePk(rs.getInt(1));
				projType.setProjTypeName(rs.getString(2));
				projType.setActiveInd(rs.getString(3));
				projType.setWeightage(rs.getDouble(4));

				typesList.add(projType);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeConnection(conn);
		}
		return typesList;
	}

	public static ProjectType updateProjectType(ProjectType projType) {
		Connection conn = ConnectionManager.getConnection();

		PreparedStatement stmt1;
		try {
			stmt1 = conn.prepareStatement(
					"UPDATE involvemint.vol_types SET VOL_TYPE_NAME = ?, ACTIVE_IND = ?, WEIGHTAGE = ? where VOL_TYPE_PK = ?");

			stmt1.setString(1, projType.getProjTypeName());
			stmt1.setString(2, projType.getActiveInd());
			stmt1.setDouble(3, projType.getWeightage());
			stmt1.setInt(4, projType.getProjTypePk());

			stmt1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeConnection(conn);
		}
		return projType;
	}

	public static ProjectType addProjectType(ProjectType projType) {
		Connection conn = ConnectionManager.getConnection();

		PreparedStatement stmt1;
		try {
			stmt1 = conn.prepareStatement(
					"INSERT INTO involvemint.vol_types(VOL_TYPE_NAME, ACTIVE_IND, WEIGHTAGE) VALUES (?, ?, ?)");

			stmt1.setString(1, projType.getProjTypeName());
			stmt1.setString(2, projType.getActiveInd());
			stmt1.setDouble(3, projType.getWeightage());

			stmt1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeConnection(conn);
		}
		return projType;
	}

	public static int deleteProjectType(Integer projectPk) {
		Connection conn = ConnectionManager.getConnection();

		PreparedStatement stmt1;
		try {
			stmt1 = conn.prepareStatement("DELETE FROM involvemint.vol_types where VOL_TYPE_PK = ?");

			stmt1.setInt(1, projectPk);

			stmt1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			ConnectionManager.closeConnection(conn);
		}
		return 1;
	}

	public static ProjectCause getProjectCause(Integer id) {
		Connection conn = ConnectionManager.getConnection();

		PreparedStatement stmt1;
		try {
			stmt1 = conn.prepareStatement("select * from involvemint.vol_causes where VOL_CAUSE_PK = ?");

			stmt1.setInt(1, id);
			ResultSet rs = stmt1.executeQuery();

			ProjectCause projCause = null;
			if (rs.next()) {
				projCause = new ProjectCause();
				projCause.setProjCausePk(rs.getInt(1));
				projCause.setProjCauseName(rs.getString(2));
				projCause.setActiveInd(rs.getString(3));
				projCause.setWeightage(rs.getDouble(4));
			}
			return projCause;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeConnection(conn);
		}
		return null;
	}

	public static List<ProjectCause> getProjectCauses() {
		List<ProjectCause> typesList = new ArrayList<>();
		Connection conn = ConnectionManager.getConnection();

		PreparedStatement stmt1;
		try {
			stmt1 = conn.prepareStatement("select * from involvemint.vol_causes ORDER BY VOL_CAUSE_NAME");

			ResultSet rs = stmt1.executeQuery();

			while (rs.next()) {
				ProjectCause projCause = new ProjectCause();
				projCause.setProjCausePk(rs.getInt(1));
				projCause.setProjCauseName(rs.getString(2));
				projCause.setActiveInd(rs.getString(3));
				projCause.setWeightage(rs.getDouble(4));

				typesList.add(projCause);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeConnection(conn);
		}
		return typesList;
	}

	public static ProjectCause updateProjectCause(ProjectCause projCause) {
		Connection conn = ConnectionManager.getConnection();

		PreparedStatement stmt1;
		try {
			stmt1 = conn.prepareStatement(
					"UPDATE involvemint.vol_causes SET VOL_CAUSE_NAME = ?, ACTIVE_IND = ?, WEIGHTAGE = ? where VOL_CAUSE_PK = ?");

			stmt1.setString(1, projCause.getProjCauseName());
			stmt1.setString(2, projCause.getActiveInd());
			stmt1.setDouble(3, projCause.getWeightage());
			stmt1.setInt(4, projCause.getProjCausePk());

			stmt1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeConnection(conn);
		}
		return projCause;
	}

	public static ProjectCause addProjectCause(ProjectCause projCause) {
		Connection conn = ConnectionManager.getConnection();

		PreparedStatement stmt1;
		try {
			stmt1 = conn.prepareStatement(
					"INSERT INTO involvemint.vol_causes(VOL_CAUSE_NAME, ACTIVE_IND, WEIGHTAGE) VALUES (?, ?, ?)");

			stmt1.setString(1, projCause.getProjCauseName());
			stmt1.setString(2, projCause.getActiveInd());
			stmt1.setDouble(3, projCause.getWeightage());

			stmt1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.closeConnection(conn);
		}
		return projCause;
	}

	public static int deleteProjectCause(Integer projCausePk) {
		Connection conn = ConnectionManager.getConnection();

		PreparedStatement stmt1;
		try {
			stmt1 = conn.prepareStatement("DELETE FROM involvemint.vol_Causes where VOL_CAUSE_PK = ?");

			stmt1.setInt(1, projCausePk);

			stmt1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			ConnectionManager.closeConnection(conn);
		}
		return 1;
	}

	public static UserProfile getUserProfile(String emailId) {

		Connection conn = ConnectionManager.getConnection();

		PreparedStatement stmt1;
		try {
			stmt1 = conn.prepareStatement("select * from involvemint.user_profile up where up.email_id = ?");

			PreparedStatement stmt2 = conn
					.prepareStatement("select * from involvemint.user_profile up where up.email_id = ?");
			PreparedStatement stmt3 = conn
					.prepareStatement("select * from involvemint.user_profile up where up.email_id = ?");

			stmt1.setString(1, emailId);
			stmt2.setString(1, emailId);
			stmt3.setString(1, emailId);

			stmt1.executeQuery();
			stmt2.executeQuery();
			stmt3.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionManager.closeConnection(conn);
		}
		return null;
	}

}
