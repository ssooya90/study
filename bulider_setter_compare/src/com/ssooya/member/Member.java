package com.ssooya.member;


public class Member {

    private String name; // 필수
    private String addr;
    private String age;
    private String weight;
    private String height;
    private final String id; // 필수인자

    // 추가 파라미터
    private String hp;





    public Member(String id){
        this.id = id;
    }

    public Member(String addr, String age, String id){
        this.addr = addr;
        this.age = age;
        this.id = id;
    }

    public Member(String name, String addr, String age, String weight, String height, String id) {
        this.name = name;
        this.addr = name;
        this.age = name;
        this.weight = name;
        this.height = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }



    /// 빌더패턴
    Member(Builder builder){
       this.name = builder.name;
       this.addr = builder.addr;
       this.age = builder.age;
       this.weight = builder.weight;
       this.height = builder.height;
       this.id = builder.id;
   }




    public static class Builder {
        private String name;
        private String addr;
        private String age;
        private String weight;
        private String height;
        private final String id;


        // 필수적인 필드 :
        public Builder(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public Builder addr(String addr) {
            this.addr = addr;
            return this;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Builder weight(String weight) {
            this.weight = weight;
            return this;
        }

        public Builder height(String height) {
            this.height = height;
            return this;
        }

        public Member build() { return new Member(this); }





    }

}
