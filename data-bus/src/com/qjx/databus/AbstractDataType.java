package com.qjx.databus;

/**
 * Created by qincasin on 2020/6/8.
 */
public abstract class AbstractDataType implements DataType {
   private DataBus dataBus;

   @Override
   public DataBus getDataBus() {
      return dataBus;
   }

   @Override
   public void setDataBus(DataBus dataBus) {
      this.dataBus = dataBus;
   }
}
