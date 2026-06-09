public class MegaStore {

    public enum DiscountType {
        Standard,
        Seasonal,
        Weight;
    }
    
    public static double getDiscountedPrice(double cartWeight,
                                            double totalPrice,
                                            DiscountType discountType) {
        
        switch (discountType) {
            case Standard:
                return totalPrice * 0.94 ; // 6% de réduction
            case Seasonal:
                return totalPrice * 0.88 ; // 12% de réduction
        
            case Weight:
                if(cartWeight <= 10){
                    return totalPrice * 0.94 ; // 6% de réduction
                }else{
                    return totalPrice * 0.82 ; // 18% de réduction
                }
            default:
                break;
        }
    }
    
    public static void main(String[] args) {        
        System.out.println(getDiscountedPrice(12, 100, DiscountType.Weight));
    }
}