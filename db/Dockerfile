FROM mysql:latest
EXPOSE 3306
COPY init.sql /docker-entrypoint-initdb.d
ENV MYSQL_ROOT_PASSWORD=admin@123