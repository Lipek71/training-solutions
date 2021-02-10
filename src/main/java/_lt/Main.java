package _lt;

public class Main {
    public static void main(String[] args)  //INTERFACE MEGVALÓSÍTÁSA!
    {
        System.out.println(new UserSzuro()  //BELSŐ osztéllyal...
        {
            @Override
            public String usersz(User user) {
                return user.getName();        // VAGY
            }
        }.usersz(new User("Tomi")));

        System.out.println(((UserSzuro) user -> {  //LAMBDA-val...
            return user.getName();
        }).usersz(new User("Tomi")));

        System.out.println(((UserSzuro) User::getName).usersz(new User("Tomi")));  }
}