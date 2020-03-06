public class exercise {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        //XX km/h = yy mi/h
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);

            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
        }
    }

    public static void main(String[] args) {
        long miles = exercise.toMilesPerHour(5);
        System.out.println(miles);
    }
}


