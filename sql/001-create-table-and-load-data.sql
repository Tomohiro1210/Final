DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  password VARCHAR(20) NOT NULL,
  mail VARCHAR(50) NOT NULL,
  registrationDate DATE NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO users (name, password, mail, registrationDate) VALUES ("Inoue", "Pass1", "aabbcc@example.com", "2023/07/23");
