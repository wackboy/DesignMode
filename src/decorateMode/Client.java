package decorateMode;

/**
 * @Author:WackyCoder
 * @Date: 2023/9/7 8:24
 */
public class Client {

    public static void main(String[] args) {
        YangGuo yangGuo = new YangGuo();
        HongQiGong hongQiGong = new HongQiGong(yangGuo);
        hongQiGong.attackMagic();
    }

}
