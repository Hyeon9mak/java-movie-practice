# 영화 예매 서비스 연습
> 본 프로젝트는 [JunHoPark93님이 정리하신 우아한 형제들의 프리코스, 오프라인 테스트인 영화 예매 서비스](https://github.com/JunHoPark93/woowacourse-projects) 입니다. 

> 시작: 2020-12-18 12:15  
> 종료: 2020-12-18 00:00  
> 소요시간 : 시간 분  

### 1. 영화 기본 정보로 아래의 항목이 주어진다. 
* 영화 아이디
* 영화 제목
* 요금
* 상영 시작 시간
* 상영 시간별 예매 가능 인원

### 2. 영화는 한번에 여러 영화를 예매할 수 있어야 한다.
* 단, 일행이 각자의 취향에 따라 다른 영화를 예매한다고 가정한다.
* 따라서 여러 영화를 예매할 경우 각 영화의 시작 시간 차이가 1시간 이상 차이가 날 수 없다.

### 3. 예매가 가능한 상태이면 결제를 진행한다.

### 4. 예매가 불가능한 경우 그 이유를 보여주고, 다시 예매할 수 있도록 해야 한다.
* 상영 시작 시간이 이미 지난 영화를 선택하는 경우
* 예매 가능 인원을 초과하는 경우
* 두 영화의 시간 차이가 1시간 이내가 아닌 경우
* 상영목록에 없는 영화를 선택한 경우

### 5. 결제 유형에 따라 할인율이 달라지고, 포인트를 사용할 수 있다.
* 결제할 때 적립되어 있는 포인트를 사용할 수 있다.
* 신용카드는 5%, 현금 결제는 2% 할인된다. 할인은 포인트를 제외한 금액에 적용한다.

### 6. 최종 예매 금액을 보여준다.