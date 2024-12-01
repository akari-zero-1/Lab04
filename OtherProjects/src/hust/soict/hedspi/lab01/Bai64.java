import javax.swing.JOptionPane;

public class Bai64 {
    public static void main(String[] args) {
        while (true) {
            String monthInput = JOptionPane.showInputDialog("Nhap thang (VD: January, 1):").toLowerCase().trim();
            String yearInput = JOptionPane.showInputDialog("Nhap nam (VD: 1999):").trim();

            Integer month = parseMonth(monthInput);
            Integer year = parseYear(yearInput);

            if (month == null || year == null) {
                JOptionPane.showMessageDialog(null, " Vui long nhap lai.");
                continue;
            }

            int days = getDaysInMonth(month, year);
            JOptionPane.showMessageDialog(null, "So ngay trong thang " + month + " nam " + year + " la: " + days);
            break;
        }
    }

    private static Integer parseMonth(String month) {
        switch (month) {
            case "1": return 1;
            case "january": return 1;
            case "2": return 2;
            case "february": return 2;
            case "3": return 3;
            case "march": return 3;
            case "4": return 4;
            case "april": return 4;
            case "5": return 5;
            case "may": return 5;
            case "6": return 6;
            case "june": return 6;
            case "7": return 7;
            case "july": return 7;
            case "8": return 8;
            case "august": return 8;
            case "9": return 9;
            case "september": return 9;
            case "10": return 10;
            case "october": return 10;
            case "11": return 11;
            case "november": return 11;
            case "12": return 12;
            case "december": return 12;
            default: return null;
        }
    }

    private static Integer parseYear(String year) {
        try {
            int parsedYear = Integer.parseInt(year);
            return (parsedYear >= 0) ? parsedYear : null;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
