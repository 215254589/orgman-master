package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass),
               letters = "";
        int length = className.length();

        for(int cnt = 0; cnt < length; cnt++){

            if(Character.isUpperCase(className.charAt(cnt)))
            {
                char uppercase = className.charAt(cnt);
                letters =+ uppercase;
            }
        }
        return letters;
    }
}
