create table IF NOT EXISTS tipo_enfermedad (
  id_tipo_enfermedad int not null AUTO_INCREMENT,
  nombre varchar(100) not null,
  PRIMARY KEY ( id_tipo_enfermedad )
);

create table IF NOT EXISTS tipo_exploracion (
  id_tipo_exploracion int NOT NULL AUTO_INCREMENT,
  tipo varchar(100) NOT NULL,
  PRIMARY KEY (id_tipo_exploracion)
);