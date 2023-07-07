import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MenuImpl implements Menu {

    // @Override
    // public void aiPrintMenu(String[] items) {
    //     Random random = new Random();
    //     int rNum = random.nextInt(items.length);
    //     System.out.println("엄처난 빅데이터로 분석하고 머신러닝으로 학습된 데이터의 결과로");
    //     System.out.println("추천된 메뉴 " + items[rNum] + "입니다.");
    //     System.out.println("맛있게 드세요");
    // }

    // @Override
    // public void enterMenu(int sc, String[] items) {
    //     if (sc == 1) {
    //         System.out.println("1. " + items[0] + "를 선택 했습니다");
    //         System.out.println("맛있게 드세요");
    //     }
    //     if (sc == 6) {
    //         aiPrintMenu(items);
    //     }
    // }

    @Override
    public int inputNum() {
        System.out.print("입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        return sc;
    }

    @Override
    public ArrayList<String> printMenu() {
        // String[] items={"돈까스","국밥","칼국수","치킨","김밥","아무거나"};
        ArrayList<String> items = new ArrayList();
        items.add("돈까스");
        items.add("국밥");
        items.add("칼국수");
        items.add("치킨");
        items.add("김밥");
        
        // 메뉴 출력
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
         System.out.println("6. 아무거나");
        return items;
        // System.out.println("1. "+items[0]);
        // System.out.println("2. "+items[1]);
        // System.out.println("3. "+items[2]);
        // System.out.println("4. "+items[3]);
        // System.out.println("5. "+items[4]);
       

    }

    @Override
    public void aiPrintMenu(ArrayList<String> items) {
        Random random = new Random();
        int rNum = random.nextInt(items.size());
        System.out.println("엄처난 빅데이터로 분석하고 머신러닝으로 학습된 데이터의 결과로");
        System.out.println("추천된 메뉴 " + items.get(rNum) + "입니다.");
        System.out.println("맛있게 드세요");

    }

    @Override
    public void enterMenu(int sc, ArrayList<String> items) {
        if (sc == 1) {
            System.out.println("1. " + items.get(sc) + "를 선택 했습니다");
            System.out.println("맛있게 드세요");
        }
        else if (sc == 6) {
            aiPrintMenu(items);
        }

    }
}
