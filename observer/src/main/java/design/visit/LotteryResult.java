package design.visit;

import java.util.Date;

/**
 * Created by qincasin on 2021/1/16.
 */

public class LotteryResult {
    private String uId;    // 用户ID
    private String msg;    // 摇号信息
    private Date dateTime; // 业务时间

    public LotteryResult(String uId, String msg, Date dateTime) {
        this.uId = uId;
        this.msg = msg;
        this.dateTime = dateTime;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
