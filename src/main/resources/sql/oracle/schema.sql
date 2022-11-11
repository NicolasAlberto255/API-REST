--------------------------------------------------------
-- Archivo creado  - viernes-noviembre-11-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CHECK_IN
--------------------------------------------------------

  CREATE TABLE "CHECK_IN" 
   (	"ID_CHECK_IN" NUMBER(10,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"ANOTACIONES" VARCHAR2(255 CHAR), 
	"FECHA_CHECK_IN" DATE, 
	"MONTO_FINAL_RESERVA" NUMBER(10,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CHECK_OUT
--------------------------------------------------------

  CREATE TABLE "CHECK_OUT" 
   (	"ID_CHECK_OUT" NUMBER(10,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"ESTADO_DEPARTAMENTO" VARCHAR2(255 CHAR), 
	"FECHA_CHECK_OUT" DATE, 
	"PAGO_COSTO_REPARACIONES" NUMBER(10,0), 
	"ID_CHECK_IN" NUMBER(10,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table COMUNA
--------------------------------------------------------

  CREATE TABLE "COMUNA" 
   (	"ID_COMUNA" NUMBER(10,0), 
	"NOMBRE_COMUNA" VARCHAR2(50 BYTE), 
	"ID_REGION" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table DEPARTAMENTOS
--------------------------------------------------------

  CREATE TABLE "DEPARTAMENTOS" 
   (	"ID_DEPARTAMENTOS" NUMBER(10,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"NOMBRE_DEPARTAMENTO" VARCHAR2(50 BYTE), 
	"NOMBRE_COMUNA_DEPTO" VARCHAR2(50 BYTE), 
	"NOMBRE_REGION_DEPTO" VARCHAR2(50 BYTE), 
	"N_BANOS" NUMBER(10,0), 
	"N_DEPTO" NUMBER(10,0), 
	"N_EDIFICIO" NUMBER(10,0), 
	"N_HABITACION" NUMBER(10,0), 
	"V_NOCHE" NUMBER(10,0), 
	"BALCON" NUMBER(1,0), 
	"ESTADO_DEPARTAMENTO" VARCHAR2(255 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table INVENTARIO_DEPTO
--------------------------------------------------------

  CREATE TABLE "INVENTARIO_DEPTO" 
   (	"ID_INVENTARIO_DEPTO" NUMBER(10,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"DESCRIPCION" VARCHAR2(255 CHAR), 
	"ID_DEPARTAMENTOS" NUMBER(10,0), 
	"ID_TIPO_INVENTARIO" NUMBER(10,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table REGION
--------------------------------------------------------

  CREATE TABLE "REGION" 
   (	"ID_REGION" NUMBER(10,0), 
	"NOMBRE_REGION" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table RESERVA
--------------------------------------------------------

  CREATE TABLE "RESERVA" 
   (	"ID_RESERVA" NUMBER(10,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"FECHA_CREACION" DATE, 
	"FECHA_FIN" DATE, 
	"FECHA_INICIO" DATE, 
	"PRECIO_ABONO" NUMBER(10,0), 
	"PRECIO_TOTAL" NUMBER(10,0), 
	"ESTADO_RESERVA" VARCHAR2(255 CHAR)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table RESERVA_DEPARTAMENTOS
--------------------------------------------------------

  CREATE TABLE "RESERVA_DEPARTAMENTOS" 
   (	"DEPARTAMENTOS_ID_RESERVA" NUMBER(10,0), 
	"DEPARTAMENTOS_ID_DEPARTAMENTOS" NUMBER(10,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table RESERVA_SERVICIOS
--------------------------------------------------------

  CREATE TABLE "RESERVA_SERVICIOS" 
   (	"ID_RESERVA" NUMBER(10,0), 
	"ID_SERVICIOS" NUMBER(10,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table RESERVA_USUARIOS
--------------------------------------------------------

  CREATE TABLE "RESERVA_USUARIOS" 
   (	"USUARIOS_ID_RESERVA" NUMBER(10,0), 
	"USUARIOS_ID_USUARIO" NUMBER(10,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ROL
--------------------------------------------------------

  CREATE TABLE "ROL" 
   (	"ID_ROL" NUMBER(1,0), 
	"NOMBRE_ROL" VARCHAR2(255 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table SERVICIOS
--------------------------------------------------------

  CREATE TABLE "SERVICIOS" 
   (	"ID_SERVICIOS" NUMBER(10,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"NOMBRE_SERVICIOS" VARCHAR2(255 CHAR), 
	"DESCRIPCION_SERVICIOS" VARCHAR2(255 CHAR), 
	"DISPONIBILIDAD_SERVICIOS" VARCHAR2(255 CHAR), 
	"PRECIO_SERVICIOS" NUMBER(10,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TIPO_INVENTARIO
--------------------------------------------------------

  CREATE TABLE "TIPO_INVENTARIO" 
   (	"ID_TIPO_INVENTARIO" NUMBER(10,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"NOMBRE_TIPO" VARCHAR2(255 CHAR)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table USUARIO
--------------------------------------------------------

  CREATE TABLE "USUARIO" 
   (	"ID_USUARIO" NUMBER(10,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"NOMBRE_USUARIO" VARCHAR2(255 CHAR), 
	"APELLIDO_USUARIO" VARCHAR2(255 CHAR), 
	"CEDULA_USUARIO" VARCHAR2(255 CHAR), 
	"EMAIL_USUARIO" VARCHAR2(255 CHAR), 
	"ID_ROL_USUARIO" NUMBER(1,0), 
	"TELEFONO_USUARIO" NUMBER(10,0), 
	"REGION_USUARIO" VARCHAR2(255 BYTE), 
	"COMUNA_USUARIO" VARCHAR2(255 BYTE), 
	"PASSWORD_USUARIO" VARCHAR2(255 BYTE), 
	"ESTADO_USUARIO" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;

Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('1','Arica','1');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('2','Camarones','1');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('3','General Lagos','1');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('4','Putre','1');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('5','Alto Hospicio','2');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('6','Iquique','2');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('7','Camiña','2');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('8','Colchane','2');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('9','Huara','2');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('10','Pica','2');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('11','Pozo Almonte','2');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('12','Antofagasta','3');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('13','Mejillones','3');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('14','Sierra Gorda','3');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('15','Taltal','3');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('16','Calama','3');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('17','Ollague','3');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('18','San Pedro de Atacama','3');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('19','María Elena','3');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('20','Tocopilla','3');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('21','Chañaral','4');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('22','Diego de Almagro','4');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('23','Caldera','4');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('24','Copiapó','4');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('25','Tierra Amarilla','4');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('26','Alto del Carmen','4');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('27','Freirina','4');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('28','Huasco','4');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('29','Vallenar','4');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('30','Canela','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('31','Illapel','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('32','Los Vilos','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('33','Salamanca','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('34','Andacollo','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('35','Coquimbo','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('36','La Higuera','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('37','La Serena','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('38','Paihuaco','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('39','Vicuña','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('40','Combarbalá','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('41','Monte Patria','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('42','Ovalle','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('43','Punitaqui','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('44','Río Hurtado','5');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('45','Isla de Pascua','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('46','Calle Larga','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('47','Los Andes','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('48','Rinconada','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('49','San Esteban','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('50','La Ligua','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('51','Papudo','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('52','Petorca','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('53','Zapallar','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('54','Hijuelas','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('55','La Calera','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('56','La Cruz','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('57','Limache','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('58','Nogales','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('59','Olmué','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('60','Quillota','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('61','Algarrobo','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('62','Cartagena','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('63','El Quisco','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('64','El Tabo','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('65','San Antonio','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('66','Santo Domingo','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('67','Catemu','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('68','Llaillay','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('69','Panquehue','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('70','Putaendo','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('71','San Felipe','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('72','Santa María','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('73','Casablanca','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('74','Concón','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('75','Juan Fernández','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('76','Puchuncaví','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('77','Quilpué','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('78','Quintero','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('79','Valparaíso','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('80','Villa Alemana','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('81','Viña del Mar','6');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('82','Colina','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('83','Lampa','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('84','Tiltil','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('85','Pirque','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('86','Puente Alto','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('87','San José de Maipo','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('88','Buin','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('89','Calera de Tango','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('90','Paine','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('91','San Bernardo','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('92','Alhué','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('93','Curacaví','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('94','María Pinto','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('95','Melipilla','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('96','San Pedro','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('97','Cerrillos','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('98','Cerro Navia','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('99','Conchalí','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('100','El Bosque','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('101','Estación Central','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('102','Huechuraba','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('103','Independencia','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('104','La Cisterna','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('105','La Granja','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('106','La Florida','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('107','La Pintana','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('108','La Reina','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('109','Las Condes','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('110','Lo Barnechea','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('111','Lo Espejo','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('112','Lo Prado','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('113','Macul','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('114','Maipú','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('115','Ñuñoa','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('116','Pedro Aguirre Cerda','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('117','Peñalolén','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('118','Providencia','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('119','Pudahuel','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('120','Quilicura','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('121','Quinta Normal','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('122','Recoleta','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('123','Renca','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('124','San Miguel','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('125','San Joaquín','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('126','San Ramón','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('127','Santiago','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('128','Vitacura','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('129','El Monte','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('130','Isla de Maipo','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('131','Padre Hurtado','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('132','Peñaflor','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('133','Talagante','7');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('134','Codegua','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('135','Coínco','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('136','Coltauco','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('137','Doñihue','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('138','Graneros','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('139','Las Cabras','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('140','Machalí','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('141','Malloa','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('142','Mostazal','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('143','Olivar','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('144','Peumo','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('145','Pichidegua','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('146','Quinta de Tilcoco','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('147','Rancagua','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('148','Rengo','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('149','Requínoa','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('150','San Vicente de Tagua Tagua','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('151','La Estrella','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('152','Litueche','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('153','Marchihue','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('154','Navidad','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('155','Peredones','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('156','Pichilemu','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('157','Chépica','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('158','Chimbarongo','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('159','Lolol','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('160','Nancagua','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('161','Palmilla','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('162','Peralillo','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('163','Placilla','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('164','Pumanque','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('165','San Fernando','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('166','Santa Cruz','8');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('167','Cauquenes','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('168','Chanco','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('169','Pelluhue','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('170','Curicó','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('171','Hualañé','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('172','Licantén','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('173','Molina','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('174','Rauco','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('175','Romeral','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('176','Sagrada Familia','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('177','Teno','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('178','Vichuquén','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('179','Colbún','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('180','Linares','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('181','Longaví','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('182','Parral','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('183','Retiro','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('184','San Javier','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('185','Villa Alegre','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('186','Yerbas Buenas','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('187','Constitución','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('188','Curepto','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('189','Empedrado','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('190','Maule','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('192','Pencahue','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('193','Río Claro','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('194','San Clemente','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('195','San Rafael','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('196','Talca','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('197','Bulnes','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('198','Chillán','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('199','Chillán Viejo','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('200','Cobquecura','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('201','Coelemu','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('202','Coihueco','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('203','El Carmen','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('204','Ninhue','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('205','Ñiquen','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('206','Pemuco','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('207','Pinto','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('208','Portezuelo','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('209','Quirihue','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('210','Ránquil','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('211','Treguaco','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('212','Quillón','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('213','San Carlos','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('214','San Fabián','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('191','Pelarco','9');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('215','San Ignacio','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('216','San Nicolás','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('217','Yungay','10');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('218','Arauco','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('219','Cañete','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('220','Contulmo','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('221','Curanilahue','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('222','Lebu','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('223','Los Álamos','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('224','Tirúa','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('225','Alto Biobío','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('226','Antuco','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('227','Cabrero','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('228','Laja','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('229','Los Ángeles','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('230','Mulchén','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('231','Nacimiento','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('232','Negrete','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('233','Quilaco','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('234','Quilleco','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('235','San Rosendo','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('236','Santa Bárbara','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('237','Tucapel','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('238','Yumbel','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('239','Chiguayante','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('240','Concepción','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('241','Coronel','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('242','Florida','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('243','Hualpén','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('244','Hualqui','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('245','Lota','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('246','Penco','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('247','San Pedro de La Paz','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('248','Santa Juana','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('249','Talcahuano','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('250','Tomé','11');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('251','Carahue','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('252','Cholchol','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('253','Cunco','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('254','Curarrehue','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('255','Freire','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('256','Galvarino','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('257','Gorbea','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('258','Lautaro','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('259','Loncoche','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('260','Melipeuco','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('261','Nueva Imperial','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('262','Padre Las Casas','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('263','Perquenco','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('264','Pitrufquén','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('265','Pucón','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('266','Saavedra','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('267','Temuco','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('268','Teodoro Schmidt','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('269','Toltén','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('270','Vilcún','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('271','Villarrica','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('272','Angol','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('273','Collipulli','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('274','Curacautín','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('275','Ercilla','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('276','Lonquimay','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('277','Los Sauces','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('278','Lumaco','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('279','Purén','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('280','Renaico','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('281','Traiguén','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('282','Victoria','12');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('283','Corral','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('284','Lanco','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('285','Los Lagos','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('286','Máfil','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('287','Mariquina','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('288','Paillaco','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('289','Panguipulli','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('290','Valdivia','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('291','Futrono','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('292','La Unión','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('293','Lago Ranco','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('294','Río Bueno','13');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('295','Ancud','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('296','Castro','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('297','Chonchi','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('298','Curaco de Vélez','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('299','Dalcahue','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('300','Puqueldón','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('301','Queilén','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('302','Quemchi','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('303','Quellón','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('304','Quinchao','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('305','Calbuco','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('306','Cochamó','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('307','Fresia','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('308','Frutillar','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('309','Llanquihue','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('310','Los Muermos','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('311','Maullín','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('312','Puerto Montt','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('313','Puerto Varas','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('314','Osorno','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('315','Puero Octay','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('316','Purranque','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('317','Puyehue','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('318','Río Negro','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('319','San Juan de la Costa','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('320','San Pablo','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('321','Chaitén','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('322','Futaleufú','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('323','Hualaihué','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('324','Palena','14');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('325','Aisén','15');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('326','Cisnes','15');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('327','Guaitecas','15');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('328','Cochrane','15');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('329','O higgins','15');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('330','Tortel','15');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('331','Coihaique','15');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('332','Lago Verde','15');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('333','Chile Chico','15');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('334','Río Ibáñez','15');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('335','Antártica','16');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('336','Cabo de Hornos','16');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('337','Laguna Blanca','16');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('338','Punta Arenas','16');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('339','Río Verde','16');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('340','San Gregorio','16');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('341','Porvenir','16');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('342','Primavera','16');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('343','Timaukel','16');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('344','Natales','16');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('345','Torres del Paine','16');
Insert into COMUNA (ID_COMUNA,NOMBRE_COMUNA,ID_REGION) values ('346','Cabildo','16');

Insert into DEPARTAMENTOS (NOMBRE_DEPARTAMENTO,NOMBRE_COMUNA_DEPTO,NOMBRE_REGION_DEPTO,N_BANOS,N_DEPTO,N_EDIFICIO,N_HABITACION,V_NOCHE,BALCON,ESTADO_DEPARTAMENTO) values ('Casa de Acopio','Santiago','Region Metropolitana','4','10','5','1','50000','0','Libre');
Insert into DEPARTAMENTOS (NOMBRE_DEPARTAMENTO,NOMBRE_COMUNA_DEPTO,NOMBRE_REGION_DEPTO,N_BANOS,N_DEPTO,N_EDIFICIO,N_HABITACION,V_NOCHE,BALCON,ESTADO_DEPARTAMENTO) values ('Casa de Oro','Providencia','Region Metropolitana','4','1234','3','5','75000','0','Libre');
Insert into DEPARTAMENTOS (NOMBRE_DEPARTAMENTO,NOMBRE_COMUNA_DEPTO,NOMBRE_REGION_DEPTO,N_BANOS,N_DEPTO,N_EDIFICIO,N_HABITACION,V_NOCHE,BALCON,ESTADO_DEPARTAMENTO) values ('Casa de Plata','Huechuraba','Region Metropolitana','5','200','1','7','120000','1','Libre');
Insert into DEPARTAMENTOS (NOMBRE_DEPARTAMENTO,NOMBRE_COMUNA_DEPTO,NOMBRE_REGION_DEPTO,N_BANOS,N_DEPTO,N_EDIFICIO,N_HABITACION,V_NOCHE,BALCON,ESTADO_DEPARTAMENTO) values ('Casa de Piedra','Quilicura','Region Metropolitana','2','300','8','2','100000','1','Libre');
Insert into DEPARTAMENTOS (NOMBRE_DEPARTAMENTO,NOMBRE_COMUNA_DEPTO,NOMBRE_REGION_DEPTO,N_BANOS,N_DEPTO,N_EDIFICIO,N_HABITACION,V_NOCHE,BALCON,ESTADO_DEPARTAMENTO) values ('Casa de Madera','La Florida','Region Metropolitana','3','400','4','3','150000','0','Libre');

Insert into REGION (ID_REGION,NOMBRE_REGION) values ('1','Arica y Parinacota');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('2','Tarapacá');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('3','Antofagasta');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('4','Atacama');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('5','Coquimbo');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('6','Valparaíso');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('7','Metropolitana de Santiago');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('8','Libertador General Bernardo O’Higgins');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('9','Maule');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('10','Ñuble');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('11','Biobío');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('12','La Araucanía');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('13','Los Ríos');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('14','Los Lagos');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('15','Aysén del General Carlos Ibáñez del Campo');
Insert into REGION (ID_REGION,NOMBRE_REGION) values ('16','Magallanes y de la Antártica Chilena');

Insert into ROL (ID_ROL,NOMBRE_ROL) values ('1','Administrador');
Insert into ROL (ID_ROL,NOMBRE_ROL) values ('2','Funcionario');
Insert into ROL (ID_ROL,NOMBRE_ROL) values ('3','Cliente');

Insert into SERVICIOS (NOMBRE_SERVICIOS,DESCRIPCION_SERVICIOS,DISPONIBILIDAD_SERVICIOS,PRECIO_SERVICIOS) values ('Ningun Servicio','Nada','Disponible','0');
Insert into SERVICIOS (NOMBRE_SERVICIOS,DESCRIPCION_SERVICIOS,DISPONIBILIDAD_SERVICIOS,PRECIO_SERVICIOS) values ('Tour','Servicio que se encarga de entregar Tours en las localidades cercanas.','Disponible','20000');
Insert into SERVICIOS (NOMBRE_SERVICIOS,DESCRIPCION_SERVICIOS,DISPONIBILIDAD_SERVICIOS,PRECIO_SERVICIOS) values ('Taxi','Servicio que se encarga de entregar recorridos con taxis en las localidades cercanas.','Disponible','10000');
Insert into SERVICIOS (NOMBRE_SERVICIOS,DESCRIPCION_SERVICIOS,DISPONIBILIDAD_SERVICIOS,PRECIO_SERVICIOS) values ('Acercamiento','Servicio que se encarga de entregar viajes entre los terminales de buses o aeropuertos hacia el departamento.','Disponible','20000');
Insert into SERVICIOS (NOMBRE_SERVICIOS,DESCRIPCION_SERVICIOS,DISPONIBILIDAD_SERVICIOS,PRECIO_SERVICIOS) values ('Vehiculos','Servicio que se encarga de entregar vehiculos para recorrer las localidades cercanas.','Disponible','200000');
Insert into SERVICIOS (NOMBRE_SERVICIOS,DESCRIPCION_SERVICIOS,DISPONIBILIDAD_SERVICIOS,PRECIO_SERVICIOS) values ('Bicicletas','Servicio que se encarga de entregar bicicletas para recorrer las localidades cercanas.','Disponible','5000');
Insert into SERVICIOS (NOMBRE_SERVICIOS,DESCRIPCION_SERVICIOS,DISPONIBILIDAD_SERVICIOS,PRECIO_SERVICIOS) values ('Cenas','Servicio que se encarga de agendar cenas en restaurantes que estan dentro del convenio.','Disponible','15000');

Insert into USUARIO (NOMBRE_USUARIO,APELLIDO_USUARIO,CEDULA_USUARIO,EMAIL_USUARIO,ID_ROL_USUARIO,TELEFONO_USUARIO,REGION_USUARIO,COMUNA_USUARIO,PASSWORD_USUARIO,ESTADO_USUARIO) values ('Jose','Bote','33.333.333-3','prueba@rent.cl','3','963214785','Metropolitana de Santiago','Santiago','pass123','Activo');
Insert into USUARIO (NOMBRE_USUARIO,APELLIDO_USUARIO,CEDULA_USUARIO,EMAIL_USUARIO,ID_ROL_USUARIO,TELEFONO_USUARIO,REGION_USUARIO,COMUNA_USUARIO,PASSWORD_USUARIO,ESTADO_USUARIO) values ('Pedro','Avion','11.111.111-1','maestro@rent.cl','3','987412365','Coquimbo','Coquimbo','password','Activo');
Insert into USUARIO (NOMBRE_USUARIO,APELLIDO_USUARIO,CEDULA_USUARIO,EMAIL_USUARIO,ID_ROL_USUARIO,TELEFONO_USUARIO,REGION_USUARIO,COMUNA_USUARIO,PASSWORD_USUARIO,ESTADO_USUARIO) values ('Antonio','Automovil','22.222.222-2','testeo@rent.cl','3','563214789','Metropolitana de Santiago','Huechuraba','123pass','Activo');
Insert into USUARIO (NOMBRE_USUARIO,APELLIDO_USUARIO,CEDULA_USUARIO,EMAIL_USUARIO,ID_ROL_USUARIO,TELEFONO_USUARIO,REGION_USUARIO,COMUNA_USUARIO,PASSWORD_USUARIO,ESTADO_USUARIO) values ('Jaime','Carro','88.888.888-8','maspruebas@rent.cl','3','987654123','Arica y Parinacota','Arica','456pass','Activo');
Insert into USUARIO (NOMBRE_USUARIO,APELLIDO_USUARIO,CEDULA_USUARIO,EMAIL_USUARIO,ID_ROL_USUARIO,TELEFONO_USUARIO,REGION_USUARIO,COMUNA_USUARIO,PASSWORD_USUARIO,ESTADO_USUARIO) values ('Pablo','Carruaje','55.555.555-5','otraprueba@rent.cl','3','123456789','Valparaíso','Casablanca','pass456','Activo');
Insert into USUARIO (NOMBRE_USUARIO,APELLIDO_USUARIO,CEDULA_USUARIO,EMAIL_USUARIO,ID_ROL_USUARIO,TELEFONO_USUARIO,REGION_USUARIO,COMUNA_USUARIO,PASSWORD_USUARIO,ESTADO_USUARIO) values ('Javiera','Caballo','44.444.444-4','testing@rent.cl','3','456123789','Maule','Constitución','123password','Activo');
Insert into USUARIO (NOMBRE_USUARIO,APELLIDO_USUARIO,CEDULA_USUARIO,EMAIL_USUARIO,ID_ROL_USUARIO,TELEFONO_USUARIO,REGION_USUARIO,COMUNA_USUARIO,PASSWORD_USUARIO,ESTADO_USUARIO) values ('Maria','Maletas','77.777.777-7','nunca@rent.cl','3','456789123','Biobío','Chiguayante','password124','Activo');
--------------------------------------------------------
--  DDL for Index SYS_C009063
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009063" ON "CHECK_IN" ("ID_CHECK_IN") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009065
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009065" ON "CHECK_OUT" ("ID_CHECK_OUT") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009053
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009053" ON "COMUNA" ("ID_COMUNA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009067
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009067" ON "DEPARTAMENTOS" ("ID_DEPARTAMENTOS") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009069
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009069" ON "INVENTARIO_DEPTO" ("ID_INVENTARIO_DEPTO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009056
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009056" ON "REGION" ("ID_REGION") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009071
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009071" ON "RESERVA" ("ID_RESERVA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009074
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009074" ON "RESERVA_DEPARTAMENTOS" ("DEPARTAMENTOS_ID_RESERVA", "DEPARTAMENTOS_ID_DEPARTAMENTOS") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009077
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009077" ON "RESERVA_SERVICIOS" ("ID_RESERVA", "ID_SERVICIOS") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009080
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009080" ON "RESERVA_USUARIOS" ("USUARIOS_ID_RESERVA", "USUARIOS_ID_USUARIO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009082
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009082" ON "SERVICIOS" ("ID_SERVICIOS") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009084
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009084" ON "TIPO_INVENTARIO" ("ID_TIPO_INVENTARIO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C009086
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYS_C009086" ON "USUARIO" ("ID_USUARIO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table CHECK_IN
--------------------------------------------------------

  ALTER TABLE "CHECK_IN" MODIFY ("ID_CHECK_IN" NOT NULL ENABLE);
  ALTER TABLE "CHECK_IN" ADD PRIMARY KEY ("ID_CHECK_IN")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table CHECK_OUT
--------------------------------------------------------

  ALTER TABLE "CHECK_OUT" MODIFY ("ID_CHECK_OUT" NOT NULL ENABLE);
  ALTER TABLE "CHECK_OUT" ADD PRIMARY KEY ("ID_CHECK_OUT")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table COMUNA
--------------------------------------------------------

  ALTER TABLE "COMUNA" ADD PRIMARY KEY ("ID_COMUNA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table DEPARTAMENTOS
--------------------------------------------------------

  ALTER TABLE "DEPARTAMENTOS" MODIFY ("ID_DEPARTAMENTOS" NOT NULL ENABLE);
  ALTER TABLE "DEPARTAMENTOS" ADD PRIMARY KEY ("ID_DEPARTAMENTOS")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table INVENTARIO_DEPTO
--------------------------------------------------------

  ALTER TABLE "INVENTARIO_DEPTO" MODIFY ("ID_INVENTARIO_DEPTO" NOT NULL ENABLE);
  ALTER TABLE "INVENTARIO_DEPTO" ADD PRIMARY KEY ("ID_INVENTARIO_DEPTO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table REGION
--------------------------------------------------------

  ALTER TABLE "REGION" ADD PRIMARY KEY ("ID_REGION")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table RESERVA
--------------------------------------------------------

  ALTER TABLE "RESERVA" MODIFY ("ID_RESERVA" NOT NULL ENABLE);
  ALTER TABLE "RESERVA" ADD PRIMARY KEY ("ID_RESERVA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table RESERVA_DEPARTAMENTOS
--------------------------------------------------------

  ALTER TABLE "RESERVA_DEPARTAMENTOS" ADD PRIMARY KEY ("DEPARTAMENTOS_ID_RESERVA", "DEPARTAMENTOS_ID_DEPARTAMENTOS")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table RESERVA_SERVICIOS
--------------------------------------------------------

  ALTER TABLE "RESERVA_SERVICIOS" ADD PRIMARY KEY ("ID_RESERVA", "ID_SERVICIOS")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table RESERVA_USUARIOS
--------------------------------------------------------

  ALTER TABLE "RESERVA_USUARIOS" ADD PRIMARY KEY ("USUARIOS_ID_RESERVA", "USUARIOS_ID_USUARIO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table SERVICIOS
--------------------------------------------------------

  ALTER TABLE "SERVICIOS" MODIFY ("ID_SERVICIOS" NOT NULL ENABLE);
  ALTER TABLE "SERVICIOS" ADD PRIMARY KEY ("ID_SERVICIOS")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table TIPO_INVENTARIO
--------------------------------------------------------

  ALTER TABLE "TIPO_INVENTARIO" MODIFY ("ID_TIPO_INVENTARIO" NOT NULL ENABLE);
  ALTER TABLE "TIPO_INVENTARIO" ADD PRIMARY KEY ("ID_TIPO_INVENTARIO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table USUARIO
--------------------------------------------------------

  ALTER TABLE "USUARIO" MODIFY ("ID_USUARIO" NOT NULL ENABLE);
  ALTER TABLE "USUARIO" ADD PRIMARY KEY ("ID_USUARIO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
