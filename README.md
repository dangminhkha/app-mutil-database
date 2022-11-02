"# app-mutil-database" 

## MY SQL

mysql.enabled=false

spring.datasource.mysql.hikari.jdbc-url=jdbc:mysql://localhost:3306/schema_mysql?useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.mysql.hikari.username=root
spring.datasource.mysql.hikari.password=root
spring.datasource.mysql.hikari.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.mysql.hikari.connection-timeout=60000
spring.datasource.mysql.hikari.minimum-idle=11
spring.datasource.mysql.hikari.maximum-pool-size=17 
spring.datasource.mysql.hikari.idle-timeout=10000
spring.datasource.mysql.hikari.max-lifetime=300000
spring.datasource.mysql.hikari.auto-commit=true
spring.datasource.mysql.hikari.type=com.zaxxer.mysql.hikari.HikariDataSource
spring.datasource.mysql.hikari.pool-name=MysqlPool

spring.jpa.properties.mysql.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.properties.mysql.hibernate.hbm2ddl.auto=update
spring.jpa.properties.mysql.hibernate.show_sql=true
spring.jpa.properties.mysql.hibernate.use_sql_comments=true
spring.jpa.properties.mysql.hibernate.format_sql=true
spring.jpa.properties.mysql.hibernate.type=trace

## MARIA
maria.enabled=false

spring.datasource.maria.hikari.jdbc-url=jdbc:mariadb://localhost:3305/schema_mariadb
spring.datasource.maria.hikari.username=root
spring.datasource.maria.hikari.password=root
spring.datasource.maria.hikari.schema=schema_mariadb
spring.datasource.maria.hikari.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.maria.hikari.type=com.zaxxer.maria.hikari.HikariDataSource
spring.datasource.maria.hikari.connection-timeout=60000
spring.datasource.maria.hikari.minimum-idle=2
spring.datasource.maria.hikari.maximum-pool-size=5 
spring.datasource.maria.hikari.idle-timeout=10000
spring.datasource.maria.hikari.max-lifetime=300000
spring.datasource.maria.hikari.auto-commit=true
spring.datasource.maria.hikari.pool-name=MariaPool

spring.jpa.properties.maria.hibernate.dialect=org.hibernate.dialect.MariaDB103Dialect
spring.jpa.properties.maria.hibernate.hbm2ddl.auto=update
spring.jpa.properties.maria.hibernate.show_sql=true
spring.jpa.properties.maria.hibernate.use_sql_comments=true
spring.jpa.properties.maria.hibernate.format_sql=true
spring.jpa.properties.maria.hibernate.type=trace

## ORACLE

oracle.enabled=true

spring.datasource.oracle.hikari.jdbc-url=jdbc:oracle:thin:@172.20.10.4:1521:xe
spring.datasource.oracle.hikari.username=C##ORGANIZATION
spring.datasource.oracle.hikari.password=organization
spring.datasource.oracle.hikari.driver-class-name=oracle.jdbc.OracleDriver
spring.datasource.oracle.hikari.connection-timeout=60000
spring.datasource.oracle.hikari.minimum-idle=5
spring.datasource.oracle.hikari.maximum-pool-size=20 
spring.datasource.oracle.hikari.idle-timeout=10000
spring.datasource.oracle.hikari.max-lifetime=300000
spring.datasource.oracle.hikari.auto-commit=true
spring.datasource.oracle.hikari.type=com.zaxxer.oracle.hikari.HikariDataSource
spring.datasource.oracle.hikari.pool-name=OraclePool

spring.jpa.properties.oracle.hibernate.dialect=org.hibernate.dialect.Oracle12cDialect
spring.jpa.properties.oracle.hibernate.hbm2ddl.auto=update
spring.jpa.properties.oracle.hibernate.show_sql=true
spring.jpa.properties.oracle.hibernate.use_sql_comments=true
spring.jpa.properties.oracle.hibernate.format_sql=true
spring.jpa.properties.oracle.hibernate.type=trace

## POSTGRES

postgres.enabled=true

spring.datasource.postgres.hikari.jdbc-url=jdbc:postgresql://localhost:5433/postgres
spring.datasource.postgres.hikari.username=postgres
spring.datasource.postgres.hikari.password=postgres
spring.datasource.postgres.hikari.schema=schema_postgres
spring.datasource.postgres.hikari.driver-class-name=org.postgresql.Driver
spring.datasource.postgres.hikari.connection-timeout=60000
spring.datasource.postgres.hikari.minimum-idle=5
spring.datasource.postgres.hikari.maximum-pool-size=15 
spring.datasource.postgres.hikari.idle-timeout=10000
spring.datasource.postgres.hikari.max-lifetime= 300000
spring.datasource.postgres.hikari.auto-commit =true
spring.datasource.postgres.hikari.type=com.zaxxer.hikari.HikariDataSource
spring.datasource.postgres.hikari.pool-name=PostgresPool

spring.jpa.properties.postgres.hibernate.dialect=org.hibernate.dialect.PostgreSQL10Dialect
spring.jpa.properties.postgres.hibernate.hbm2ddl.auto=update
spring.jpa.properties.postgres.hibernate.show_sql=true
spring.jpa.properties.postgres.hibernate.use_sql_comments=true
spring.jpa.properties.postgres.hibernate.format_sql=true
spring.jpa.properties.postgres.hibernate.type=trace

## link suport 
https://github.com/tirmizee/Spring-Boot-JPA-Multi-Databases-And-Rollback-Transaction/tree/master/src/main/java/com/tirmizee/core