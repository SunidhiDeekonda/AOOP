package com.MusicStreamingBridegPattern;

public class EqualizerDecorator extends MusicPlayerDecorator{

	public EqualizerDecorator(MusicPlayer decoratedMusicPlayer) {
		super(decoratedMusicPlayer);
		// TODO Auto-generated constructor stub
	}
	public void play() {
        super.play();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Equalizer settings applied.");
    }
}
