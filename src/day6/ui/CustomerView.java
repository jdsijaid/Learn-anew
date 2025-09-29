package day6.ui;

import day6.bean.Customer;
import day6.service.CustomerList;
import day6.util.CMUtility;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    //1.显示菜单
    public void enterMainMenu() {
        boolean isFlag = true;

        while (isFlag){
            System.out.println("********************客户信息管理软件********************");
            System.out.println("1.添加客户");
            System.out.println("2.修改客户");
            System.out.println("3.删除客户");
            System.out.println("4.查看客户");
            System.out.println("5.退出");

            System.out.println("*******************************************************");
            System.out.print("请选择(1-5):");
            char menu = CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addCustomers();
                    break;
                case '2':
                    updateCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出(Y/N)：");
                    char choice = CMUtility.readConfirmSelection();
                    if (choice == 'Y') {
                        System.out.println("退出系统");
                        isFlag = false;
                    }
                    break;
            }
        }
    }

    //2.添加客户
    private void addCustomers() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString();
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString();
        System.out.print("邮箱：");
        String email = CMUtility.readString();

        Customer customer = new Customer(name, gender, age, phone, email);
        customerList.addCustomer(customer);
        System.out.println("---------------------添加完成---------------------");
    }

    //3.修改用户
    private void updateCustomer() {
        System.out.println("---------------------修改客户---------------------");
        System.out.print("请选择待修改客户编号(-1退出)：");
        int index = CMUtility.readInt();

        if (index == -1) {
            return;
        }

        Customer cust = customerList.getCustomer(index - 1);
        if (cust == null) {
            System.out.println("无法找到指定客户！");
            return;
        }

        System.out.print("姓名(" + cust.getName() + ")：");
        String name = CMUtility.readString();
        if (!name.equals("")) {
            cust.setName(name);
        }

        System.out.print("性别(" + cust.getGender() + ")：");
        String genderStr = CMUtility.readString();
        if (!genderStr.equals("")) {
            cust.setGender(genderStr.charAt(0));
        }

        System.out.print("年龄(" + cust.getAge() + ")：");
        String ageStr = CMUtility.readString();
        if (!ageStr.equals("")) {
            cust.setAge(Integer.parseInt(ageStr));
        }

        System.out.print("电话(" + cust.getPhone() + ")：");
        String phone = CMUtility.readString();
        if (!phone.equals("")) {
            cust.setPhone(phone);
        }

        System.out.print("邮箱(" + cust.getEmail() + ")：");
        String email = CMUtility.readString();
        if (!email.equals("")) {
            cust.setEmail(email);
        }

        System.out.println("---------------------修改完成---------------------");
    }

    //4.删除用户
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        System.out.print("请选择待删除客户编号(-1退出)：");
        int index = CMUtility.readInt();

        if (index == -1) {
            return;
        }

        Customer customer = customerList.getCustomer(index - 1);
        if (customer == null) {
            System.out.println("无法找到指定客户！");
            return;
        }

        System.out.print("确认是否删除(Y/N)：");
        char choice = CMUtility.readConfirmSelection();
        if (choice == 'Y') {
            customerList.deleteCustomer(index - 1);
            System.out.println("---------------------删除完成---------------------");
        }
    }

    //5.查看所有客户
    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        Customer[] customers = customerList.getAllCustomers();
        if (customers.length == 0){
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            for (int i = 0; i < customers.length; i++){
                Customer customer = customers[i];
                System.out.println((i + 1) + "\t" + customer.getName() + "\t" +
                        customer.getGender() + "\t" + customer.getAge() + "\t" +
                        customer.getPhone() + "\t\t" + customer.getEmail());
            }
        }
        System.out.println("-------------------------客户列表完成-------------------------");
    }
}
