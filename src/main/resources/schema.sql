CREATE TABLE if not exists members (
  id SERIAL NOT NULL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  idobata_id VARCHAR(20),
  floor VARCHAR(20) DEFAULT 4,
  skip boolean
);
