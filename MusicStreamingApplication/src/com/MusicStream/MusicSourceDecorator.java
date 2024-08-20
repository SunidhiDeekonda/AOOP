package com.MusicStream;

public class MusicSourceDecorator implements MusicSource {
	 protected MusicSource decoratedMusicSource;

	    public MusicSourceDecorator(MusicSource decoratedMusicSource) {
	        this.decoratedMusicSource = decoratedMusicSource;
	    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
        decoratedMusicSource.play();
	}

}
