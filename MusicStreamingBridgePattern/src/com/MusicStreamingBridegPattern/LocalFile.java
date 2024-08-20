package com.MusicStreamingBridegPattern;

public class LocalFile implements MusicSource{
	private String filePath;

    public LocalFile(String filePath) {
        this.filePath = filePath;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
        System.out.println("Playing music from local file: " + filePath);
	}

}
