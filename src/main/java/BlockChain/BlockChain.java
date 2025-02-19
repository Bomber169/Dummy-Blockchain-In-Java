package BlockChain;

import Cryptocurrency.TransactionOutput;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class BlockChain {

    public static ArrayList<Block> blockChain;
    public static Map<String, TransactionOutput> UTXOs;

    public BlockChain(){
        BlockChain.UTXOs = new HashMap<String, TransactionOutput>();
        BlockChain.blockChain = new ArrayList<>();
    }
    public void addBlock(Block block){

        BlockChain.blockChain.add(block);
    }
    public int size(){

        return BlockChain.blockChain.size();
    }
    public String toString(){

        String blockChain = "";

        for (Block block : BlockChain.blockChain)
            blockChain+= block.toString()+"\n";

        return blockChain;
    }

}

