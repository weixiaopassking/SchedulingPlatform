package com.skywilling.cn.monitor.model.DTO;

import com.skywilling.cn.manager.car.model.Pose;
import lombok.Data;

import java.io.Serializable;

@Data
public class TerminalInfo implements Serializable {

  private static final long serialVersionUID = -6127823095016190773L;

  private double v = 0.0;
  private double wheelAngle = 0.0;
  private double gear = 0;
  private Pose pose = new Pose();
  //private List<ModuleInfo> nodes = null;
  private String lane;
  private String station;
  private long timestamp;

}
