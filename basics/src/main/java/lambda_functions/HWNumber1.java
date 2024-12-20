package lambda_functions;

import lambda_functions.math.FormatString;

import java.util.function.Function;

public class HWNumber1 {
    public static void main(String[] args) {
        FormatString formatString = (stringToFormat) -> {
            if(stringToFormat.isEmpty()){return "";}

            String newString = stringToFormat.trim();
            StringBuilder newStringToReturn = new StringBuilder();
            for(int i = 0; i < newString.length(); i++){
                if(newString.charAt(i) == ',' || newString.charAt(i) == '.'){
                    continue;
                }

                newStringToReturn.append(newString.charAt(i));
            }

            return newStringToReturn.toString().toUpperCase();
        };

        System.out.println(formatString.cleanStringUppercase(".,.,.HOLA    "));
    }
}
