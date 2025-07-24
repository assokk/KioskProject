# kioskProject

### 패스트푸드점의 주문을 처리하는 콘솔 기반 키오스크 프로그램입니다.
<br>

## 🗂️ 프로젝트 구성

### `Main` - 프로그램 실행의 시작점
- Menu, MenuItem 객체 생성
- 생성한 메뉴 리스트를 Kiosk에 전달


### `Kiosk` - 키오스크 시스템 제어
- 사용자 입력 처리 → 메뉴 선택 → 항목 선택 → 상세 정보 출력
- 반복문 + 조건문으로 흐름 제어
- Menu, MenuItem의 메서드 호출


### `Menu` - 메뉴 카테고리를 관리

- List<MenuItem>으로 항목 관리
- 항목 추가: addItem( )
- 항목 출력: printItems( )



### `MenuItem` - 개별 메뉴 항목 정보
- 이름, 가격, 설명 필드 보유
- 모든 필드 private → 데이터 캡슐화

<br>


## 💡 주요 기능

- 메뉴 카테고리 출력
- 카테고리 선택 시 하위 메뉴 항목 출력
- 메뉴 항목 선택 시 상세 정보 출력
- 번호 입력을 통한 선택
- 뒤로가기 및 프로그램 종료 기능

<br>

## 🔧 사용 기술

- Java 17
- IntelliJ IDEA
- Git, GitHub

<br>

## ▶️ 예시 출력
<pre>[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료      | 종료
1 <- // 1을 입력

[ BURGERS MENU ]
1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기
2 <- // 2를 입력
선택한 메뉴: SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거

[ MAIN MENU ]
1. Burgers
2. Drinks
3. Desserts
0. 종료      | 종료
0 <- // 0을 입력
프로그램을 종료합니다.</pre>