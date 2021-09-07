package data.structures;

import data.structures.arrays.MyArrayList;

public class Main {

    public static void main(String[] args){
        MyArrayList employee = new MyArrayList();
        employee.add("Hassan");
        employee.add("Rahul");
        employee.add("Kiran");
        employee.add("Andrew");
        employee.add("Hardik");
        employee.add("Mary");
        employee.add("Gail");
        employee.add("Kalpana");

        employee.remove("Gail");
        employee.remove("Mary");
        employee.remove("Mike");

        employee.get(100);
        employee.remove(24);

        for(int i = 0; i < employee.getSize(); i++){
            System.out.println(employee.get(i));
        }
    }
}
