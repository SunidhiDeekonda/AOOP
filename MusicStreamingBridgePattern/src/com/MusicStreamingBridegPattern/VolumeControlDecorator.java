package com.MusicStreamingBridegPattern;

public class VolumeControlDecorator extends MusicPlayerDecorator {

	public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer) {
		super(decoratedMusicPlayer);
		// TODO Auto-generated constructor stub
	}
	 @Override
	    public void play() {
	        super.play();
	        setVolume();
	    }

	    private void setVolume() {
	        System.out.println("Volume control settings applied.");
	    }
}
