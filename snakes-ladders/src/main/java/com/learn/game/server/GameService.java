package com.learn.game.server;

import com.learn.game.Die;
import com.learn.game.GameServiceGrpc;
import com.learn.game.GameState;
import com.learn.game.Player;
import io.grpc.stub.StreamObserver;

public class GameService extends GameServiceGrpc.GameServiceImplBase {

    @Override
    public StreamObserver<Die> roll(StreamObserver<GameState> responseObserver) {
        Player client = Player.newBuilder().setName("client").setPosition(0).build();
        Player server = Player.newBuilder().setName("server").setPosition(0).build();
        return new DieStreamingRequest(client, server, responseObserver);
    }

}
