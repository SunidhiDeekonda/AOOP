package com.MusicStream;

public class VolumeControlDecorator extends MusicSourceDecorator {

	public VolumeControlDecorator(MusicSource decoratedMusicSource) {
		super(decoratedMusicSource);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void play() {
        super.play();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Setting volume level.");
    }
}

