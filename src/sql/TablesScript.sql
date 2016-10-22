-- Table: alumno

-- DROP TABLE alumno;

CREATE TABLE alumno
(
  nro_cedula integer,
  nombre_apellido character varying,
  email character varying,
  nro_celular character varying
)
WITH (
  OIDS=FALSE
);
ALTER TABLE alumno
  OWNER TO postgres;
  
-- Table: alumno_curso
-- tabla que representa 

-- DROP TABLE alumno_curso;

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
 