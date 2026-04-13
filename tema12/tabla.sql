/*TABLA LIBRO

codlib      AUTOINCREMENTAL clave primaria
ISBN        CHAR(13)
titulo      VARCHAR(255)
autor       VARCHAR(255)
paginas     SMALLINT
argumento   TEXT*/

CREATE TABLE libro (
    codlib INT AUTO_INCREMENT   PRIMATY KEY,
    isbn CHAR(13) NOT NULL UNIQUE,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) DEFAULT "anonimo",
    paginas SMALLINT NOT NULL CHECK(paginas > 0),
    argumento TEXT;
)