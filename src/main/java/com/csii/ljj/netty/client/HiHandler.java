package com.csii.ljj.netty.client;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.*;

public class HiHandler extends SimpleChannelHandler {
    /**
     * 接受消息
     * @param ctx
     * @param e
     * @throws Exception
     */
    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        System.out.println("messageReceived: "+e.getMessage());
        // 网络传输 传输的是字节流，不是字节流，netty用的是一个ChannelBuff用于接受数据的传输
//        ChannelBuffer message = (ChannelBuffer) e.getMessage();
//        String str = new String(message.array());
//        System.out.println(str);

        super.messageReceived(ctx, e);
    }

    /**
     * 捕获异常
     * @param ctx
     * @param e
     * @throws Exception
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {
        System.out.println("exceptionCaught:");

        super.exceptionCaught(ctx, e);
    }

    /**
     * 管道连接
     * @param ctx
     * @param e
     * @throws Exception
     */
    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        System.out.println("channelConnected:");
        super.channelConnected(ctx, e);
    }

    /**
     * 断开管道连接
     * @param ctx
     * @param e
     * @throws Exception
     */
    @Override
    public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        System.out.println("channelDisconnected:");
        super.channelDisconnected(ctx, e);
    }

    /**
     * 关闭管道
     * @param ctx
     * @param e
     * @throws Exception
     */
    @Override
    public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        System.out.println("channelClosed:");
        super.channelClosed(ctx, e);
    }
}
