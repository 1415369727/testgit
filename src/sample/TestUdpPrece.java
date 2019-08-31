package sample;
import sun.nio.ch.DatagramSocketAdaptor;

import java.io.IOException;
import java.net.*;
import java.sql.SQLOutput;
/**
 *功能描述
 * @author wangxu
 * @date 2019/8/25
 */
public class TestUdpPrece
{
    public static void fun() throws IOException {
        DatagramSocket ds=new DatagramSocket(8989);

        //创建拆包对象
        byte [] buf=new byte[1024];
        int length=1024;
        DatagramPacket dp=new DatagramPacket(buf,length);
        //接收数据
        ds.receive(dp);

        //处理数据
        String ip=dp.getAddress().getHostAddress();
        //获取发送端的端口号
        int port=dp.getPort();
        //获取数据
        byte [] data=dp.getData();
        //获取接收到的数据实际长度
        int len=dp.getLength();
        System.out.println("数据来自"+ip+",端口是："+port+"数据是："+new String(data,0,len));
        ds.close();
    }

    public static void main(String[] args) throws IOException {
        fun();
    }
}
