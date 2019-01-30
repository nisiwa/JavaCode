package com.cskaoyan.dao.impl;

import com.cskaoyan.dao.UserDao;
import com.cskaoyan.pojo.User;

import java.io.*;
import java.util.*;

public class UserDaoImpl implements UserDao {
    // private static List<User> list = new ArrayList<>();
    // 把数据放在 user.txt中 格式是 name=password
    // 加载类的时候就创建user.txt
    static {
        File file = new File("user.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean register(User user) {

        try(BufferedReader reader = new BufferedReader(new FileReader("user.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt",true))) {
            Map<String, String> map = new HashMap<>();
            String s;
            while ((s = reader.readLine()) != null) {
                String[] strings = s.split("=");
                map.put(strings[0], strings[1]);
            }
            // 判断user的名字是否重复
            Set<String> names = map.keySet();
            for (String name : names) {
                if (name.equals(user.getName())) {
                    return false;
                }
            }
            // 添加user到user.txt
            writer.write(user.getName() + "=" + user.getPassword());
            writer.newLine();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("文件读写异常");
        }
        return true;
    }

    @Override
    public boolean login(String name, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("user.txt"))) {
            String s;
            List<String> list = new ArrayList<>();
            while ((s = reader.readLine()) != null) {
                list.add(s);
            }
            for (String s1 : list) {
                String[] strings = s1.split("=");
                if (strings[0].equals(name) && strings[1].equals(password)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("文件读写异常");
        }
        return false;
    }
}
