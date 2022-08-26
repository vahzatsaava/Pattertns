package Pattertns.behavior.iterator;

public interface ChannelCollections {

    void addChannel(Channel channel);

    void removeChanel(Channel channel);

    ChannelIterator iterator(ChannelTypeEnum type);
}
