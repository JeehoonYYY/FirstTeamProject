package homework;

import java.util.Scanner;

// 인터페이스
interface Playable{
	public void play();
	public void volumeUp();
	public void nextTrack();
	public void pause();
	public void volumeDown();
	public void prevTrack();
	public void stop();
	
}

enum MediaType {
	MUSIC, VIDEO, PHOTO
}

class MediaPlayer implements Playable {
	// 멤버변수
	private MediaType mediaType;	// 미디어 타입 (음악, 동영상, 사진)
	// 나머지 매개변수
	private int volume, currentTrack;
	private boolean isPlaying;
	
	// 생성자
	public MediaPlayer(MediaType mediaType) {
		this.mediaType = mediaType;
		// 나머지 초기화 volume, isPlaying, CurrnetTrack
		this.volume = 50;
		this.isPlaying = false;
		this.currentTrack = 1;
	}

	// 추상메서드 구현
	
	public void play() {
		if(isPlaying == false) {
			System.out.println("미디어를 재생합니다.");
			setPlaying(true);
		}
	}
	public void stop() {
		if(isPlaying == true) {
			System.out.println("미디어를 중지합니다.");
			setPlaying(false);
		}
	}
	public void pause() {
		if(isPlaying == true) {
			System.out.println("미디어를 일시 정지합니다.");
			setPlaying(false);
		}
	}
	public void volumeUp() {
		if(getVolume() <= 100) {
			System.out.println("볼륨을 올립니다.");
			volume++;
			setVolume(volume);
		}
	}
	public void volumeDown() {
		if(getVolume() >= 0) {
			System.out.println("볼륨을 내립니다.");
			volume--;
			setVolume(volume);
		}
	}
	public void nextTrack() {
		if(getCurrentTrack() > 0) {
			System.out.println("다음 트랙을 재생합니다.");
			currentTrack++;
			setCurrentTrack(currentTrack);
		}
	}
	public void prevTrack() {
		if(getCurrentTrack() < 10) {
			System.out.println("다음 트랙을 재생합니다.");
			currentTrack--;
			setCurrentTrack(currentTrack);
		}
	}

	
	
	// 겟터, 셋터 생성
	
	public MediaType getMediaType() {
		return mediaType;
	}

	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCurrentTrack() {
		return currentTrack;
	}

	public void setCurrentTrack(int currentTrack) {
		this.currentTrack = currentTrack;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	
	

}



public class MediaPlayerTest {

	public static void main(String[] args) {
		// 미디어 플레이어 테스트
		MediaPlayer player = new MediaPlayer(MediaType.MUSIC);
		
//		player.play();
//		player.volumeUp();
//		player.nextTrack();
//		player.pause();
//		player.volumeDown();
//		player.prevTrack();
//		player.stop();
		
		
		
		int input = 0;
		
		
		Scanner in = new Scanner(System.in);
		while(input != 8) {
			
			System.out.println();
			System.out.println("현재 미디어 타입: " + player.getMediaType());
			System.out.println("현재 볼륨: " + player.getVolume());
			System.out.println("현재 재생 중인지 여부: " + player.isPlaying());
			System.out.println("현재 재생 중인 트랙: " + player.getCurrentTrack());
			System.out.println();
			
			
			System.out.println("재생 : 1, 정지   : 2, 일시정지: 3");
			System.out.println("볼륨업: 4, 볼륨다운: 5, ");
			System.out.println("다음트랙: 6, 이전트랙: 7, 나가기: 8");
			System.out.print("숫자를 입력하세요: ");
			input = in.nextInt();
			while(!in.hasNextInt()) {
				System.out.println("재생 : 1, 정지   : 2, 일시정지: 3");
				System.out.println("볼륨업: 4, 볼륨다운: 5, ");
				System.out.println("다음트랙: 6, 이전트랙: 7, 나가기: 8");
				System.out.print("숫자를 입력하세요: ");
				in.next();
			}
			switch(input) {
			case 1:
				player.play();
				break;
			case 2:
				player.stop();
				break;
			case 3:
				player.pause();
				break;
			case 4:
				player.volumeUp();
				break;
			case 5:
				player.volumeDown();
				break;
			case 6:
				player.nextTrack();
				break;
			case 7:
				player.prevTrack();
				break;
			}

		}
		in.close();
		
	}

}
