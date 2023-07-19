create table IF NOT EXISTS tipo_enfermedad (
  id_tipo_enfermedad int not null AUTO_INCREMENT,
  nombre varchar(100) not null,
  PRIMARY KEY ( id_tipo_enfermedad )
);