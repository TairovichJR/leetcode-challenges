package easy;

/**
 * Created by tairovich_jr on 2021-06-21.
 */
public class DefangingIPAddress {

    public String defangIPaddr(String address) {

        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        System.out.println(new DefangingIPAddress().defangIPaddr("1.1.1.1"));
    }
}
