public class GamePlatform {
    public static double calculateFinalSpeed(double initialSpeed, int[] inclinations) {
        double realSpeed = 0;
        if (initialSpeed > 0){
            realSpeed = initialSpeed;
            for(int i : inclinations){
                if(realSpeed > Math.abs(i)){
                    realSpeed += i;
                }
            }
        }
        return realSpeed;
    }

    public static void main(String[] args){
        System.out.println(calculateFinalSpeed(60.0, new int[] { 0, 30, 0, -45, 0 }));
    }
}