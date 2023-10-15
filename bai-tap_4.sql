/*
Bai tap tuan 4
*/
-- Question 1 
SELECT  ac.UserName, ac.FullName,ac.Email, dp.DepartmentName
FROM `account` ac 
JOIN Department dp ON dp.DepartmentID = ac.DepartmentID;

-- Question 2
SELECT *
FROM `account`
WHERE CreatedDate > '2010-12-20';

-- Question 3 
SELECT  ac.accountid, ac.fullname, ac.username,po.PositionName
FROM `account` ac
 JOIN position po ON po.PositionID = ac.PositionID
WHERE po.PositionName LIKE 'Dev%';

-- Question 4 
SELECT dp.DepartmentID, dp.departmentName, COUNT(dp.DepartmentID) AS Total
FROM `account` ac 
JOIN Department dp ON dp.DepartmentID = ac.DepartmentID 
GROUP BY dp.DepartmentID
Having Total > 3;

-- Question 5  
SELECT q.content, q.QuestionID, COUNT(q.questionID) AS Max_Question
FROM examquestion eq
JOIN question q ON q.questionID = eq.questionID
GROUP BY eq.QuestionID
HAVING Max_Question = ( SELECT MAX(Max_Question) FROM ( SELECT COUNT(q.questionID) AS Max_Question
FROM examquestion eq
JOIN question q ON q.questionID = eq.questionID
GROUP BY eq.QuestionID) temp_table);

-- Question 6
SELECT ca.CategoryID, ca.categoryname, COUNT(q.CategoryID) as total
FROM categoryquestion ca
JOIN question q ON q.CategoryID= ca.CategoryID
GROUP BY q.CategoryID;

-- Question 7 
SELECT q.questionID, q.content, COUNT(eq.questionID) as total
FROM examquestion eq
RIGHT JOIN question q ON q.questionID = eq.questionID
GROUP BY q.questionID;

-- Question 8 
SELECT q.QuestionID, q.Content, COUNT(a.AnswerID) as Max_Answer
FROM answer a
JOIN question q ON q.questionID = a.questionID
GROUP BY q.questionID
HAVING Max_Answer = (SELECT MAX(Max_Answer) FROM (
SELECT COUNT(a.AnswerID) as Max_Answer
FROM answer a
JOIN question q ON q.questionID = a.questionID
GROUP BY q.questionID) temp_table) ;

-- Question 9 
SELECT ga.GroupID, gr.GroupName, COUNT(ga.AccountID) AS Total
FROM groupaccount ga
JOIN `Group` gr ON gr.GROUPID = ga.GroupID
GROUP BY ga.GroupID;

-- Question 10 
SELECT po.PositionID, Po.PositionName, COUNT(po.positionID) as Min_position
FROM `account` ac 
JOIN position po ON po.PositionID = ac.PositionID
GROUP BY po.PositionID
HAVING Min_position = (SELECT MIN(Min_position) FROM 
(SELECT po.PositionID, Po.PositionName, COUNT(po.PositionID) as Min_position
FROM `account` ac 
JOIN position po ON po.PositionID = ac.PositionID
GROUP BY po.PositionID) temp_table);

-- Question 11
SELECT dp.DepartmentID, dp.DepartmentName, po.PositionName, COUNT(po.PositionID) AS Total
FROM `account`ac
JOIN Position po ON po.PositionID = ac.PositionID
JOIN Department dp ON dp.DepartmentID = ac.DepartmentID
GROUP BY po.PositionID,dp.DepartmentID;

-- Question 12 
SELECT q.questionID, cq.CategoryName, q.content, ac.fullname, an.content, tq.TypeName
FROM question q 
JOIN categoryquestion cq ON cq.categoryid = q.categoryid
JOIN typequestion tq ON tq.typeid = q.typeid
JOIN `account` ac ON ac.accountid = q.creatorid
JOIN answer an ON an.questionid = q.questionid;

-- Question 13 
SELECT tq.TypeName, COUNT(q.QuestionID)
FROM question q
JOIN typequestion tq ON tq.TypeID = q.TypeID 
GROUP BY tq.TypeID;

-- Question 14, 15
SELECT gr.groupID, gr.GroupName, ga.AccountID
FROM groupaccount ga
RIGHT JOIN `group` gr ON gr.GroupID = ga.GroupID
WHERE ga.AccountID IS NULL;

-- Question 16
SELECT q.QuestionID, q.Content, an.AnswerID
FROM answer an 
RIGHT JOIN `question` q ON q.QuestionID = an.QuestionID
WHERE an.AnswerID IS NULL;

-- Union 
-- Question 17
-- 17a
SELECT ac.FullName 
FROM `Account` ac
JOIN GroupAccount ga ON ac.AccountID = ga.AccountID
WHERE ga.GroupID = 1;
-- 17b
SELECT ac.FullName 
FROM `Account` ac
JOIN GroupAccount ga ON ac.AccountID = ga.AccountID
WHERE ga.GroupID = 2;
-- 17c
SELECT ac.FullName 
FROM `Account` ac
JOIN GroupAccount ga ON ac.AccountID = ga.AccountID
WHERE ga.GroupID = 1
UNION
SELECT ac.FullName 
FROM `Account` ac
JOIN GroupAccount ga ON ac.AccountID = ga.AccountID
WHERE ga.GroupID = 2;

-- Question 18 
-- 18a
SELECT gr.GroupName, COUNT(ga.GroupID) AS Total
FROM GroupAccount ga
JOIN `Group` gr ON ga.GroupID = gr.GroupID
GROUP BY gr.GroupID
HAVING COUNT(ga.GroupID) >= 5;
-- 18b
SELECT gr.GroupName, COUNT(ga.GroupID) AS Total
FROM GroupAccount ga
JOIN `Group` gr ON ga.GroupID = gr.GroupID
GROUP BY gr.GroupID
HAVING COUNT(ga.GroupID) <= 7;
-- 18c
SELECT gr.GroupName, COUNT(ga.GroupID) AS Total
FROM GroupAccount ga
JOIN `Group` gr ON ga.GroupID = gr.GroupID
GROUP BY gr.GroupID
HAVING COUNT(ga.GroupID) >= 5
UNION
SELECT gr.GroupName, COUNT(ga.GroupID) AS Total
FROM GroupAccount ga
JOIN `Group` gr ON ga.GroupID = gr.GroupID
GROUP BY gr.GroupID
HAVING COUNT(ga.GroupID) <= 7;



