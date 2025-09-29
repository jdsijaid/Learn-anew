package day6.service;

import day6.bean.Customer;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
        // total 初始化为0，表示当前客户数
    }

    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            System.out.println("客户数组已满，无法添加更多客户");
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            System.out.println("删除失败，索引无效");
            return false;
        }

        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[--total] = null;
        System.out.println("删除成功");
        return true;
    }

    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    public int getTotal() {
        return total;
    }
}
