package com.techelevator.projects.dao;

import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcProjectDao implements ProjectDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcProjectDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Project getProject(int projectId) {
        Project project = null;
        final String sql = "SELECT project_id, name, from_date, to_date \n" +
                "FROM project \n" +
                "WHERE project_id = ?; \n";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, projectId);

        if (result.next()) {
            project = mapRowToProject(result);
        }
        return project;
    }


    @Override
    public List<Project> getAllProjects() {
        List<Project> projects = new ArrayList<>();
        final String sql = "SELECT project_id, name, from_date, to_date \n" +
                "FROM project; \n";

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql);


        while (result.next()) {
          //  Project project = mapRowToProject(result);
            projects.add(mapRowToProject(result));
        }

        return projects;
    }

    @Override
    public Project createProject(Project newProject) {
        final String sql = "INSERT INTO project (name, from_date, to_date) \n" +
                "VALUES(?, ?, ?) RETURNING project_id; \n";
        Integer newId = this.jdbcTemplate.queryForObject(sql, Integer.class,
                newProject.getName(),
                newProject.getFromDate(),
                newProject.getToDate());

        return getProject(newId);
    }

    @Override
    public void deleteProject(int projectId) {
        String sql = "DELETE FROM project_employee \n" +
                "WHERE project_id = ?; \n";
        jdbcTemplate.update(sql, projectId);

        sql = "DELETE FROM project \n" +
                "WHERE project_id = ?; \n";
        jdbcTemplate.update(sql, projectId);

    }


    private Project mapRowToProject(SqlRowSet rowSet) {
        final Project project = new Project();
        project.setId(rowSet.getInt("project_id"));
        project.setName(rowSet.getString("name"));

        if (rowSet.getDate("from_date") != null) {
            project.setFromDate(rowSet.getDate("from_date").toLocalDate());
        } else {
            project.setFromDate(null);
        }

        if (rowSet.getDate("to_date") != null) {
            project.setToDate(rowSet.getDate("to_date").toLocalDate());
        } else {
            project.setToDate(null);
        }
        return project;
    }

}
