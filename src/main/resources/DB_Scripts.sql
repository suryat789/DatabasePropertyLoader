-- ######################################################################################
-- Postgres Script
--Table: public.appproperties

--DROP TABLE public.appproperties;

CREATE TABLE public.appproperties (
  applicationcode  text NOT NULL,
  filename         text NOT NULL,
  "key"            text NOT NULL,
  value            text,
  /* Keys */
  CONSTRAINT application_properties_pkey
    PRIMARY KEY ("applicationCode", filename, "key")
) WITH (
    OIDS = FALSE
  );

ALTER TABLE public.appproperties
  OWNER TO postgres;
  

INSERT INTO appproperties (applicationcode, filename, "key", value) VALUES
('ApplicationOne', 'AppOne.properties', 'KeyOne', 'ValueOne'),
('ApplicationOne', 'AppOne.properties', 'KeyTwo', 'ValueTwo');

-- ######################################################################################
-- HSQLDB Script
CREATE TABLE appproperties (
  applicationcode  VARCHAR(1000) NOT NULL,
  filename         VARCHAR(1000) NOT NULL,
  key            VARCHAR(1000) NOT NULL,
  value            VARCHAR(1000),
  /* Keys */
  CONSTRAINT application_properties_pkey
    PRIMARY KEY (applicationCode, filename, key)
) 

INSERT INTO appproperties (applicationcode, filename, key, value) VALUES
('ApplicationOne', 'AppOne.properties', 'KeyOne', 'ValueOne'),
('ApplicationOne', 'AppOne.properties', 'KeyTwo', 'ValueTwo');

-- ######################################################################################