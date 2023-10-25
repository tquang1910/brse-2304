import entity.Account;
import entity.Department;

import java.util.List;

public class Assignment2 {
    public static void main(String[] args) {
        Program program = new Program();

        List<Account> accountList = program.createAccount();

        // acc 2
        System.out.println(accountList.get(1).fullname);
        System.out.println(accountList.get(1).department.name);

        List<Department> departments = program.createDepartment();
        System.out.println(departments.get(0).name);
        System.out.println(departments.get(1).name);
        System.out.println(departments.get(2).name);

    }

}
