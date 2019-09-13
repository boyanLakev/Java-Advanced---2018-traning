

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] robotAll = scanner.nextLine().split(";");
        String[] robot = new String[robotAll.length];
        int[] workTime = new int[robotAll.length];

        for (int i = 0; i < robotAll.length; i++) {
            String[] string=robotAll[i].split("[-]");

            robot[i] = string[0];

            workTime[i] = Integer.parseInt(string[1]);

        }
        int[] start = Arrays.stream(scanner.nextLine().split(":"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int startTime = start[0] * 24 * 60 + start[1] * 60 + start[2];
        ArrayDeque<String> detail = new ArrayDeque<>();
        while (true) {
            String line = scanner.nextLine();
            if ("End".equals(line)) {
                break;
            }
            detail.offer(line);
        }
        int[] freeWork = new int[robot.length];
        int time = startTime;
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (detail.isEmpty()){
                break;
            }
            String current = detail.poll();
            boolean free = true;
            for (int i = 0; i < robot.length; i++) {
                if (freeWork[i] < time) {
                    freeWork[i] = time + workTime[i];
                    sb.append(robot[i]).append(" - ").append(current);
                    int second = time % 60;
                    int minit = (time / 60) % 60;
                    int hour = ((time / 60) / 60) % 24;
                    String formatTime = String.format(" [%02d:%02d:%02d] %n", hour, minit, second);
                    sb.append(formatTime);
                    free = false;
                    break;
                }
            }

            if (free) {
                detail.offer(current);
            }
            time++;

        }
        System.out.println(sb);
    }
}
