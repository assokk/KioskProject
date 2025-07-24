package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    private List<Menu> menus = new ArrayList<>();

    public Kiosk (List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료 | 종료");

            System.out.print("무엇을 주문하시겠습니까? ");
            int menuChoice = sc.nextInt();

            if (menuChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if (menuChoice < 1 || menuChoice > menus.size()) {
                System.out.println("존재하지 않는 메뉴입니다. 다시 선택해주세요.");
                continue;
            }
            Menu selectedMenu = menus.get(menuChoice - 1);
            selectedMenu.printItems();


            System.out.print("원하는 메뉴를 선택하세요: ");
            int itemChoice = sc.nextInt();

            if (itemChoice == 0) {
                continue;
            }
            if (itemChoice < 1 || itemChoice > selectedMenu.getItems().size()) {
                System.out.println("존재하지 않는 메뉴입니다. 다시 선택해주세요.");
                continue;
            }
            MenuItem selectedMenuItem = selectedMenu.getItems().get(itemChoice - 1);
            selectedMenuItem.printDetails();
        }
    }
}
