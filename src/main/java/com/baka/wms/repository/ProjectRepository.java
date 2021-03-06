package com.baka.wms.repository;

import com.baka.wms.domain.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProjectRepository extends CrudRepository<Project, UUID> {
}
