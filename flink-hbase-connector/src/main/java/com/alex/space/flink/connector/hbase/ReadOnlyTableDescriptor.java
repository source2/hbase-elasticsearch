package com.alex.space.flink.connector.hbase;

import org.apache.hadoop.hbase.HTableDescriptor;

/**
 * ReadOnlyTableDescriptor
 *
 * for Table scan
 *
 * @author Alex Created by Alex on 2018/9/19.
 */
public class ReadOnlyTableDescriptor extends HTableDescriptor {

  public ReadOnlyTableDescriptor(HTableDescriptor desc) {
    super(desc.getTableName(), desc.getColumnFamilies(), desc.getValues());
  }

  @Override
  public boolean isReadOnly() {
    return true;
  }
  
}

