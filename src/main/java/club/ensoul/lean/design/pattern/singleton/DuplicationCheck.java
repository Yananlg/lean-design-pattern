package club.ensoul.lean.design.pattern.singleton;

/**
 * 双重检查[推荐用]
 * 优点：线程安全；延迟加载；效率较高。
 */
public class DuplicationCheck {

    private static volatile DuplicationCheck duplicationCheck;

    private DuplicationCheck() {}

    public static DuplicationCheck getInstance() {
        if (duplicationCheck == null) {
            synchronized (DuplicationCheck.class) {
                if (duplicationCheck == null) {
                    duplicationCheck = new DuplicationCheck();
                }
            }
        }
        return duplicationCheck;
    }
}