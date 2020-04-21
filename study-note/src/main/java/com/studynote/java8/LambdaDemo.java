package com.studynote.java8;

import org.junit.jupiter.api.Test;

import java.util.Objects;

/**
 * description
 * author yufw
 * data 2020/4/15 19:21
 */
public class LambdaDemo {


    /**
     * 入参：无
     * 返回值：无
     * 测试
     */
    @Test
    public void test1(){

        // 匿名内部类的方式
        NullParamVoid nullParamVoid = new NullParamVoid() {
            @Override
            public void test() {
                System.out.println("测试方式: 匿名内部类\n");
            }
        };
        // lamda 表达式 标准语法
        NullParamVoid nullParamVoid1 = () -> {
            System.out.println("测试方式: lanbda表达式\n");
        };
        // lamda 表达式 简化
        NullParamVoid nullParamVoid2 = () -> System.out.println("测试方式: lanbda表达式 \n如果lambda 体的代码只有一行，大括号 可以省略");

        System.out.println("无入参，无返回值的 函数接口测试 \n ");

        nullParamVoid.test();
        nullParamVoid1.test();
        nullParamVoid2.test();

    }

    /**
     * 入参：无
     * 返回值：有
     * 测试
     */
    @Test
    public void test2(){

        // 匿名内部类的方式
        NullParamReturn interfaceInstance = new NullParamReturn() {
            @Override
            public String test() {
                return "匿名内部类";
            }
        };
        // lamda 表达式 标准语法
        NullParamReturn interfaceInstance1 = () -> {
            return "lamda 表达式 标准语法";
        };
        // lamda 表达式 简化
        NullParamReturn interfaceInstance2 = () -> "测试方式: lanbda表达式 \n如果lambda 体的代码只有一行，大括号 可以省略";

        System.out.println("无入参，有返回值的 函数接口测试 \n ");

        System.out.println(interfaceInstance.test());
        System.out.println(interfaceInstance1.test());
        System.out.println(interfaceInstance2.test());

    }


    /**
     * 入参：一个
     * 返回值：有
     * 测试
     */
    @Test
    public void test3(){

        // 匿名内部类的方式
        OneParamReturn<Integer> interfaceInstance = new OneParamReturn<Integer>() {
            @Override
            public Integer test(Integer x) {
                return  ++x;
            }
        };
        // lamda 表达式 标准语法
        OneParamReturn<Integer> interfaceInstance1 = (Integer x) -> {
            return ++x;
        };

        // lamda 表达式 简化1
        // lambda 体 只有一行代码 可以省略 {}
        OneParamReturn<Integer> interfaceInstance2 = (Integer x) -> ++x;

        // lamda 表达式 简化
        // 可以不写入参 类型
        OneParamReturn<Integer> interfaceInstance3 = (x) -> ++x;

        // lamda 表达式 简化
        // 如果入参只有一个 参数 可以 省略 （）
        OneParamReturn<Integer> interfaceInstance4 = x -> ++x;


        System.out.println("一个入参，有返回值的 函数接口测试 \n ");

        System.out.println(interfaceInstance.test(1));
        System.out.println(interfaceInstance1.test(1));
        System.out.println(interfaceInstance2.test(1));
        System.out.println(interfaceInstance3.test(1));
        System.out.println(interfaceInstance4.test(1));

    }


    /**
     * 入参：多个
     * 返回值：有
     * 测试
     */
    @Test
    public void test4(){

        // 匿名内部类的方式
        MoreParamReturn<Integer,Integer> interfaceInstance = new MoreParamReturn<Integer, Integer>() {
            @Override
            public Integer test(Integer x, Integer y) {
                return x + y;
            }
        };
        // lamda 表达式 标准语法
        MoreParamReturn<Integer,Integer> interfaceInstance1 = (Integer x, Integer y) -> {
            return x + y;
        };

        // lamda 表达式 简化1
        // lambda 体 只有一行代码 可以省略 {}
        MoreParamReturn<Integer,Integer> interfaceInstance2 = (Integer x, Integer y) -> x + y;

        // lamda 表达式 简化
        // 可以不写入参 类型
        // 敲黑板： 多个参数 要么类型 全部省略 要么 全部不省略  不允许 省略部分
        MoreParamReturn<Integer,Integer> interfaceInstance3 = (x, y) -> x + y;

        System.out.println("多个入参，有返回值的 函数接口测试 \n ");

        System.out.println(interfaceInstance.test(1, 2));
        System.out.println(interfaceInstance1.test(1, 2));
        System.out.println(interfaceInstance2.test(1, 2));
        System.out.println(interfaceInstance3.test(1, 2));

    }

}

/**
 * 入参：无
 * 返回值：无
 *
 * 函数接口
 */
@FunctionalInterface
interface NullParamVoid {
    void test();
}

/**
 * 入参：无
 * 返回值：有
 *
 * 函数接口
 */
@FunctionalInterface
interface NullParamReturn {
    String test();
}

/**
 * 入参：一个
 * 返回值：无
 *
 * 函数接口
 */
@FunctionalInterface
interface OneParamVoid<T> {
    void test(T x);
}

/**
 * 入参：一个
 * 返回值：有
 *
 * 函数接口
 */
@FunctionalInterface
interface OneParamReturn<T> {
    T test(T x);
}

/**
 * 入参：多个
 * 返回值：有
 *
 * 函数接口
 */
@FunctionalInterface
interface MoreParamReturn<T,R> {
    R test(T x,T y);
}



class DemoBean{
    private int id;

    private String name;

    public DemoBean() {
    }

    public DemoBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemoBean demo = (DemoBean) o;
        return id == demo.id &&
                name.equals(demo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}



