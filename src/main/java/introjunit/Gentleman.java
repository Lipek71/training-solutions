package introjunit;

public class Gentleman {
    public String sayHello(String name){
        String sayHello;
        if(name == null || name.isBlank()){
            sayHello = "Hello Anonymus!";
        }else{
            sayHello="Hello " + name;
        }
        return sayHello;
    }
}
