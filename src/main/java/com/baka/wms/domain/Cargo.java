package com.baka.wms.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cargo {
    @Id
    private UUID id;
    private String name;
    private String description;
    private String created_by;
    private String last_modified_by;
    private String created_date;
    private String last_modified_date;
}
