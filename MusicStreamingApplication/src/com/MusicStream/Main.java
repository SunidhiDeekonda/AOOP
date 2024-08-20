package com.MusicStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSource localFile = new LocalFile("song.mp3");
        MusicSource onlineStream = new OnlineStream("http://example.com/stream");
        MusicSource radioStation = new RadioStation("Radio One");

        // Playing music from different sources
        localFile.play();
        onlineStream.play();
        radioStation.play();

        // Adding additional features using decorators
        MusicSource equalizedLocalFile = new EqualizerDecorator(localFile);
        MusicSource volumeControlledStream = new VolumeControlDecorator(onlineStream);

        equalizedLocalFile.play();
        volumeControlledStream.play();
	}

}
