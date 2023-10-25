import entity.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        System.out.println("Main");
    }


    public List<Department> createDepartment() {
        List<Department> departmentList = new ArrayList<>();
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();


        department1.id = 1;
        department1.name = "Giám Đốc";
        department2.id = 2;
        department2.name = "Sale";
        department3.id = 3;
        department3.name = "Marketing";
        departmentList.add(department1);
        departmentList.add(department2);
        departmentList.add(department3);
        return departmentList;

    }

    public List<Position> createPosition() {
        List<Position> positionList = new ArrayList<>();
        Position position1 = new Position();
        Position position2 = new Position();
        Position position3 = new Position();

        position1.id = 1;
        position1.name = PositionName.DEV;
        position2.id = 2;
        position2.name = PositionName.PM;
        position3.id = 3;
        position3.name = PositionName.TEST;
        positionList.add(position1);
        positionList.add(position2);
        positionList.add(position3);
        return positionList;
    }

    public List<Account> createAccount() {
        List<Account> accountList = new ArrayList<>();
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        List<Department> departmentList = createDepartment();
        List<Position> positionList = createPosition();
        account1.id = 1;
        account1.email = "quanghai@gmail.com";
        account1.username = "quanghai";
        account1.fullname = "Nguyen Quang Hai";
        account1.department = departmentList.get(1);
        account1.position = positionList.get(0);
        account1.createddate = LocalDate.of(2021, 5, 20);

        account2.id = 2;
        account2.email = "vanhau@gmail.com";
        account2.username = "Van Hau";
        account2.fullname = "Doan Van Hau";
        account2.department = departmentList.get(2);
        account2.position = positionList.get(2);
        account2.createddate = LocalDate.now();

        account3.id = 3;
        account3.email = "quanganh@gmail.com";
        account3.username = "quanganh";
        account3.fullname = "Nguyen Quang Anh";
        account3.department = departmentList.get(2);
        account3.position = positionList.get(2);
        account3.createddate = LocalDate.of(2017, 3, 16);
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        return accountList;
    }

    /*
        entity.Group
     */
    public List<Group> createGroup() {
        List<Group> groupList = new ArrayList<>();
        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        List<Account> accountList = createAccount();

        group1.id = 1;
        group1.name = "entity.Group 1";
        group1.creator = accountList.get(2);
        group1.createddate = LocalDate.now();

        group2.id = 2;
        group2.name = "entity.Group 2";
        group2.creator = accountList.get(1);
        group2.createddate = LocalDate.of(2000, 10, 20);

        group3.id = 3;
        group3.name = "entity.Group 3";
        group3.creator = accountList.get(0);
        group3.createddate = LocalDate.of(2010, 2, 10);
        groupList.add(group1);
        groupList.add(group2);
        groupList.add(group3);
        return groupList;
    }


    public List<TypeQuestion> createTypeQuestion() {
        List<TypeQuestion> typeQuestionList = new ArrayList<>();
        TypeQuestion type1 = new TypeQuestion();
        TypeQuestion type2 = new TypeQuestion();
        TypeQuestion type3 = new TypeQuestion();

        type1.id = 1;
        type1.name = TypeName.ESSAY;
        type2.id = 2;
        type2.name = TypeName.MULTIPLE_CHOICE;
        type3.id = 3;
        type3.name = TypeName.ESSAY;
        typeQuestionList.add(type1);
        typeQuestionList.add(type2);
        typeQuestionList.add(type3);
        return typeQuestionList;
    }


    public List<CategoryQuestion> createCategoryQuestion() {
        List<CategoryQuestion> categoryQuestionList = new ArrayList<>();
        CategoryQuestion category1 = new CategoryQuestion();
        CategoryQuestion category2 = new CategoryQuestion();
        CategoryQuestion category3 = new CategoryQuestion();

        category1.id = 1;
        category1.name = "JAVA";

        category2.id = 2;
        category2.name = "SQL";

        category3.id = 3;
        category3.name = "POSTMAN";
        categoryQuestionList.add(category1);
        categoryQuestionList.add(category2);
        categoryQuestionList.add(category3);
        return categoryQuestionList;
    }

    public List<Question> createQuestion() {
        List<Question> questionList = new ArrayList<>();
        Question question1 = new Question();
        Question question2 = new Question();
        Question question3 = new Question();

        List<CategoryQuestion> categoryQuestionList = createCategoryQuestion();
        List<TypeQuestion> typeQuestionList = createTypeQuestion();
        List<Account> accountList = createAccount();

        question1.id = 1;
        question1.content = "entity.Question about JAVA";
        question1.category = categoryQuestionList.get(1);
        question1.type = typeQuestionList.get(0);
        question1.creator = accountList.get(2);
        question1.createddate = LocalDate.now();

        question2.id = 2;
        question2.content = "entity.Question about NET";
        question2.category = categoryQuestionList.get(1);
        question2.type = typeQuestionList.get(0);
        question2.creator = accountList.get(0);
        question2.createddate = LocalDate.of(2018, 6, 15);

        question3.id = 3;
        question3.content = "entity.Question about POSTMAN";
        question3.category = categoryQuestionList.get(2);
        question3.type = typeQuestionList.get(1);
        question3.creator = accountList.get(1);
        question3.createddate = LocalDate.now();
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);
        return questionList;
    }

    public List<Answer> createList() {
        List<Answer> answerList = new ArrayList<>();
        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        Answer answer3 = new Answer();
        List<Question> questionList = createQuestion();

        answer1.id = 1;
        answer1.content = "Câu trả lời 1";
        answer1.question = questionList.get(0);
        answer1.iscorrect = Boolean.FALSE;

        answer2.id = 2;
        answer2.content = "Câu trả lời 2";
        answer2.question = questionList.get(1);
        answer2.iscorrect = Boolean.TRUE;

        answer3.id = 3;
        answer3.content = "Câu trả lời 3";
        answer3.question = questionList.get(2);
        answer3.iscorrect = Boolean.TRUE;
        answerList.add(answer1);
        answerList.add(answer2);
        answerList.add(answer3);
        return answerList;
    }


    public List<Exam> createExam() {
        List<Exam> examList = new ArrayList<>();
        Exam exam1 = new Exam();
        Exam exam2 = new Exam();
        Exam exam3 = new Exam();

        List<CategoryQuestion> categoryQuestionList = createCategoryQuestion();
        List<Account> accountList = createAccount();

        exam1.id = 1;
        exam1.code = "MA SO 01";
        exam1.title = "DE 01";
        exam1.category = categoryQuestionList.get(1);
        exam1.duration = 90;
        exam1.creator = accountList.get(2);
        exam1.createddate = LocalDate.now();

        exam2.id = 2;
        exam2.code = "MA SO 02";
        exam2.title = "DE 02";
        exam2.category = createCategoryQuestion().get(2);
        exam2.duration = 90;
        exam2.creator = accountList.get(0);
        exam2.createddate = LocalDate.now();

        exam1.id = 3;
        exam1.code = "MA SO 03";
        exam1.title = "DE 03";
        exam1.category = categoryQuestionList.get(0);
        exam1.duration = 60;
        exam1.creator = accountList.get(1);
        exam1.createddate = LocalDate.now();
        examList.add(exam1);
        examList.add(exam2);
        examList.add(exam3);
        return examList;
    }

    // question 3:
