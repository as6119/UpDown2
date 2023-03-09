package Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TarotCard {

    private static List<String> TAROT_CARDS = new ArrayList<>(Arrays.asList(
    		"���� - ����ġ ����, ���� /����ġ ���, �����", "������ - ����ġ â��, ����/ ����ġ �̸���, �⸸",
			"����Ȳ - ����ġ ����, �Ѹ� / ����ġ ��Ȥ, ������", "��Ȳ�� - ����ġ ǳ��, �� / ����ġ ����, �㿵", "Ȳ�� - å��, �μ�  / ����ġ ����, ����",
			"��Ȳ - ����ġ ����ħ, ������/����ġ ����, ����", "���� - ����ġ ����, ���/����ġ ����, ���, �ǿ�", "���� - ����ġ ����, �¸�/����ġ ����, ����, �й�",
			"�� - ����ġ ��, ���/����ġ ����, �ڸ�", "���� - ����ġ Ž��, �������/����ġ ����, �����, Ž��", "��� - ����ġ ��ȸ, �Ͻ����� ���/����ġ ����, �ҿ�",
			"���� - ����ġ ����, ������ /����ġ �ұ���, ���, ����", "������ - ����ġ �ڱ����, �γ� / ����ġ ���ǹ��� ���, �͸�",
			"���� - ����ġ �ݺ�, �̺� / ����ġ ��ȭ�� ����, ����", "���� - ����ġ ��ȭ, �߽� /����ġ ����, �Ҿ���",
			"�Ǹ� - ����ġ ���, �ӹ�, Ÿ��/����ġ �Ǽ�ȯ���κ����� ����", "ž - ����ġ �ı�, �ĸ� / ����ġ �ʿ�� �ϴ� �ı� ",
			"�� - ����ġ ���, ���� / ����ġ ȯ��, ��� ", "�� - ����ġ �Ҿ�, �ָ���, ȥ�� /����ġ �Ҿ� �ؼ�, �����, ȥ���� ��",
			"�¾� - ����ġ ���� �̷�, ���� /����ġ ����(��Ѣ), ���� ", "���� - ����ġ ��Ȱ, ���� /����ġ ���Ҵ�, ��ȸ ",
			"����- ����ġ �ϼ�, ���� / ����ġ �̿ϼ�, ���߰���"
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
