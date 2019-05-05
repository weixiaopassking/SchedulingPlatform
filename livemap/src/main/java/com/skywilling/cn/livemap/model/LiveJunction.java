package com.skywilling.cn.livemap.model;

import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * crossNode：交叉路口，合流点
 */
@Data
public class LiveJunction extends Node implements Serializable {

    private int id;
    private String name;
    private double priority;
    private double weight;
    //排队通过路口的阻塞队列
    private LinkedBlockingQueue<String> inComingVehicles = new LinkedBlockingQueue<>();

}
