create database sistemaacademico;
use sistemaacademico;

create table usuario(
	idusuario int auto_increment primary key,
	login varchar(50) unique,
	senha varchar(50),
	perfil varchar(50)
);

insert into usuario values (null,'rebeca','rebeca123','administrador');
insert into usuario values (null,'isabela','isabela123','usuario');

