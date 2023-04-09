package hello.core.discount;


import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     *
     * @param price
     * @return
     */
    int discount(Member member, int price);


}
