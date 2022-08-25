package Pattertns.behavior.iterator;

import java.util.ArrayList;

public class IteratorTest {
    public static void main(String[] args) {
        ChannelCollections channels = new ChannelCollectionImpl(new ArrayList());
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));


        ChannelIterator base = channels.iterator(ChannelTypeEnum.ALL);
        while (base.hasNext()){
            Channel c = base.next();
            System.out.println(c.toString());
        }
        System.out.println("***********");

        ChannelIterator english = channels.iterator(ChannelTypeEnum.ENGLISH);
        while (base.hasNext()){
            Channel c = english.next();
            System.out.println(c.toString());
        }
    }
}
