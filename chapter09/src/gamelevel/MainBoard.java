package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		// 추상클래스 및 템플릿 메서드 실습
		Player player = new Player();
		player.play(1);
		
		// 중급자 레벨 업 출력
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		// 고급자 레벨 업 출력
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
