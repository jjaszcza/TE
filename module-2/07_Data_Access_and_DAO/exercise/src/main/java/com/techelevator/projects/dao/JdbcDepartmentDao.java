package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.sql.RowSet;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(int id) {
		final String sql = "SELECT department_id, name \n" +
				"FROM department \n" +
				"WHERE department_id = ?; \n";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);
		Department department = null;
		if (result.next()) {
			department = mapRowToDepartment(result);
		}
		return department;
	}

	@Override
	public List<Department> getAllDepartments() {
		final String sql = "SELECT department_id, name \n" +
				"FROM department; \n";
		SqlRowSet result = this.jdbcTemplate.queryForRowSet(sql);
		List<Department> departments = new ArrayList<>();
		while(result.next()) {
			departments.add(mapRowToDepartment(result));
		}

		return departments;
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {
		final String sql = "UPDATE department\t\n" +
				"SET name = ?\n" +
				"WHERE\n" +
				"department_id = ?; ";
		this.jdbcTemplate.update(sql, updatedDepartment.getName(),
				updatedDepartment.getId());
	}

	private Department mapRowToDepartment(SqlRowSet rowSet) {
	final Department department = new Department();
	department.setId(rowSet.getInt("department_id"));
	department.setName(rowSet.getString("name"));

	return department;

	}

}
