package cn.anlper.iocxml.ditest;

public class Emp {
    private Dept dept;

    public Emp() {}

    public Emp(Dept dept) {
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
