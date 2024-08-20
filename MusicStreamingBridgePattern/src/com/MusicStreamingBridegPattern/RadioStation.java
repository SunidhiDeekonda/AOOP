package com.MusicStreamingBridegPattern;

public class RadioStation implements MusicSource{
	 private String station;

	    public RadioStation(String station) {
	        this.station = station;
	    }

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing radio station: " + station);	
	}

}
