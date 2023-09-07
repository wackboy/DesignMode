package decorateMode;

/**
 * @Author:WackyCoder
 * @Date: 2023/9/7 8:22
 */
public class HongQiGong extends Master {

    public HongQiGong(Swordsman mSwordsman) {
        super(mSwordsman);
    }

    public void teachAttachMagic() {
        System.out.println("HongQiGong teach YangGuo DagouBang");
        System.out.println("YangGuo user DaGouBang");
    }

    @Override
    public void attackMagic() {
        super.attackMagic();
        teachAttachMagic();
    }
}
