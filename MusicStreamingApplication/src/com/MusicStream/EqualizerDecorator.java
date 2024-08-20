package com.MusicStream;

public class EqualizerDecorator extends MusicSourceDecorator {

	public EqualizerDecorator(MusicSource decoratedMusicSource) {
		super(decoratedMusicSource);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void play() {
        super.play();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Applying equalizer settings.");
    }

}
