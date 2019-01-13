package com.netcracker;

import com.netcracker.It.Computer;
import com.netcracker.It.ComputerShop;
import com.netcracker.It.Mac;
import com.netcracker.zoo.Wolf;
import com.netcracker.zoo.Zoo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static void part_one_DI(ApplicationContext context){
        System.out.println("----------------Setter injection---------------");
        Computer pc1 = (Computer) context.getBean("pc1");
        System.out.println(pc1.toString());
        pc1.getProcessor().start();
        Computer pc2 = (Computer) context.getBean("pc2");
        System.out.println(pc2.toString());
        pc2.getProcessor().start();

        System.out.println("----------------Constructor injection---------------");
        Computer pow_pc = (Computer) context.getBean("pow_pc");
        System.out.println(pow_pc.toString());

        System.out.println("----------------Beans inheritance---------------");
        Mac mac = (Mac) context.getBean("mac");
        System.out.println(mac.toString());
    }
    private static void part_two_DI( ApplicationContext context){
        System.out.println("---------------- Setter injection(collections) --------------------");
        Zoo myZoo = (Zoo)context.getBean("ZOO_San_Diego");
        System.out.println(myZoo);

        System.out.println("---------------- Constructor injection(collection) -----------------");
        Zoo centralZoo = (Zoo)context.getBean("Central_Zoo");
        System.out.println(centralZoo);

        System.out.println("------------------ DI by means SpEL -----------------------");
        Computer def = (Computer)context.getBean("default");
        System.out.println(def.getProcessor() + "  " + def.getYear());

        System.out.println("----------------- Auto - Wiring --------------------");
        Computer autowir = (Computer)context.getBean("autow1");
        System.out.println(autowir.toString());
        Computer autowir1 = (Computer)context.getBean("autow2");
        System.out.println(autowir1.toString());

        System.out.println("----------------- Factory - Method -----------------");
        Wolf wolf = (Wolf) context.getBean("factorWolf");
        System.out.println(wolf.toString());

        System.out.println("---------------- LookUp - Method -----------------");
        ComputerShop computerShop = (ComputerShop) context.getBean("shop");
        Computer pc = computerShop.getComputer();
        System.out.println("Computer delivered: ");
        System.out.println(pc);
    }

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        part_one_DI(context);
        part_two_DI(context);

        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}
