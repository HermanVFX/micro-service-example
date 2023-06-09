package com.example.mainserviceapp.servise.impl;

import net.devh.boot.grpc.client.inject.GrpcClient;
import com.example.grpc.ProviderServiceGrpc;
import com.example.grpc.ProviderServiceOuterClass;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @GrpcClient("GLOBAL")
    ProviderServiceGrpc.ProviderServiceBlockingStub  serviceBlockingStub;

    public String hello(String name) {
        return serviceBlockingStub.send(generatedHelloRequest(name)).getHello();
    }

    private ProviderServiceGrpcOuterClas.HelloRequest generatedHelloRequest(String name) {
        return ProviderServiceGrpcOuterClass.HelloRequest.newBuilder()
                .setName(name)
                .build();
    }
}
