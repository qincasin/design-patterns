package com.qjx.databus;

import com.qjx.databus.DataType;

import java.util.function.Consumer;

/**
 * Created by qincasin on 2020/6/8.
 */
public interface Member extends Consumer<DataType> {

    @Override
    void accept(DataType event);
}
