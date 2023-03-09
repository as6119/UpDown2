package Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TarotCard {

    private static List<String> TAROT_CARDS = new ArrayList<>(Arrays.asList(
    		"광대 - 정위치 모험, 무지 /역위치 경솔, 어리석음", "마술사 - 정위치 창조, 수완/ 역위치 겁많음, 기만",
			"여법황 - 정위치 지식, 총명 / 역위치 잔혹, 무례함", "여황제 - 정위치 풍양, 모성 / 역위치 과잉, 허영", "황제 - 책임, 부성  / 역위치 오만, 존대",
			"법황 - 정위치 가르침, 관대함/역위치 협량, 나태", "연인 - 정위치 연애, 쾌락/역위치 질투, 배신, 실연", "전차 - 정위치 전진, 승리/역위치 폭주, 좌절, 패배",
			"힘 - 정위치 힘, 용기/역위치 본성, 자만", "은자 - 정위치 탐색, 사려깊음/역위치 음습, 폐쇄적, 탐욕", "운명 - 정위치 기회, 일시적인 행운/역위치 오산, 불운",
			"정의 - 정위치 균형, 정당함 /역위치 불균형, 편견, 부정", "고행자 - 정위치 자기희생, 인내 / 역위치 무의미한 희생, 맹목",
			"죽음 - 정위치 격변, 이별 / 역위치 변화의 유보, 고착", "절제 - 정위치 조화, 견실 /역위치 낭비, 불안정",
			"악마 - 정위치 사심, 속박, 타락/역위치 악순환으로부터의 각성", "탑 - 정위치 파괴, 파멸 / 역위치 필요로 하는 파괴 ",
			"별 - 정위치 희망, 동경 / 역위치 환멸, 비애 ", "달 - 정위치 불안, 애매함, 혼돈 /역위치 불안 해소, 명료함, 혼돈의 끝",
			"태양 - 정위치 밝은 미래, 만족 /역위치 연기(延期), 실패 ", "심판 - 정위치 부활, 개선 /역위치 재기불능, 후회 ",
			"세계- 정위치 완성, 완전 / 역위치 미완성, 어중간함"
    ));

    public static void main(String[] args) {
        List<String> randomCards = new ArrayList<>(3);
        List<String> cards = new ArrayList<>(TAROT_CARDS);
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int randomIndex = rand.nextInt(cards.size());
            String card = cards.get(randomIndex);
            randomCards.add(card + (rand.nextBoolean() ? " (Reversed)" : ""));
            cards.remove(randomIndex);
        }
        System.out.println("Random Tarot Cards: " + randomCards);
    }
}
