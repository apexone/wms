package com.baka.wms.integration;

import com.baka.wms.controller.ProjectController;
import com.baka.wms.domain.Project;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ProjectControllerIT extends AbstractIT {
    private MockMvc mockMvc;
    @Autowired
    private ProjectController controller;
    @MockBean
    private AuditorAware auditorAwareImpl;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .build();
    }

    @Test
    public void createNewProject() throws Exception {

        Project project = new Project();
        project.setName("Peter Parker");
        project.setCreatedBy("JJJ");

        mockMvc.perform(
                post("/project")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(project)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", notNullValue()))
                .andExpect(jsonPath("$.createdDate", notNullValue()))
                .andExpect(jsonPath("$.createdDate", notNullValue()));
    }

    @Test
    public void createNewProjectException() throws Exception {
        //todo create adviceHandler
    }
}