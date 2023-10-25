import jdk.nashorn.internal.parser.Scanner;

public class Ex1 {

    public void ques1(Account acc2) {
        System.out.println("-----------Question1-----------");
        if (acc2.department == null) {
            System.out.println("Nhan vien nay chua co phong ban ");
        } else {
            System.out.println("Phong ban cua nhan vien nay la: " + acc2.department.name);
        }
    }

    public void ques2(Account acc2) {
        System.out.println("-----------Question2-----------");
        int countGroups = acc2.groups.length;
        if (acc2.groups == null) {
            System.out.println("Nhan vien nay chua co group");
        } else if (countGroups == 1 || countGroups == 2) {
            System.out.println("Group cua nhan vien nay la java Fresher, C# Fresher");
        } else if (countGroups == 3) {
            System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
        } else if (countGroups == 4) {
            System.out.println("Nhan vien nay la nguoi hong chuyen , tham gia tat ca cac group");
        }
    }

    public void ques3(Account acc2) {
        System.out.println("-----------Question3-----------");
        System.out.println(acc2.department == null ?
                "Nhan vien nay chua co phong ban" : "Phong ban cua nhan vien nay la:" + acc2.department.name);
    }

    public void ques4(Account acc1) {
        System.out.println("-----------Question4-----------");
        System.out.println(acc1.position.name == PositionName.Dev ? "Đây là Developer" : "Người này không phải là Developer");
    }

    public void ques5(Group group1) {
        System.out.println("=======Question5========");
        switch (group1.accounts.length) {
            case 1:
                System.out.println("Nhom co 1 thanh vien ");
                break;
            case 2:
                System.out.println("Nhom co 2 thanh vien");
            case 3:
                System.out.println("Nhom co 3 thanh vien");
            default:
                System.out.println("Nhom co nhieu thanh vien");
        }
    }

    public void ques6(Account acc2) {
        System.out.println("=======Question6========");

        switch (acc2.groups.length) {
            case 1:
            case 2:
                System.out.println("Group cua nhan vien nay la java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
                break;
            case 4:
                System.out.println("Nhan vien nay la nguoi hong chuyen , tham gia tat ca cac group");
                break;
            default:
                System.out.println(" Nhan vien nay chua co group");
        }

    }

    public void ques7(Account acc1) {
        System.out.println("=======Question7========");
        switch (acc1.position.name.toString()) {
            case "Dev":
                System.out.println("Day la Developer");
                break;
            default:
                System.out.println("Day khong phai la Developer");

        }
    }

    public void ques8(Account acc1, Account acc2, Account acc3) {
        System.out.println("=====Question8======");
        Account[] accounts = {acc1, acc2, acc3};
        for (Account account : accounts) {
            System.out.println("Email: " + account.email + "\n" + "FullName: " + account.fullName + "\n"
                    + "DepartmentName: " + account.department.name);
        }
    }

    public void ques9(Department dep1, Department dep2, Department dep3) {
        Department[] departments = {dep1, dep2, dep3};
        for (Department department : departments) {
            System.out.println("ID: " + department.id + "; Name: " + department.name);
        }
    }

    public void ques10(Account acc1, Account acc2) {
        Account[] accounts = {acc1, acc2};
        System.out.println("=====Question10======");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + accounts[i].email + "\n" + "FullName: " + accounts[i].fullName + "\n"
                    + "DepartmentName: " + accounts[i].department.name);
        }
    }

    public void ques11(Department dep1, Department dep2, Department dep3) {
        Department[] departments = {dep1, dep2, dep3};
        System.out.println("=====Question11======");
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].id + "\n" + "Name: " + departments[i].name);
        }
    }

    public void ques12(Department dep1, Department dep2, Department dep3) {
        Department[] departments = {dep1, dep2, dep3};
        for (int i = 0; i < 2; i++) {
            System.out.println("=====Question12======");
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].id + "\n" + "Name: " + departments[i].name);
        }
    }

    public void ques13(Account acc1, Account acc2, Account acc3) {
        System.out.println("=====Question13======");
        Account[] accounts = {acc1, acc2, acc3};
        for (int i = 0; i < accounts.length; i++) {
            if (i !=1 ){
            System.out.println("Email: " + accounts[i].email + "\n" + "FullName: " + accounts[i].fullName + "\n"
                    + "DepartmentName: " + accounts[i].department.name);
        }
    }
}
    public void ques14(Account acc1, Account acc2, Account acc3){
        System.out.println("======Question14======");
        Account[] accounts = {acc1,acc2,acc3};
        for (int i = 0; i < accounts.length; i++){
            if(accounts[i].id < 4 ) {
                System.out.println("Email: " + accounts[i].email + "\n" + "FullName: " + accounts[i].fullName + "\n"
                        + "DepartmentName: " + accounts[i].department.name);
            }
        }
    }
    public void ques15() {
        System.out.println("======Question15======");
        for(int i = 0; i <=20;i =  i + 2){
            System.out.println("i= " + i );

        }
    }
    public void ques16Of10(Account acc1, Account acc2, Account acc3) {
        System.out.println("=======Question16-10=======");
        int i = 0;
        Account[] accounts = {acc1, acc2, acc3};
        while (i < accounts.length) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + accounts[i].email + "\n" + "FullName: " + accounts[i].fullName + "\n"
                    + "DepartmentName: " + accounts[i].department.name);
            i++;
        }
    }

    public void ques16Of11(Department depa1, Department depa2, Department depa3) {
        System.out.println("======Question16-11=======");
        int i =0;
        Department[] departments = {depa1, depa2, depa3};
        while (i < departments.length){
            System.out.println("Id: " + departments[i].id + "; Name: " + departments[i].name);
        i++;
        }
    }

    public void ques16Of12(Account acc1, Account acc2, Account acc3) {
        System.out.println("=======Question16-12======");
        int i = 0;
        Account[] accounts = {acc1, acc2, acc3};
        while (i < 2) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + accounts[i].email + "\n" + "FullName: " + accounts[i].fullName + "\n"
                    + "DepartmentName: " + accounts[i].department.name);
            i++;
        }
    }
    public void ques16Of13(Account acc1, Account acc2, Account acc3) {
        System.out.println("=======Question16-13======");
        int i = 0;
        Account[] accounts = {acc1, acc2, acc3};
        while (i <  accounts.length)  {
            if ( i == 1 ) {
                i++;
                continue;
            }
            System.out.println("Email: " + accounts[i].email + "\n" + "FullName: " + accounts[i].fullName + "\n"
                    + "DepartmentName: " + accounts[i].department.name);
            i++;
        }
    }


    public void ques16Of14(Account acc1, Account acc2, Account acc3) {
        Account[]  accounts = {acc1,acc2,acc3};
        int i = 0;
        while (i <accounts.length) {
            System.out.println("Email: " + accounts[i].email + "\n" + "FullName: " + accounts[i].fullName + "\n"
                    + "DepartmentName: " + accounts[i].department.name);
            if (accounts[i].id > 2  ) {
                break;
            }
            i++;
        }
    }

}







