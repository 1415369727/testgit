package sample;

import sun.net.InetAddressCachePolicy;

import java.net.*;
public class TestUdpSend {
    public static void main(String[] args) throws Exception {
    fun();

    }

    public static void fun()throws Exception{
        //创建发送端端点对象
        DatagramSocket ds=new DatagramSocket();
        byte []buf="UDP联系哈哈哈哈哈".getBytes();
        int length=buf.length;
        InetAddress add=InetAddress.getByName("127.0.0.1");
        int port=8989;
        DatagramPacket dp=new DatagramPacket(buf,length,add,port);
        //发送数据

        ds.send(dp);
        ds.close();
    }
}
