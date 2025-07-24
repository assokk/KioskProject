package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu burger = new Menu("Burgers");
        burger.addItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burger.addItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burger.addItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burger.addItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drink = new Menu("Drinks");
        drink.addItem(new MenuItem("Cola", 1.5, "달콤한 검은 탄산음료"));
        drink.addItem(new MenuItem("Soda", 1.5, "레몬향 투명 탄산음료"));
        drink.addItem(new MenuItem("Fanta", 1.5, "과일맛 탄산음료"));

        Menu dessert = new Menu("Desserts");
        dessert.addItem(new MenuItem("French fries", 2.5, "바삭하게 튀긴 감자"));
        dessert.addItem(new MenuItem("Cheese stick", 2.5, "튀긴 모짜렐라 치즈"));
        dessert.addItem(new MenuItem("Coleslaw", 3.0, "양배추 콘샐러드"));


        List<Menu> menus = new ArrayList<>();
        menus.add(burger);
        menus.add(drink);
        menus.add(dessert);

        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();
    }
}
