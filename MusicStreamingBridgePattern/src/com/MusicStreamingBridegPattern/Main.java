package com.MusicStreamingBridegPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSource localFile = new LocalFile("song.mp3");
        MusicSource onlineStream = new OnlineStream("http://example.com/stream");
        MusicSource radioStation = new RadioStation("Radio One");

        // Using Bridge Pattern to decouple music source from player
        MusicPlayer basicPlayer = new BasicMusicPlayer(localFile);
        basicPlayer.play();

        // Adding additional features using Decorator Pattern
        MusicPlayer equalizedPlayer = new EqualizerDecorator(basicPlayer);
        equalizedPlayer.play();

        MusicPlayer volumeControlledPlayer = new VolumeControlDecorator(equalizedPlayer);
        volumeControlledPlayer.play();

        // Playing music from different sources
        MusicPlayer onlinePlayer = new BasicMusicPlayer(onlineStream);
        onlinePlayer.play();

        MusicPlayer radioPlayer = new BasicMusicPlayer(radioStation);
        radioPlayer.play();
	}

}
