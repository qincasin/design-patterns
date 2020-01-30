package srp;


/**
 * 将本接口 拆分为 两个接口
 */
public interface ICourse {
    /**
     * 获得课程的基本信息
     */
    void courseName();

    /**
     * 获得视频流
     *
     * @return
     */
    byte[] courseVideo();

    /**
     * 学习课程
     */
    void studyCourse();

    /**
     * 退款
     */
    void refundCourse();

}
