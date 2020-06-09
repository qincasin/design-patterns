package com.qjx.balking;

import java.util.concurrent.TimeUnit;

/**
 * Created by qincasin on 2020/6/9.
 * 加锁校验逻辑
 */
public class WashingMachine {

    private DelayProvider delayProvider;
    private WashingMachineState state;

    public WashingMachine() {
        this((interval, timeUnit, task) -> {
            try {
                Thread.sleep(timeUnit.toMillis(interval));
            } catch (Exception e) {
                e.printStackTrace();
            }
            task.run();
        });
    }

    public WashingMachine(DelayProvider delayProvider) {
        this.delayProvider = delayProvider;
        this.state = WashingMachineState.ENABLE;
    }

    public WashingMachineState getState() {
        return state;
    }

    public void wash() {
        synchronized (this) {
            WashingMachineState state = getState();
            System.out.println("current thread: " + Thread.currentThread().getName() + " state:" + state);
            if (WashingMachineState.WASHING.equals(this.state)) {
                System.out.println("washing 模式 直接退出！！！j");
                return;
            }
            this.state = WashingMachineState.WASHING;
        }
        System.out.println("开始washing....");
        delayProvider.executeAfterDelay(50,
                TimeUnit.MILLISECONDS,
                this::endWashing);
    }

    private synchronized void endWashing() {
        state = WashingMachineState.ENABLE;
        System.out.println("ending washing ....");


    }
}
