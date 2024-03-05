package cn.anlper.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestCar {

    @Test
    public void test01() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz1 = Car.class;
        Class clazz2 = new Car().getClass();
        Class clazz3 = Class.forName("cn.anlper.reflect.Car");
        Car car = (Car) clazz3.getDeclaredConstructor().newInstance();
        Car car2 = (Car) clazz3.getConstructor().newInstance();
        System.out.println(car2);
    }

    @Test
    public void test02() throws Exception {
        Class clazz = Car.class;
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (var c: declaredConstructors) {
            System.out.println(c.getName() + c.getParameterCount());
            System.out.println(Arrays.toString(c.getParameterTypes()));
        }
    }

    @Test
    public void test03() throws Exception {
        Class carClass = Car.class;
        Field[] declaredFields = carClass.getDeclaredFields();
        for (var field: declaredFields) {
            System.out.println(field.getName());
        }
        Car car = new Car("保时捷", 10, "红色");
        Field field = carClass.getDeclaredField("name");
        field.setAccessible(true);
        String s = (String) field.get(car);
        System.out.println(s);
    }

    @Test
    public void test04() throws Exception {
        Class carClass = Car.class;
        Car car = new Car("保时捷", 10, "红色");
        Method method = carClass.getDeclaredMethod("run");
        method.setAccessible(true);
        method.invoke(car);
    }

}
