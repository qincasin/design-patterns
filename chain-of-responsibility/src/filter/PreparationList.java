package filter;

/**
 * Created by qincasin on 2021/3/1.
 */
public class PreparationList {
    /**
     * 洗脸
     */
    private boolean washFace;
    /**
     * 洗头
     */
    private boolean washHair;
    /**
     * 吃饭
     */
    private boolean haveBreakfast;

    public boolean isWashFace() {
        return washFace;
    }

    public void setWashFace(boolean washFace) {
        this.washFace = washFace;
    }

    public boolean isWashHair() {
        return washHair;
    }

    public void setWashHair(boolean washHair) {
        this.washHair = washHair;
    }

    public boolean isHaveBreakfast() {
        return haveBreakfast;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        this.haveBreakfast = haveBreakfast;
    }
}
