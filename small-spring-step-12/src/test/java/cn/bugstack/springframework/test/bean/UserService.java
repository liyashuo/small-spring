package cn.bugstack.springframework.test.bean;

import java.util.Random;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class UserService implements IUserService {

    public String queryUserInfo() {
        try {
            // int nextInt(int num)
            // 随机返回一个值在[0,num)的int类型的整数,包括0不包括num
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "小傅哥，100001，深圳";
    }

    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + userName + " success！";
    }

}
