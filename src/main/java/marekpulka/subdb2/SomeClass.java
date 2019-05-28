package marekpulka.subdb2;

public class SomeClass {

  public final int add(int param1, int param2) {
    return param1 + param2;
  }

  /*
   * Code using 1.7 lang features
   */
  public final String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
    String typeOfDay;
    switch (dayOfWeekArg) {
      case "Monday":
        typeOfDay = "Start of work week";
        break;
      case "Tuesday":
      case "Wednesday":
      case "Thursday":
        typeOfDay = "Midweek";
        break;
      case "Friday":
        typeOfDay = "End of work week";
        break;
      case "Saturday":
      case "Sunday":
        typeOfDay = "Weekend";
        break;
      default:
        throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
    }
    return typeOfDay;
  }
}
