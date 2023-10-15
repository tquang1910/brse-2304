CREATE DATABASE IF NOT EXISTS training;

USE training;

CREATE TABLE leader(
id TINYINT AUTO_INCREMENT PRIMARY KEY,
`name` VARCHAR(50) NOT NULL
);

CREATE TABLE Trainee(
TraineeID TINYINT AUTO_INCREMENT PRIMARY KEY,
Full_Name VARCHAR(100) NOT NULL,
Birth_Date DATE NOT NULL,
Gender ENUM('male', 'female', 'unknow'),
ET_IQ INT CHECK(ET_IQ >=0 AND ET_IQ <=20),
ET_Gmath INT CHECK(ET_Gmath >=0 AND ET_Gmath<=20),
 ET_English INT CHECK(ET_English >=0 AND ET_English<=50), 
 Training_Class CHAR(3) NOT NULL,
 Evaluation_Notes VARCHAR(150),
 leader_id TINYINT,
 CONSTRAINT FOREIGN KEY fk_Trainee_leader (leader_id) REFERENCES leader(id)
);