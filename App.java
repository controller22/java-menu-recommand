import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("오늘 뭐 먹지?");

        Menu menu =new MenuImpl();
        //menu.printMenu();
        ArrayList<String> items=menu.printMenu();
        int sc=menu.inputNum();
        menu.enterMenu(sc, items);
        //menu.aiPrintMenu(items);


        // // 메뉴 작성
        // String[] items={"돈까스","국밥","칼국수","치킨","김밥","아무거나"};
        // // 메뉴 출력
        // for (int i = 0; i < items.length; i++) {
        //     System.out.println((i+1)+". "+items[i]);
        // }
        // // System.out.println("1. "+items[0]);
        // // System.out.println("2. "+items[1]);
        // // System.out.println("3. "+items[2]);
        // // System.out.println("4. "+items[3]);
        // // System.out.println("5. "+items[4]);
        // // System.out.println("6. 아무거나");
        
        
        // // 사용자 입력받음
        // System.out.print("입력하세요: ");
        // Scanner scanner = new Scanner(System.in);
        // int sc = scanner.nextInt();

        // // 만약 1번을 누르면 선택된 메뉴 선택
        // if (sc==1) {
        //     System.out.println("1. 돈까스를 선택 했습니다");
        //     System.out.println("맛있게 드세요");
        // }
        // // 만약 2번을 누르면 선택된 메뉴 선택
        // else if (sc==2) {
        //     System.out.println("2. 국밥을 선택 했습니다");
        //     System.out.println("맛있게 드세요");
        // }
        // else if (sc==3) {
        //     System.out.println("3. 칼국수 선택 했습니다");
        //     System.out.println("맛있게 드세요");
        // }
        // else if (sc==4) {
        //     System.out.println("4. 치킨을 선택 했습니다");
        //     System.out.println("맛있게 드세요");
        // }
        // else if (sc==5) {
        //     System.out.println("5. 김밥을 선택 했습니다");
        //     System.out.println("맛있게 드세요");
        // }
        // // 아무거나 선택 기능(AI)
        // // 만약 6번을 누르면 AI가 추천해주는 메뉴를 출력
        // if (sc==6) {
        //     Random random = new Random();
        //     int rNum = random.nextInt(items.length);
        //     System.out.println("엄처난 빅데이터로 분석하고 머신러닝으로 학습된 데이터의 결과로");
        //     System.out.println("추천된 메뉴 "+ items[rNum] +"입니다.");
        //     System.out.println("맛있게 드세요");
        // }        
    }
}
