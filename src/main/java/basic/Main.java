package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        while (true) {
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
