CREATE DATABASE Testing_System_1;

USE Testing_System_1;

CREATE TABLE Department(
DepartmentID TINYINT PRIMARY KEY AUTO_INCREMENT,
DepartmentName VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE Position (
PositionID TINYINT PRIMARY KEY AUTO_INCREMENT,
PositionName ENUM('Dev', 'Test', 'Scrum Master', 'PM') NOT NULL UNIQUE
);

CREATE TABLE `Account`(
AccountID TINYINT AUTO_INCREMENT PRIMARY KEY,
Email VARCHAR(100) NOT NULL UNIQUE,
Username Varchar(50) NOT NULL UNIQUE, 
Fullname VARCHAR(100), 
DepartmentID TINYINT,
PositionID TINYINT,
CreateDate DATE,
CONSTRAINT FOREIGN KEY  fk_account_department(DepartmentID) REFERENCES Department(DepartmentID),
CONSTRAINT FOREIGN KEY 	 fk_account_position (PositionID) REFERENCES Position (PositionID)
);

CREATE TABLE `Group`(
GroupID TINYINT AUTO_INCREMENT PRIMARY KEY,
GroupName VARCHAR(50) UNIQUE, 
CreatorID TINYINT, 
CreateDate DATE
);

CREATE TABLE GroupAccount(
GroupID TINYINT,
AccountID TINYINT,
JoinDate DATETIME,
PRIMARY KEY (`GroupID`, `AccountID`),
CONSTRAINT FOREIGN KEY fk_GroupAccount_Group(GroupID) REFERENCES `Group`(GroupID),
CONSTRAINT FOREIGN KEY fk_GroupAccount_Account(AccountID) REFERENCES `Account`(AccountID)
);

CREATE TABLE TypeQuestion(
TypeID TINYINT AUTO_INCREMENT PRIMARY KEY,
TypeName ENUM ('Essay', 'Multiple-Choice') NOT NULL UNIQUE 
);

CREATE TABLE CategoryQuestion(
CategoryID TINYINT AUTO_INCREMENT PRIMARY KEY,
CategoryName VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE Question(
QuestionID TINYINT AUTO_INCREMENT PRIMARY KEY,
Content VARCHAR(100) NOT NULL, 
CategoryID TINYINT,
TypeID TINYINT,
CreatorID TINYINT,
CreateDate DATETIME,
CONSTRAINT fk_Question_CategoryQuestion FOREIGN KEY (CategoryID) REFERENCES categoryquestion(CategoryID),
CONSTRAINT fk_Question_TypeQuestion FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID),
CONSTRAINT fk_Question_Group FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);


CREATE TABLE Answer(
AnswerID SMALLINT AUTO_INCREMENT PRIMARY KEY,
Content VARCHAR(100) NOT NULL, 
QuestionID TINYINT,
isCorrect ENUM('RIGHT', 'FALSE'),
CONSTRAINT fk_Answer_Question FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

CREATE TABLE Exam(
ExamID TINYINT AUTO_INCREMENT PRIMARY KEY, 
`Code` VARCHAR(50) NOT NULL UNIQUE, 
Title VARCHAR(100) NOT NULL, 
CategoryID TINYINT,
DURATION DATETIME, 
CreatorID TINYINT,
CreateDate DATETIME, 
CONSTRAINT fk_Exam_CategoryQuestion FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
CONSTRAINT fk_Exam_Group FOREIGN KEY (CreatorID) REFERENCES `Account` (AccountID)
);

CREATE TABLE ExamQuestion(
ExamID TINYINT,
QuestionID TINYINT,
PRIMARY KEY (`ExamID`, `QuestionID`),
CONSTRAINT FOREIGN KEY fk_ExamQuestion_Exam(ExamID) REFERENCES Exam(ExamID),
CONSTRAINT FOREIGN KEY fk_ExamQuestion_Question(QuestionID) REFERENCES Question(QuestionID)
);