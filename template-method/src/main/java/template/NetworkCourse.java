package template;

/**
 * Created by qincasin on 2020/9/22.
 */
public abstract class NetworkCourse {
    protected final void createCourse() {
        //发布资料
        this.postPreResource();

        //制作课件ppt
        this.makePPT();

        //在线直播
        this.liveVideo();

        //提交课堂笔记
        this.postNote();

        //提交源码
        this.postSource();

        //布置作业 如果有作业 检查作业 如果没有 ，流程结束
        if (needHomeWork()) {
            checkHomeWork();
        }
    }

    protected void postSource() {
        System.out.println("提交源码");
    }

    protected void postNote() {
        System.out.println("提交课堂笔记");
    }

    protected void liveVideo() {
        System.out.println("直播");
    }

    protected void makePPT() {
        System.out.println("创建ppt");
    }

    protected boolean needHomeWork() {
        return false;
    }

    protected abstract void checkHomeWork();

    protected void postPreResource() {
        System.out.println("分发预习作业");
    }
}
