package com.ssooya;

import com.ssooya.car.Car;
import com.ssooya.member.Member;

public class Main {

    public static void main(String[] args) {

        System.out.println("ASDF");


        // CASE 1
        Member memberS = new Member("이름", "이름", "이름", "이름", "키", "id");

        // CASE 2-1
        Car car = new Car();
        car.setBrand("KIA");
        car.setName("K7");
        car.setType("auto");

        // CASE 2-2 (자바빈 패턴은 이렇게 사용하지 않음)
        Member memberJ = new Member("ssooya90");
        memberJ.setName("최희수");
        memberJ.setAddr("주소");



        // CASE 3
        Member memberB = new Member.Builder("최희수","id-123")
                .addr("주소")
                .age("15")
                .height("173")
                .weight("70").build();


//        memberB = new member.Builder(memberB).age("20").build();



        System.out.println("TEST");


    }
}
