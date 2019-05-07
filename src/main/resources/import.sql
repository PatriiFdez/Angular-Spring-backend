INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'África');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, "Andrés",  "Guzmán", "profesor@bolsadeideas.com","2018-01-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, "Linus",  "Torvalds", "linus@mail.com","2018-02-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, "Harry",  "Potter", "harry@potter.com","2018-03-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, "Cersei",  "Lannister", "cersei@lannister.com","2018-04-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, "Samsa",  "Stark", "samsa@stark.com","2018-05-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, "Ron",  "Wesley", "ron@wesley.com","2018-06-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, "Hermione",  "Granger", "hermione@granger.com","2018-07-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5, "Tom",  "Riddle", "tom@riddle.com","2018-08-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6, "Aria",  "Stark", "aria@stark.com","2018-09-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(7, "Remus",  "Lupin", "remus@lupin.com","2018-10-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, "Bellatrix",  "Lestrange", "bellatrix@lestrange.com","2018-11-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, "Raquel",  "Fernandez", "raquel@bolsadeideas.com","2018-12-01");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, "Lola",  "Castro", "lola@bolsadeideas.com","2018-12-31");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6, "Serena",  "Abrams", "serena@bolsadeideas.com","2018-12-31");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5, "Blair",  "Jackson", "blair@bolsadeideas.com","2018-12-31");
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, "Penelope",  "Garcia", "penelope@bolsadeideas.com","2018-12-31");

INSERT INTO usuarios (id, username, password, enabled, nombre, apellido, email) VALUES (1, 'patri', '$2a$10$bmRzgsvIiOiKcj4ln6MmcekkEMJCPNESNnj3HpFsEsI0gxsn/cmbi', 1, 'Patri', 'Fernández', 'patri@bolsadeideas.com');
INSERT INTO usuarios (id, username, password, enabled, nombre, apellido, email) VALUES (2, 'admin', '$2a$10$SArDn1.z6cnFYGjJ2m.obOnTzvDDtb.Ops.9o9aunbtiuasAV1.5K', 1, 'Administrador', 'Todopoderoso', 'admin@soporte.com');

INSERT INTO roles (id, nombre) VALUES (1, 'ROLE_USER');
INSERT INTO roles (id, nombre) VALUES (2, 'ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);

