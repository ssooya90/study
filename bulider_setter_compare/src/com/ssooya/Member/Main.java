package com.ssooya.Member;

public class Main {

    public static void main(String[] args) {

        System.out.println("ASDF");

        Member memberS = new Member("이름", "이름", "이름", "이름", "키", "id");

        Member memberJ = new Member("이름","10");

        Member memberB = new Member.Builder("최희수","id-123")
                .addr("주소")
                .age("15")
                .height("173")
                .weight("70").build();


//        memberB = new Member.Builder(memberB).age("20").build();



        System.out.println("TEST");


    }
}
