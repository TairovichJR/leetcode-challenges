package easy;

import java.util.Comparator;
import java.util.List;

public class AmazonSortOrders {
    public static List<String> sortOrders(List<String> orderList){

        orderList.sort(new Comparator<String>() {
            @Override
            public int compare(String order1, String order2) {

                boolean isOrderOnePrime = isPrimeOrder(order1);
                boolean isOrderTwoPrime = isPrimeOrder(order2);

                String[] orderOneParts = order1.split(" ",2);
                String[] orderTwoParts = order2.split(" ",2);

                if (isOrderOnePrime && isOrderTwoPrime){
                    int compareMetaData = orderOneParts[1].compareTo(orderTwoParts[1]);
                    if (compareMetaData !=0 ){
                        return compareMetaData;
                    }else{
                        return orderOneParts[0].compareTo(orderTwoParts[0]);
                    }
                }

                if (isOrderOnePrime) {
                    return -1;
                }
                if (isOrderTwoPrime) {
                    return 1;
                }
                return 0;
            }
        });

        return orderList;

    }

    private static boolean isPrimeOrder(String order) {
        String[] orderParts = order.split(" ", 3);
        try {
            Integer.parseInt(orderParts[1]);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }

}
