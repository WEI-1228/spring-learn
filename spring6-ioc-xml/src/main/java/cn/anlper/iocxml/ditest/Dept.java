package cn.anlper.iocxml.ditest;

import java.util.Map;

public class Dept {
    private Emp[] emp;
    private Map<String, Emp> empMap;

    public Dept(Emp[] emp, Map<String, Emp> empMap) {
        this.emp = emp;
        this.empMap = empMap;
    }

    public Dept() {
        System.out.println("fadsfas");
    }

    public Dept(Map<String, Emp> empMap) {
        System.out.println("xxx");
        this.empMap = empMap;
    }

    public Map<String, Emp> getEmpMap() {
        return empMap;
    }

    public void setEmpMap(Map<String, Emp> empMap) {
        this.empMap = empMap;
    }

    public Dept(Emp[] emp) {
        System.out.println("dsf");
        this.emp = emp;
    }

    public Emp[] getEmp() {
        return emp;
    }

    public void setEmp(Emp[] emp) {
        this.emp = emp;
    }
}
