CREATE TABLE cursos (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    titulo varchar(255) NOT NULL
);

CREATE TABLE alunos (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    id_cursos INTEGER,
    nome varchar(255) NOT NULL,
    foreign key (id_cursos) references cursos(id)
);

CREATE TABLE permissions (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  description varchar(255) NOT NULL);

CREATE TABLE users (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  user_name varchar(255) NOT NULL UNIQUE,
  full_name varchar(255),
  password varchar(255) NOT NULL,
  account_non_expired bit DEFAULT NULL,
  account_non_locked bit DEFAULT NULL,
  credentials_non_expired bit DEFAULT NULL,
  enabled bit DEFAULT NULL);

CREATE TABLE user_permissions (
  id_user INTEGER,
  id_permission INTEGER,
  foreign key (id_user) references users(id),
  foreign key (id_permission) references permissions(id)
);

INSERT INTO PERMISSIONS (description) VALUES
	('ADMIN');

INSERT INTO PERMISSIONS (description) VALUES
	('MANAGER');

INSERT INTO PERMISSIONS (description) VALUES
	('COMMON_USER');

INSERT INTO USERS (user_name, full_name, password, account_non_expired, account_non_locked, credentials_non_expired, enabled) VALUES
('admin', 'Administrador', '$2a$12$BORRhlzlNhVpRx2oItlc4eQIxVMQQKzAH4e15b9GPHlvwYrLrkXl.', 1, 1, 1, 1);

INSERT INTO USERS (user_name, full_name, password, account_non_expired, account_non_locked, credentials_non_expired, enabled) VALUES
('pinheira', 'Turma da Pinheira', '$2a$12$BORRhlzlNhVpRx2oItlc4eQIxVMQQKzAH4e15b9GPHlvwYrLrkXl.', 1, 1, 1, 1);

INSERT INTO user_permissions (id_user, id_permission) VALUES
	(1, 1);

INSERT INTO user_permissions (id_user, id_permission) VALUES
	(1, 2);

INSERT INTO user_permissions (id_user, id_permission) VALUES
	(2, 3);


INSERT INTO cursos (titulo) VALUES ('Front End');
INSERT INTO cursos (titulo) VALUES ('Back End');
INSERT INTO cursos (titulo) VALUES ('Full Stack');

INSERT INTO alunos (nome,id_cursos) VALUES ('Gustavo',2);
INSERT INTO alunos (nome,id_cursos) VALUES ('Wagner',3);
INSERT INTO alunos (nome,id_cursos) VALUES ('Gonçalves',1);
