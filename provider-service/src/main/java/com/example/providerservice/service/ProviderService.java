package com.example.providerservice.service;

import com.example.grpc.ProviderServiceGrpc;
import com.example.grpc.ProviderServiceOuterClass;
import com.example.providerservice.entity.User;
import com.example.providerservice.repository.UserRepository;
import io.grpc.stub.StreamObserver;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.time.OffsetDateTime;

@GrpcService
@RequiredArgsConstructor
public class ProviderService extends ProviderServiceGrpc.ProviderServiceImplBase {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public void send(ProviderServiceOuterClass.HelloRequest request,
                     StreamObserver<ProviderServiceOuterClass.HelloResponse> responseObserver) {

        var requestUser = new User();
        requestUser.setName(request.getName());
        requestUser.setCreatedAt(OffsetDateTime.now());

        var userFromDb = userRepository.save(requestUser);

        var responce = ProviderServiceOuterClass.HelloResponse.newBuilder()
                .setId(String.valueOf(userFromDb.getId()))
                .setName(userFromDb.getName())
                .build();

        responseObserver.onNext(responce);
        responseObserver.onCompleted();
    }
}
