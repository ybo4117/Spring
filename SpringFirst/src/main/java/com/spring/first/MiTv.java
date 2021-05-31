package com.spring.first;



public class MiTv {
	private Speaker speaker;
	
	public MiTv() {
		System.out.println("MiTv의 기본 생성자");
	}
	
	public MiTv(int aa) {
		System.out.println("MiTv의 aa 생성자");
	}
	
	public MiTv(Speaker speaker) {
		System.out.println("MiTv의 speaker 생성자");
		this.speaker = speaker;
	}
	
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void volumeUp() {
		speaker.volumeUp();
	}
}
