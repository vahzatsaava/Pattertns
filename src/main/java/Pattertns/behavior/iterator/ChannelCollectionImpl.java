package Pattertns.behavior.iterator;

import java.util.List;

public class ChannelCollectionImpl implements ChannelCollections{
    private List chanelList;

    public ChannelCollectionImpl(List chanelList) {
        this.chanelList = chanelList;
    }

    @Override
    public void addChannel(Channel channel) {
        chanelList.add(channel);
    }

    @Override
    public void removeChanel(Channel channel) {
        chanelList.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type,chanelList);
    }

    private class ChannelIteratorImpl implements ChannelIterator{
        private ChannelTypeEnum type;
        private List chanels;
        private  int position;

        public ChannelIteratorImpl(ChannelTypeEnum type, List chanels) {
            this.type = type;
            this.chanels = chanels;
        }


        @Override
        public boolean hasNext() {
            while (position < chanels.size()){
                Channel c = (Channel) chanels.get(position);
                if (c.getType().equals(type) || type.equals(ChannelTypeEnum.ALL)){
                    return true;
                }else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = (Channel) chanels.get(position);
            position++;
            return c;
        }
    }
}
