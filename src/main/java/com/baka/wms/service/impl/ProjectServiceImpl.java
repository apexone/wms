package com.baka.wms.service.impl;

import com.baka.wms.domain.Project;
import com.baka.wms.repository.ProjectRepository;
import com.baka.wms.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProjectServiceImpl implements ProjectService {
    private ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project createProject(Project project) {

        project.setId(UUID.randomUUID());
        return projectRepository.save(project);
    }

    @Override
    public Project getById(UUID id) {
        return projectRepository.findById(id).get();
    }
}
