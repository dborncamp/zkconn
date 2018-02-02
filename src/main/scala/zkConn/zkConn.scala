package zkConn

import com.twitter.finagle.exp.zookeeper.client.ZkClient


object zkConn extends App {
  val conport = "zk:2181"

  val zk = new ZooKeeperClient(conport)

  //val client = Zookeeper.newRichClient("192.168.0.1:2181,192.168.0.10:2181,192.168.0.5:2181")

  println("Hello")
}
