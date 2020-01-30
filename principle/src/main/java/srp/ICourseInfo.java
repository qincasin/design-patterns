package srp;


public interface ICourseInfo {
    /**
     * 获得课程的基本信息
     */
    void courseName();

    /**
     * 获得视频流
     * @return
     */
    byte[] courseVideo();
}
