# WMS



### Setup MARIADB
* Install mariadb
* Run this in your terminal: mysql_upgrade
* Connect to mariadb, type this in your terminal: mysql
* Create the database
```
create database WMS;
```
* Create the user
```
create user 'wmsadmin'@'localhost' identified by 'wms_admin_1';
```
* Give user access
```
grant all on WMS.* to 'wmsadmin'@'localhost';
```

### test if working
start application and enter the next line in your browser
```
http://localhost:20080/wms/cargo/hello
```

### flyway complain script changed
connect to mysql en do
```
use WMS;
DELETE FROM flyway_schema_history;
DROP TABLE Cargo;
```
Read JPA Repositories