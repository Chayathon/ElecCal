import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ElecCal {
    public static void main(String[] args) {
        int unitPrev = 0, curUnit;
        String msg;
        msg = JOptionPane.showInputDialog(null, "Unit 3 month prev", "Input", 3);
        String[] msg_arr = msg.split(" ");

        msg = JOptionPane.showInputDialog(null, "Enter Current Unit", "Input", 3);
        curUnit = Integer.parseInt(msg);

        for(int i = 0; i < 3; i++) {
            unitPrev = Integer.parseInt(msg_arr[i]);
        }

        if(unitPrev < 150) {
            method1(curUnit);
        }
        else {
            method2(curUnit);
        }
    }

    public static void method1(int unit) {
        JTextArea textArea = new JTextArea();
        double service = 8.19;
        int perUnit[] = {15, 10, 10, 65, 50, 250, 400};
        double cost[] = {2.3488, 2.9882, 3.2405, 3.6237, 3.7171, 4.2218, 4.4217};
        double total = 0;

        textArea.append("\tUnit\t" + unit + "\n");
        textArea.append("\tService charge\t" + service + "\n\n");
        
        for(int i = 0; ; i++) {
            if(unit > 0) {
                if(unit < perUnit[i]) {
                    textArea.append(perUnit[i] + "\t" + unit + "x" + cost[i] + "\t" + (unit * cost[i] + "\n"));
                    total += unit * cost[i];
                    unit -= perUnit[i];
                }
                else {
                    textArea.append(perUnit[i] + "\t" + perUnit[i] + "x" + cost[i] + "\t" + (perUnit[i] * cost[i] + "\n"));
                    total += perUnit[i] * cost[i];
                    unit -= perUnit[i];
                }
            } else break;
        }
        textArea.append("Total\t" + (total + service));
        JOptionPane.showMessageDialog(null, textArea, "Cal", 1);
    }

    public static void method2(int unit) {
        JTextArea textArea = new JTextArea();
        double service = 38.22;
        int perUnit[] = {150, 250, 400};
        double cost[] = {3.2484, 4.2218, 4.4217};
        double total = 0;

        textArea.append("\tUnit\t" + unit + "\n");
        textArea.append("\tService charge\t" + service + "\n\n");
        
        for(int i = 0; ; i++) {
            if(unit > 0) {
                if(unit < perUnit[i]) {
                    textArea.append(perUnit[i] + "\t" + unit + "x" + cost[i] + "\t" + (unit * cost[i] + "\n"));
                    total += unit * cost[i];
                    unit -= perUnit[i];
                }
                else {
                    textArea.append(perUnit[i] + "\t" + perUnit[i] + "x" + cost[i] + "\t" + (perUnit[i] * cost[i] + "\n"));
                    total += perUnit[i] * cost[i];
                    unit -= perUnit[i];
                }
            } else break;
        }
        textArea.append("Total\t" + (total + service));
        JOptionPane.showMessageDialog(null, textArea, "Cal", 1);
    }
}
