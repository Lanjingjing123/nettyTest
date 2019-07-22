package com.csii.ljj.netty.server;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.codec.string.StringDecoder;

import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) {
        ServerBootstrap bootstrap = new ServerBootstrap();

        ExecutorService boss = Executors.newCachedThreadPool();
        ExecutorService worker = Executors.newCachedThreadPool();
        // 设置nio socket 工厂
        bootstrap.setFactory(new NioServerSocketChannelFactory(boss,worker));
        // 设置管道工厂
        bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
            @Override
            public ChannelPipeline getPipeline() throws Exception {
                ChannelPipeline pipeline = Channels.pipeline();
                // 管道设置参数,接受到的直接是解码后的正常数据，不在是字节流
                pipeline.addLast("decoder",new StringDecoder());
                pipeline.addLast("helloHandler",new HelloHandler());
                return pipeline;
            }
        });
        bootstrap.bind(new InetSocketAddress(10101));
        System.out.println("start!");
    }
}
