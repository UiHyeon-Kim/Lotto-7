package lotto.model

/**
 * 모델은 컨트롤러나 뷰에 의존하면 안된다.
 * 컨트롤러나 뷰의 코드가 있으면 안된다
 */

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] 로또 번호는 6개여야 합니다." }
        require(numbers.all { it in 1..45 }) { "[ERROR] 로또 번호는 1에서 45 이내여야 합니다." }
    }

    // TODO: 추가 기능 구현
    // 여기선 뭘 해야하지????
    // 위 초기화를 보면 내가 입력한 당첨 번호에 대한 예외 처리
    // LottoTest를 보면 중복된 값에 대한 예외 처리해야 하고
    // 로또 번호 생성기도 중복될 수 있나? -> 그건 상관 없나 -> 상관 없지 중복 n등이니까

    // 그럼 여기서 로또 번호를 생성할까?
    // 아니면 예외 처리하는 함수인가

    /**
     * 모델이 수행할 기능 목록
     * 로또 번호 생성
     * 로또 번호와 당첨 번호 비교
     * enum 클래스와 비교해서 일치한 정보 전달
     * 총 수익률 계산
     */
}
