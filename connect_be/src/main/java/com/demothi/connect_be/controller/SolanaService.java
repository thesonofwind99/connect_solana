package com.demothi.connect_be.controller;

import org.p2p.solanaj.core.PublicKey;
import org.p2p.solanaj.rpc.RpcClient;
import org.p2p.solanaj.rpc.RpcException;
import org.springframework.stereotype.Service;

@Service
public class SolanaService {
    RpcClient rpcClient = new RpcClient("https://api.mainnet-beta.solana.com");

    String getBalance(String address) {
        PublicKey publicKey = new PublicKey(address);
        try {
            long balance = rpcClient.getApi().getBalance(publicKey);
            return String.valueOf(balance);
        } catch (RpcException e) {
            e.printStackTrace();
            return "Error retrieving balance";
        }
    }

}
