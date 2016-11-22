DROP TABLE alumno_curso;
DROP TABLE alumno;
DROP TABLE curso;
DROP TABLE nacionalidad;


-- Table: nacionalidad

CREATE TABLE nacionalidad
(
  codigo character(2),
  descripcion character varying
)
WITH (
  OIDS=FALSE
);
ALTER TABLE nacionalidad
  OWNER TO postgres;
  
ALTER TABLE nacionalidad
  ADD CONSTRAINT pk_nacionalidad
  PRIMARY KEY (codigo);

insert into nacionalidad (codigo, descripcion) values ('py', 'Paraguaya');
insert into nacionalidad (codigo, descripcion) values ('fr', 'Francesa');
insert into nacionalidad (codigo, descripcion) values ('us', 'Estadounidense');

  
-- Table: alumno

CREATE TABLE alumno
(
  nro_cedula integer,
  nombre_apellido character varying,
  email character varying,
  nro_celular character varying,
  codigo_nacionalidad character(2)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE alumno
  OWNER TO postgres;
  
ALTER TABLE alumno
  ADD CONSTRAINT pk_alumno
  PRIMARY KEY (nro_cedula);
  
ALTER TABLE alumno
  ADD CONSTRAINT fk_alumno_nacionalidad
  FOREIGN KEY (codigo_nacionalidad)
  REFERENCES nacionalidad
  ON DELETE RESTRICT;

-- Table: curso

CREATE TABLE curso
(
  nro_curso integer,
  nombre character varying,
  anho integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE curso
  OWNER TO postgres;
  
ALTER TABLE curso
  ADD CONSTRAINT pk_curso
  PRIMARY KEY (nro_curso);


-- Table: alumno_curso
-- tabla que representa 

CREATE TABLE alumno_curso
(
nro_cedula integer,
nro_curso integer
) 
WITH (
  OIDS=FALSE
);

ALTER TABLE alumno_curso
  OWNER TO postgres;
  
ALTER TABLE alumno_curso
  ADD CONSTRAINT pk_alumno_curso
  PRIMARY KEY (nro_cedula, nro_curso);
  
ALTER TABLE alumno_curso
  ADD CONSTRAINT fk_alumno_curso_alumno 
  FOREIGN KEY (nro_cedula) 
  REFERENCES alumno 
  ON DELETE CASCADE;
  
ALTER TABLE alumno_curso
  ADD CONSTRAINT fk_alumno_curso_curso
  FOREIGN KEY (nro_curso)
  REFERENCES curso
  ON DELETE CASCADE;
