package Music;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javazoom.jl.player.MP3Player;

public class music {

	ArrayList<musicVO> mv = new ArrayList<>();
	MP3Player mp3 = new MP3Player();
	
	
	// 리스트
	public music() {
		mv.add(new musicVO("고양이소리1",".\\bgm\\고양이소리1.mp3"));
		mv.add(new musicVO("고양이소리2",".\\bgm\\고양이소리2.mp3"));
		mv.add(new musicVO("고양이소리3",".\\bgm\\고양이소리3.mp3"));
		mv.add(new musicVO("밥",".\\bgm\\밥.mp3"));
		mv.add(new musicVO("사료밥",".\\bgm\\사료밥.mp3"));
		mv.add(new musicVO("잠",".\\bgm\\잠.mp3"));
		mv.add(new musicVO("강아지소리", ".\\bgm\\강아지-소리.mp3"));
		mv.add(new musicVO("엔딩", ".\\bgm\\등장음악.mp3"));
		mv.add(new musicVO("새소리1", ".\\bgm\\새소리1.mp3"));
		mv.add(new musicVO("새소리2", ".\\bgm\\새소리2.mp3"));
		mv.add(new musicVO("새소리3", ".\\bgm\\새소리3.mp3"));
		mv.add(new musicVO("새소리4", ".\\bgm\\새소리4.mp3"));
		mv.add(new musicVO("새소리5", ".\\bgm\\새소리5.mp3"));
		mv.add(new musicVO("보스", ".\\bgm\\보스 고양이 소리.mp3"));
		mv.add(new musicVO("참새", ".\\bgm\\참새.mp3"));
		mv.add(new musicVO("비둘기", ".\\bgm\\비둘기.mp3"));
		mv.add(new musicVO("목욕", ".\\bgm\\water bubble2.mp3"));
		
	}
	
	// 플레이
	public musicVO play1() {
		musicVO vo = mv.get(0);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(0).getMusicPath());
		
		return vo;
	}
	public musicVO play2() {
		musicVO vo = mv.get(1);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(1).getMusicPath());
		
		return vo;
	}
	public musicVO play3() {
		musicVO vo = mv.get(2);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(2).getMusicPath());
		
		return vo;
	}
	public musicVO eat() {
		musicVO vo = mv.get(3);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(3).getMusicPath());
		
		return vo;
	}
	public musicVO feedEat() {
		musicVO vo = mv.get(4);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(4).getMusicPath());
		
		return vo;
	}
	public musicVO catSleep() {
		musicVO vo = mv.get(5);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(5).getMusicPath());
		
		return vo;
	}
	public musicVO dog() {
		musicVO vo = mv.get(6);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(6).getMusicPath());
		
		return vo;
	}
	public musicVO endingSong() {
		musicVO vo = mv.get(7);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(7).getMusicPath());
		
		return vo;
	}
	public musicVO bird1() {
		musicVO vo = mv.get(8);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(8).getMusicPath());
		
		return vo;
	}
	public musicVO bird2() {
		musicVO vo = mv.get(9);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(9).getMusicPath());
		
		return vo;
	}
	public musicVO bird3() {
		musicVO vo = mv.get(10);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(10).getMusicPath());
		
		return vo;
	}
	public musicVO bird4() {
		musicVO vo = mv.get(11);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(11).getMusicPath());
		
		return vo;
	}
	public musicVO bird5() {
		musicVO vo = mv.get(12);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(12).getMusicPath());
		
		return vo;
	}
	public musicVO boss() {
		musicVO vo = mv.get(13);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(13).getMusicPath());
		
		return vo;
	}
	public musicVO chapbird() {
		musicVO vo = mv.get(14);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(14).getMusicPath());
		
		return vo;
	}
	public musicVO gugugu() {
		musicVO vo = mv.get(15);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(15).getMusicPath());
		
		return vo;
	}
	public musicVO bath() {
		musicVO vo = mv.get(16);

		if(mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(mv.get(16).getMusicPath());
		
		return vo;
	}
	// 정지
	public void stop() {
		
		if(mp3.isPlaying()) {
			mp3.stop();
		}
	}
		
}
