package poo.basics;

import java.util.Map;

public class EnvironmentVariables {
    public static void main(String[] args) {

        //Iterate over map env
        Map<String,String> envVariables = System.getenv();

        for(Map.Entry<String,String> env : envVariables.entrySet()){
            System.out.println(env.getKey() + "<->" + env.getValue());
        }

        //Search specific env variable
        String processorArchitecture = System.getenv("PROCESSOR_ARCHITECTURE");
        System.out.println("Architecture of the processor: " + processorArchitecture);

        //Search added env variable
        String newEnv = System.getenv("TEST_ENV");
        System.out.println("New env variable added via cmd: " + newEnv);
    }
}
