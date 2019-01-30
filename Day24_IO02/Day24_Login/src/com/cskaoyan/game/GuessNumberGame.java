package com.cskaoyan.game;

import java.util.Scanner;

public class GuessNumberGame {
    private GuessNumberGame() {

    }

    public static void start() {
        // 生成一个随机数
        int randomNumder = (int) (Math.random() * 100) + 1;
        // 输入你猜的数字
        Scanner scanner = new Scanner(System.in);
        // 统计猜的次数
        int count = 0;
        while (true) {
            System.out.println("请输入你想猜的数字(1-100)：");
            int guessNumber = scanner.nextInt();
            count++;
            if (guessNumber > randomNumder) {
                System.out.println("你猜的数字" + guessNumber + "大了");
            } else if (guessNumber < randomNumder) {
                System.out.println("你猜的数字" + guessNumber + "小了");
            } else {
                System.out.println("恭喜您，经过" + count + "次就猜中了！");
                break;
            }
        }

    }
}
