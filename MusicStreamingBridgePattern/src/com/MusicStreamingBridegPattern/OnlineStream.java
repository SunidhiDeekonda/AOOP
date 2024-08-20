package com.MusicStreamingBridegPattern;

public class OnlineStream implements MusicSource{
	private String url;

    public OnlineStream(String url) {
        this.url = url;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Streaming music from URL: " + url);
	}

}
