package uppgift11;

import java.util.Scanner;

public class VideoRecorderMain {
    public static int totalRecorderLength;
    public static int usedRecorderLength;
    public static String showStartTime;
    public static String showEndTime;
    public static void main(String[] args) {
        getInputs();
        int showLength = getShowLength();
        System.out.println(showLength + " minutes long show");
        System.out.println(getAvailableRecorderLength() + " minutes available");
        if (showLength <= getAvailableRecorderLength()){
            System.out.println("Can record");
        } else {
            System.out.println("Can't record");
        }
    }

    public static void getInputs(){
        System.out.println("Insert total length in minutes:");
        Scanner input = new Scanner(System.in);
        totalRecorderLength = input.nextInt();
        System.out.println("Insert used time:");
        usedRecorderLength = input.nextInt();
        input.nextLine();
        System.out.println("Time of show start: (hh:mm)");
        showStartTime = input.nextLine();
        System.out.println("Time of show end:");
        showEndTime = input.nextLine();

    }

    public static int getShowLength(){
        int showLength;
        int hourFirstDigitStart = showStartTime.charAt(0);
        int hourSecondDigitStart = showStartTime.charAt(1);
        int minuteFirstDigitStart = showStartTime.charAt(3);
        int minuteSecondDigitStart = showStartTime.charAt(4);
        int hourFirstDigitEnd = showEndTime.charAt(0);
        int hourSecondDigitEnd = showEndTime.charAt(1);
        int minuteFirstDigitEnd = showEndTime.charAt(3);
        int minuteSecondDigitEnd = showEndTime.charAt(4);
        showLength = (((hourFirstDigitEnd * 10 + hourSecondDigitEnd) - (hourFirstDigitStart * 10 + hourSecondDigitStart)) * 60)
                + ((minuteFirstDigitEnd * 10 + minuteSecondDigitEnd) - (minuteFirstDigitStart * 10 + minuteSecondDigitStart));

        return showLength;
    }

    public static int getAvailableRecorderLength(){
        return totalRecorderLength - usedRecorderLength;
    }
}
