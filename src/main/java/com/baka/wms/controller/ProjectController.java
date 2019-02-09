package com.baka.wms.controller;

import com.baka.wms.domain.Project;
import com.baka.wms.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/project")
public class ProjectController {
    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping(value = "", consumes = "application/json")
    public @ResponseBody
    Project createNewProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }
}
