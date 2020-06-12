# at net.minecraft.util.Cartesian$GetList.apply(Cartesian.java:56)
## Full Error

    at net.minecraft.util.Cartesian$GetList.apply(Cartesian.java:56) 
    at net.minecraft.util.Cartesian$GetList.apply(Cartesian.java:1) 
    at com.google.common.collect.Iterators$8.transform(Iterators.java:794) 
    at com.google.common.collect.TransformedIterator.next(TransformedIterator.java:48) 
    at net.minecraft.block.state.BlockState.<init>(BlockState.java:53) 
    at net.minecraft.block.Block.createBlockState(Block.java:1210) 
    at net.minecraft.block.Block.<init>(Block.java:296) 
    at net.minecraft.block.Block.<init>(Block.java:302) 
    at net.minecraft.block.BlockAir.<init>(BlockAir.java:13) 
    at net.minecraft.block.Block.registerBlocks(Block.java:1243) 
    at net.minecraft.init.Bootstrap.register(Bootstrap.java:517) 
    at net.minecraft.client.Minecraft.<init>(Minecraft.java:389) 
    at net.minecraft.client.main.Main.main(Main.java:113) 
    at Start.main(Start.java:11)


## Solution
You might be running an older JDK, download JDK 8 from [https://adoptopenjdk.net/](https://adoptopenjdk.net/).