//        System.out.println("----Thông tin phòng ban 1.----");
//        System.out.println("ID : "+department2.id);
//        System.out.println("NAME : "+department2.name);
//
//        System.out.println("----Thông tin chức vụ.----");
//        System.out.println("ID: "+position1.id);
//        System.out.println("NAME: "+position1.name);
//
//        System.out.println("----Thông tin nhân viên.----");
//        System.out.println("ID: "+account3.id);
//        System.out.println("EMAIL: "+account3.email);
//        System.out.println("USERNAME: "+account3.username);
//        System.out.println("FULLNAME: "+account3.fullname);
//        System.out.println("DEPARTMENT: "+account3.department.name);
//        System.out.println("POSITION: "+account3.position.name);
//        System.out.println("CREATED DATE: "+account3.createddate);
//
//        System.out.println("----Thông tin nhóm.----");
//        System.out.println("ID: "+group1.id);
//        System.out.println("NAME: "+group1.name);
//        System.out.println("CREATOR: "+account3.fullname);
//        System.out.println("CREATED DATE: "+group1.createddate);
//
//        System.out.println("----Thông tin loại câu hỏi----");
//        System.out.println("ID: "+type2.id);
//        System.out.println("NAME: "+type2.name);
//
//        System.out.println("----Thông tin chủ đề câu hỏi----");
//        System.out.println("ID: "+category3.id);
//        System.out.println("NAME: "+category3.name);
//
//        System.out.println("----Thông tin câu hỏi----");
//        System.out.println("ID: "+question2.id);
//        System.out.println("CONTENT: "+question2.content);
//        System.out.println("CATEGORY NAME : "+question2.category.name );
//        System.out.println("TYPE NAME : "+question2.type.name);
//        System.out.println("CREATOR NAME : "+question2.creator.fullname);
//        System.out.println("CREATED DATE : "+question2.createddate);
//
//        System.out.println("----Thông tin câu trả lời----");
//        System.out.println("ID: "+answer3.id);
//        System.out.println("CONTENT: "+answer3.content);
//        System.out.println("QUESTION CONTENT: "+answer3.question.content );
//        System.out.println("IS CORRECT: "+answer3.iscorrect);
//
//        System.out.println("----Thông tin thi----");
//        System.out.println("ID: "+exam1.id);
//        System.out.println("CODE: "+exam1.code);
//        System.out.println("TITLE: "+exam1.title);
//        System.out.println("CATEGORY NAME: "+exam1.category.name);
//        System.out.println("DURATION: "+exam1.duration);
//        System.out.println("CREATOR: "+exam1.creator.fullname );
//        System.out.println("CREATED DATE: "+exam1.createddate);

}
