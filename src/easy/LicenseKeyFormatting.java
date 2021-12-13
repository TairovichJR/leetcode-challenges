package easy;

/**
 * Created by tairovich_jr on 2021-12-12.
 */
public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {


        String str = s.replaceAll("-", "");
        String result = "";
        for (int i = str.length()-1, j = 0; i >= 0 ; i--, j++) {

            if (j == k){
                result += "-";
                j = 0;
            }
            result += str.charAt(i);
        }
        String reversed = "";
        for (int i = result.length()-1; i >= 0; i--) {
            reversed += result.charAt(i);
        }

        return reversed.toUpperCase();
    }

    public static void main(String[] args) {


        System.out.println(
                new LicenseKeyFormatting().licenseKeyFormatting("2-5g-3-J",2)
        );
    }
}
