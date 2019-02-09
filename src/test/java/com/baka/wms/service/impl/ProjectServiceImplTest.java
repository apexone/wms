package com.baka.wms.service.impl;

import com.baka.wms.domain.Project;
import com.baka.wms.repository.ProjectRepository;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ProjectServiceImplTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Mock
    private ProjectRepository projectRepository;
    @InjectMocks
    private ProjectServiceImpl projectService;

    @Test
    public void createProjectTest() {
        Project project = new Project();
        project.setCreatedBy("admin");

        projectService.createProject(project);

        verify(projectRepository, times(1)).save(project);
    }
}