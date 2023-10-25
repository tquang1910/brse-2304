
import java.lang.invoke.SwitchPoint;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
// Tạo Department

        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Marketing";
        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";
        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "BOD";

// Tạo Position

        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = PositionName.Dev;
        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = PositionName.PM;
        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = PositionName.Scrum_Master;

// Tạo Group

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing System";
        group1.createDate = LocalDate.of(2021, 1, 1);
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";

        group2.createDate = LocalDate.of(2020, 2, 1);
        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";
        group3.createDate = LocalDate.of(2019, 9, 23);

// Tạo Account

        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "daonq1";
        acc1.userName = "daonq1";
        acc1.fullName = "Dao Nguyen 1";
        acc1.department = dep3;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();
        Group[] groupAcc1 = {group1, group2};
        acc1.groups = groupAcc1;
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "daonq2";
        acc2.userName = "daonq2";
        acc2.fullName = "Dao Nguyen 2";
        acc2.department = dep1;
        acc2.position = pos2;
        acc2.createDate = LocalDate.of(2021, 03, 17);
        acc2.groups = new Group[]{group3, group2};
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "daonq3";
        acc3.userName = "daonq3";
        acc3.fullName = "Dao Nguyen 3";
        acc3.department = dep2;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();

// add Group Account
        group1.accounts = new Account[]{acc1};
        group2.accounts = new Account[]{acc1, acc2};
        group3.accounts = new Account[]{acc3, acc2};


        Ex1 ex1 = new Ex1();
//        ex1.ques1(acc2);
//        ex1.ques2(acc2);
//        ex1.ques3(acc2);
//        ex1.ques4( acc1);
//        ex1.ques5(group1);
//        ex1.ques6(acc2);
//        ex1.ques7(acc1);
//        ex1.ques8(acc1,acc2,acc3);
//        ex1.ques9(dep1, dep2, dep3);
//        ex1.ques10(acc1, acc2);
//        ex1.ques11(dep1,dep2,dep3);
//        ex1.ques12(dep1,dep2,dep3);
//        ex1.ques13(acc1,acc2,acc3);
//        ex1.ques14(acc1,acc2,acc3);
//        ex1.ques15();
//        ex1.ques16Of10(acc1,acc2,acc3);
//        ex1.ques16Of11(dep1,dep2,dep3);
//        ex1.ques16Of12(acc1, acc2, acc3);
        ex1.ques16Of13(acc1, acc2, acc3);
    }
}


