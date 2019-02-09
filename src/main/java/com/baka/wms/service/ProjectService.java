package com.baka.wms.service;

import com.baka.wms.domain.Project;
import org.springframework.stereotype.Service;

@Service
public interface ProjectService {
    Project createProject(Project project);
}
