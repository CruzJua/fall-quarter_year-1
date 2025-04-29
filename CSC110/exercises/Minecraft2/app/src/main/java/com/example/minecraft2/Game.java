package com.example.minecraft2;

import java.util.Random;

public class Game {
        private Blocks currentBlock;
        private Random randomBlock = new Random();
        private final int blockSpawnRate = 10;
        private int blockSpawnStatus;
        private int dirtAmount = 0;
        private int diamondOreAmount = 0;
        private int myceliumAmount = 0;
        private int snowAmount = 0;
        private int oakSlabAmount = 0;
        private int seaLanternAmount = 0;


        public Blocks getCurrentBlock(){
            return currentBlock;
        }

        public void setCurrentBlock(Blocks newCurrentBlock){
            currentBlock = newCurrentBlock;
        }
        public void playerWalk (int playerSpeed){
            blockSpawnStatus += playerSpeed;
            if (blockSpawnStatus > 10) {
                blockSpawnStatus = blockSpawnStatus % blockSpawnRate;
                switch (randomBlock.nextInt(6) + 1){
                    case 1:
                        setCurrentBlock(Blocks.DIRT);
                        break;
                    case 2:
                        setCurrentBlock(Blocks.DIAMOND_ORE);
                        break;
                    case 3:
                        setCurrentBlock(Blocks.MYCELIUM);
                        break;
                    case 4:
                        setCurrentBlock(Blocks.SNOW);
                        break;
                    case 5:
                        setCurrentBlock(Blocks.SEA_LANTERN);
                        break;
                    case 6:
                        setCurrentBlock(Blocks.OAK_SLAB);
                        break;
                    default:
                        setCurrentBlock(Blocks.EMPTY);
                }
            } else {
                setCurrentBlock(Blocks.EMPTY);
            }
        }

        public void playerMine(){
            switch (getCurrentBlock()){
                case DIRT:
                    dirtAmount ++;
                    break;
                case DIAMOND_ORE:
                    diamondOreAmount ++;
                    break;
                case MYCELIUM:
                    myceliumAmount ++;
                    break;
                case SNOW:
                    snowAmount ++;
                    break;
                case SEA_LANTERN:
                    seaLanternAmount ++;
                    break;
                case OAK_SLAB:
                    oakSlabAmount ++;
                    break;
                default:
                    //Do nothing
            }
            setCurrentBlock(Blocks.EMPTY);
        }

        @Override
    public String toString(){
            String inventory = "Dirt: " + dirtAmount + "\n Diamond Ore: " + diamondOreAmount + "\n Mycelim: " + myceliumAmount +
                    "\n Snow: " + snowAmount + "\n Oak Slabs: " + oakSlabAmount + "\n Sea Lanterns: " + seaLanternAmount ;
            return inventory;
        }


}
