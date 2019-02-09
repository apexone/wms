package com.baka.wms.service;

import com.baka.wms.domain.Project;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface ProjectService {
    Project createProject(Project project);

    Project getById(UUID id);
}
