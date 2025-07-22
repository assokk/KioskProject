package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    private List<MenuItem> menuItems = new ArrayList<>();

    public Kiosk (List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i).getName() + " | " + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getDescription());
            }
            System.out.println("0. 종료 | 종료");

            System.out.print("주문 메뉴를 선택하세요: ");
            int burgerNumber = sc.nextInt();

            if (burgerNumber == 0) {
                System.out.println("메뉴 선택을 종료합니다.");
                break;
            }

            if (burgerNumber < 1 || burgerNumber > menuItems.size()) {
                System.out.println("존재하지 않는 메뉴입니다. 다시 선택해주세요.");
                continue;
            }

            MenuItem selectedItem = menuItems.get(burgerNumber - 1);
            System.out.print("선택한 메뉴: ");
            System.out.println(selectedItem.getName() + " | " + selectedItem.getPrice() + " | " + selectedItem.getDescription());
        }
    }
}
