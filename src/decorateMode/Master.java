package decorateMode;

/**
 * @Author:WackyCoder
 * @Date: 2023/9/7 8:21
 */
public class Master extends Swordsman {

    private Swordsman mSwordsman;

    public Master(Swordsman mSwordsman) {
        this.mSwordsman = mSwordsman;
    }

    @Override
    public void attackMagic() {
        mSwordsman.attackMagic();
    }
}
