CREATE TABLE project
(
  id VARCHAR(36) NOT NULL PRIMARY KEY,
  name VARCHAR(256) NOT NULL,
  description VARCHAR(1024),
  created_by varchar(36) not null,
  last_modified_by VARCHAR(36),
  created_date TIMESTAMP(6) DEFAULT NOW() NOT NULL,
  last_modified_date TIMESTAMP(6)
);