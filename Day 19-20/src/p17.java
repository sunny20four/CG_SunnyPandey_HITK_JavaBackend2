class User {

    String name;
    int age;
    String email;


    private User(Builder b) {

        name=b.name;
        age=b.age;
        email=b.email;
    }


    public String toString() {

        return name+" "+age+" "+email;
    }


    static class Builder {

        String name;
        int age;
        String email;


        Builder setName(String name) {

            this.name=name;
            return this;
        }


        Builder setAge(int age) {

            this.age=age;
            return this;
        }


        Builder setEmail(String email) {

            this.email=email;
            return this;
        }


        User build() {

            return new User(this);
        }
    }
}



public class p17 {

    public static void main(String[] args) {


        User u =
                new User.Builder()

                        .setName("Rahul")

                        .setAge(20)

                        .setEmail("rahul@gmail.com")

                        .build();


        System.out.println(u);
    }
}