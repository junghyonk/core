package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인")
    void vip_ok (){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when
        int discount = rateDiscountPolicy.discount(member, 10000);
        //then
        Assertions.assertThat(discount).isEqualTo(2000);
    }
}