create database notasQuinto;
use notasQuinto;
create table alumnoPOO(
						dni int,
                        nombre varchar(30),
                        correo varchar(30),
                        primary key (dni)                                            
);
create table nota (
				id int auto_increment,
                dni int,
                bimestre int,
                valor int,
                motivo varchar(100),
                primary key(id),
                foreign key(dni) references alumnoPOO(dni)
                
);