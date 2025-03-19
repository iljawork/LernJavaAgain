package main;

public class TrucksAndContainers {
    public static final int MAX_CONTAINERS_IN_TRUCK = 12;
    public static final int MAX_BOXES_IN_CONTAINER = 27;
    private static int containers = 0;
    private static int trucks = 0;
    private static int boxes;

    public TrucksAndContainers(int boxes) {
        this.boxes = boxes;
    }

    public static void getCalculation() {
        System.out.println("Введите количество коробок: ");
        if (boxes == 0) {
            System.out.println("Введите корректное количество коробок");
        } else if (boxes >= MAX_BOXES_IN_CONTAINER) {
            containers++;
            trucks++;
            System.out.println("Грузовик: " + trucks + System.lineSeparator() +
                    "\tКонтейнер: " + containers);
        } else if (boxes < MAX_BOXES_IN_CONTAINER) {
            containers++;
            trucks++;
            System.out.println("Грузовик: " + trucks + System.lineSeparator() +
                    "\tКонтейнер: " + containers);
        }

        for (int b = 1; b <= boxes; b++) {
            System.out.println("\t\tЯщик: " + b);

            if (b % (MAX_BOXES_IN_CONTAINER * MAX_CONTAINERS_IN_TRUCK) == 0) {
                trucks++;
                System.out.println("Грузовик: " + trucks);
            }

            if (b % MAX_BOXES_IN_CONTAINER == 0) {
                if (b != boxes) {
                    containers++;
                    System.out.println("\tКонтейнер: " + containers);
                }
            }

        }
    }

    public static void printInfo() {
        System.out.println("Необходимо:" + System.lineSeparator() +
                "грузовиков - " + trucks + " шт." + System.lineSeparator() +
                "контейнеров - " + containers + " шт.");
    }
}
