package com.yyzc.hy.service.impl;

import org.apache.zookeeper.*;

import java.io.IOException;

import static org.apache.zookeeper.Watcher.Event.KeeperState.SyncConnected;

/**
 * @Author: songyalong
 * @Description: 同步创建
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
public class CreateNodeSync implements Watcher{

    static ZooKeeper zooKeeper;
    public static void main(String[] args) throws IOException, InterruptedException {
        zooKeeper = new ZooKeeper("192.168.137.2:2181,192.168.137.3:2181,192.168.137.4:2181", 5000, new CreateSession());
        Thread.sleep(Integer.MAX_VALUE);
    }


    public static  void createNode() throws KeeperException, InterruptedException {
        String s = zooKeeper.create("/node_test_1", "123".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(s);
    }

    @Override
    public void process(WatchedEvent watchedEvent) {

        if(watchedEvent.getState() == Event.KeeperState.SyncConnected){
            try {
                createNode();
            } catch (KeeperException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
