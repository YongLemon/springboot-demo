package top.xinzhang0618.springboot.demo.enums;

/**
 * ApproveStatus
 *
 * @author gavin
 * @version 2020/8/3
 */
public enum ApproveStatus implements BaseEnum {

    NONE("未审批", 1),
    AGREE("同意", 2),
    REJECT("拒绝", 3);


    private final String caption;
    private final int value;

    ApproveStatus(String caption, int value) {
        this.caption = caption;
        this.value = value;
    }

    @Override
    public String caption() {
        return this.caption;
    }

    @Override
    public int value() {
        return this.value;
    }
}
