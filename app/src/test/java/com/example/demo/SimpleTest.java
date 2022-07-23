package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SimpleTest {
    public static Predicate<String> fStringIsEmpty = input ->  input == null || "".equals(input);
    public static boolean hasBlank(List<String> list, Predicate<String> pp){
        for(String s: list){
            if(pp.test(s))
                return true;
            System.out.println(s);
        }
        return false;
    }
    @Test
    public void testPredicate(){
        List<String> list = Arrays.asList("1","2","",null);
        System.out.println(hasBlank(list, (xt) -> xt == null || "".equals(xt)));
    }

    @Test
    public void password(){
        PasswordEncoder pwdEncoder = new BCryptPasswordEncoder();
        String encodedPwd = pwdEncoder.encode("nuo1");
        System.out.println(encodedPwd);
    }

    @Test
    public void test1(){
        GreetingService gs2 = abc -> abc += "+";
        System.out.println(gs2.sayMessage(gs2.sayMessage("init")));
    }

    @Test
    public void testConsumer(){
        Consumer<String> cs =  nm -> System.out.println("1:" + nm);
        Consumer<String> cs2 =  nm -> System.out.println("2:" + nm);
        // cs.accept("1");
        cs.andThen(cs2);
    }


    @Test
    public void testFunction(){
        Function<String,String> f1 = input1 -> input1 + "+";
        System.out.println(f1.apply("this"));
    }


    @Test
    public void testList(){
        furniture.list.LinkedList l = new furniture.list.LinkedList();
        l.add("1");
        System.out.println(l);
    }
}


@FunctionalInterface
interface GreetingService 
{
    String sayMessage(String message);
}