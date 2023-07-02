package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    public static Bean bean;

    private static Logger LOG = LoggerFactory
            .getLogger(Main.class);

    public Main() {
        System.out.println("Main constructor");
        System.out.println(bean);
        System.out.println(LOG);
    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        System.out.println(bean);
//        //if(!bean.equals(null))System.out.println(bean.asyncMethodWithVoidReturnType());
//        //::asyncMethodWithVoidReturnType();

        SpringApplication.run(Main.class, args);
        LOG.error("kokoti");
        LOG.info("kokoti");
        LOG.trace("kokoti");

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Main run");
        System.out.println(bean);
        System.out.println(LOG);
        //if(!bean.equals(null))System.out.println(bean.asyncMethodWithVoidReturnType());
        //::asyncMethodWithVoidReturnType();
    }


//    @SpringBootApplication
//    public class SpringBootConsoleApplication
//            implements CommandLineRunner {
//
//        private static Logger LOG = LoggerFactory
//                .getLogger(SpringBootConsoleApplication.class);
//
//        public static void main(String[] args) {
//            LOG.info("STARTING THE APPLICATION");
//            SpringApplication.run(SpringBootConsoleApplication.class, args);
//            LOG.info("APPLICATION FINISHED");
//        }
//
//        @Override
//        public void run(String... args) {
//            LOG.info("EXECUTING : command line runner");
//
//            for (int i = 0; i < args.length; ++i) {
//                LOG.info("args[{}]: {}", i, args[i]);
//            }
//        }
//    }

}