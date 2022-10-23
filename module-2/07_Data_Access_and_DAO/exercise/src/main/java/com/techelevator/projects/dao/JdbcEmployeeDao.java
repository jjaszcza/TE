package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		final String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date \n" +
							"FROM employee;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employees = new ArrayList<>();
		final String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date \n" +
				"FROM employee \n" +
				"WHERE first_name ILIKE ? AND last_name ILIKE ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, '%' + firstNameSearch + '%', '%' + lastNameSearch + '%');
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}

		 return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		final String sql = "SELECT e.employee_id, e.department_id, e.first_name, e.last_name, e.birth_date, e.hire_date \n" +
				"FROM employee AS e \n" +
				"JOIN project_employee AS pe ON e.employee_id = pe.employee_id \n" +
				"WHERE project_id = ?;";
		final List<Employee> employees = new ArrayList<>();
		final SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while(results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		final String sql = "INSERT INTO project_employee(project_id, employee_id) \n" +
				"VALUES (?, ?); \n";
		this.jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		 String sql = "DELETE FROM project_employee \n" +
				"WHERE project_id = ? AND employee_id = ?";
		this.jdbcTemplate.update(sql, projectId, employeeId);

	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {

		List<Employee> employees = new ArrayList<>();
		final String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date \n" +
				"FROM employee \n" +
				"WHERE employee_id NOT IN(SELECT employee_id FROM project_employee)";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	private Employee mapRowToEmployee(SqlRowSet rowSet) {
		Employee employee = new Employee();
		employee.setId(rowSet.getInt("employee_id"));
		employee.setDepartmentId(rowSet.getInt("department_id"));
		employee.setFirstName(rowSet.getString("first_name"));
		employee.setLastName(rowSet.getString("last_name"));
		employee.setBirthDate(rowSet.getDate("birth_date").toLocalDate());
		employee.setHireDate(rowSet.getDate("hire_date").toLocalDate());
		return employee;
	}

}
