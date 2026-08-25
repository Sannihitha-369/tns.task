class Breakfast {
    public static void main(String[] args) {

        int day = 4;

        display(day);
    }

    public static void display(int day) {

        switch (day) {
            case 1:
                System.out.println("Dosa");
                break;

            case 2:
                System.out.println("Idly");
                break;

            case 3:
                System.out.println("Bonda");
                break;

            case 4:
                System.out.println("Vada");
                break;

            case 5:
                System.out.println("Punugulu");
                break;

            default:
                System.out.println("Others");
        }
    }
}