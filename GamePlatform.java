public class GamePlatform {
    public static double calculateFinalSpeed(double initialSpeed, int[] inclinations) {
        double finalSpeed = initialSpeed;

        for (int inclination : inclinations) {
           if(inclination != 0){
                    if(inclination > 0){
                        finalSpeed -= inclination;
                    } else {
                        finalSpeed += Math.abs(inclination);
                    }                    
           }
        }
        return finalSpeed < 0 ? 0 : finalSpeed;
    }

    public static void main(String[] args){
        System.out.println(calculateFinalSpeed(60.0, new int[] { 0, 30, 0, -45, 0 }));
    }
}