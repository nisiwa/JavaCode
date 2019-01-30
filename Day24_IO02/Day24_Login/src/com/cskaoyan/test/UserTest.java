package com.cskaoyan.test;

import com.cskaoyan.dao.UserDao;
import com.cskaoyan.dao.impl.UserDaoImpl;
import com.cskaoyan.game.GuessNumberGame;
import com.cskaoyan.pojo.User;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        //loop:
        while(true) {
            System.out.println("-----------欢迎光临-----------");
            System.out.println("1 登陆");
            System.out.println("2 注册");
            System.out.println("3 退出");
            System.out.println("请输入你的选择：");
            Scanner scanner = new Scanner(System.in);
            String choiceNumber = scanner.nextLine();

            switch (choiceNumber) {
                case "1":
                    System.out.println("-----------登录界面-----------");
                    System.out.println("请输入用户名：");
                    String name = scanner.nextLine();
                    System.out.println("请输入密码：");
                    String password = scanner.nextLine();
                    UserDao userDao = new UserDaoImpl();
                    boolean flag = userDao.login(name, password);
                    if (flag) {
                        System.out.println("恭喜您，登录成功");
                        while (true) {
                            System.out.println("可以玩猜数字小游戏了,玩吗？(y/n)");
                            String s = scanner.nextLine();
                            if ("y".equalsIgnoreCase(s)) {
                                GuessNumberGame.start();
                            } else {
                                System.out.println("谢谢惠顾，欢迎下次再来");
                                //System.exit(0);
                                break;
                            }
                        }
                    } else {
                        System.out.println("用户名或者密码错误");
                    }
                    break;
                case "2":
                    System.out.println("-----------注册界面-----------");
                    System.out.println("请输入用户名：");
                    String name1 = scanner.nextLine();
                    System.out.println("请输入密码：");
                    String password1 = scanner.nextLine();
                    // 把name和user封装成一个对象
                    User user = new User(name1, password1);
                    UserDao userDao1 = new UserDaoImpl(); //多态
                    boolean flag1 = userDao1.register(user);
                    //对返回值分两种情况进行讨论：
                    if (flag1) {
                        System.out.println("恭喜您，注册成功");
                    } else {
                        System.out.println("很遗憾，用户名已被注册");
                    }
                    break;
                case "3":
                default:
                    System.out.println("谢谢惠顾，欢迎下次再来");
                    System.exit(0);
                    break;
            }
        }
    }
}
