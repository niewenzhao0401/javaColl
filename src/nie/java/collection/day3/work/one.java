package nie.java.collection.day3.work;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        User user=new User();
        Scanner scanner = new Scanner(System.in);
        boolean tag = true;//标签
        while (tag) {
            System.out.println("请输入你要的选项");
            System.out.println("[1]\t 注册");
            System.out.println("[2]\t 登录");
            System.out.println("[3]\t 退出");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    user.input();
                    break;
                case 2:
                    user.output();
                    break;
                case 3:
                    //退出
                    scanner.close();
                    tag = false;
                    break;
                default:
                    break;
            }

        }


    }


}

class User {
    private String userName;
    private String passsWord;
    HashMap<String, String> map = new HashMap<>();

    public void input() {
        Scanner scanner = new Scanner(System.in);
        boolean tag = true;
        while (tag) {

            System.out.println("输入账号");
            String num = scanner.next();

            System.out.println("输入密码");
            String pass = scanner.next();

            if (!map.containsKey(num)) {
                map.put(num, pass);
                tag=false;
            } else {
                System.out.println("账号重复或者输入异常");
                System.out.println("请重新输入");
            }


        }
        System.out.print(map.keySet()+"用户");
        System.out.println("注册成功!");
    }

    public void output() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入账号");
        String num = scanner.next();

        System.out.println("输入密码");
        String pass = scanner.next();
        if (pass.equals(map.get(num))){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }



}
/*
package day4.work;

import java.util.Arrays;
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Register register = new Register();
        Scanner scanner = new Scanner(System.in);
        boolean tag = true;//标签
        while (tag) {
            System.out.println("请输入你要的选项");
            System.out.println("[1]\t 注册");
            System.out.println("[2]\t 登录");
            System.out.println("[3]\t 退出");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    register.input();
                    break;
                case 2:
                    register.output();
                    break;
                case 3:
                    //退出
                    scanner.close();
                    tag = false;
                    break;
                default:
                    break;
            }

        }
    }
}

class Register {

    String[] str = new String[2];//默认长度位16

    public void input() {
        Scanner scanner = new Scanner(System.in);

        boolean tag = true;
        while (tag) {
            System.out.println("输入手机号");
            String num = scanner.next();

            System.out.println("输入密码");
            String pass = scanner.next();
            if (num.matches("[1][35789]\\d{9}") && pass.matches("\\w{6,15}")) {
//            if (num.matches("[1][35789]") && pass.matches("\\w{6,15}")) {
                tag = false;

            } else {
                System.out.println("手机号或者密码不符合标准");
                System.out.println("请重新输入");
            }
            if (tag == false) {
                str[0] = num;
                str[1] = pass;
            }
        }
        System.out.println("注册成功!");
        System.out.println(Arrays.toString(str));
    }


    public boolean output() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println("输入手机号");
        String num = scanner.next();

        System.out.println("输入密码");
        String pass = scanner.next();

        if (num.equals(str[0]) && pass.equals(str[1])) {
            System.out.println("登录成功");
            return true;
        }
        {
            System.out.println("失败");

        }
        return false;
    }
}

 */