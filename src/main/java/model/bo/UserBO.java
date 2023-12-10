package model.bo;

import java.sql.SQLException;
import java.util.List;

import model.bean.User;
import model.dao.UserDAO;

public class UserBO {
	
	private UserDAO userDAO;
	
	public UserBO() {
		this.userDAO = new UserDAO();
	}
	
	public List<User> getAllUser() throws ClassNotFoundException, SQLException {
		return this.userDAO.getAllUser();
	}
	
	public User getUser(String id) throws ClassNotFoundException, SQLException {
		return this.userDAO.getUser(id);
	}
	
	public boolean insertUser(String id, String fullName, String phoneNumber, String email, String avatar, String role, String address) throws ClassNotFoundException, SQLException {
		return this.userDAO.insertUser(id, fullName, phoneNumber, email, role, address);
	}
	
	public boolean updateUser(String id, String fullName, String phoneNumber, String email, String avatar, String role, String address) throws ClassNotFoundException, SQLException {
		return this.userDAO.updateUser(id, fullName, phoneNumber, email, role, address);
	}
	
	public boolean deleteUser(String id) throws ClassNotFoundException, SQLException {
		return this.userDAO.deleteUser(id);
	}
	
	public List<User> searchUser(String searchString) throws ClassNotFoundException, SQLException {
		return this.userDAO.searchUser(searchString);
	}
}