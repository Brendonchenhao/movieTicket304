package ui;


import model.SeatModel;


import javax.swing.*;
import java.awt.*;

public class ShowSeatUI extends JFrame {

    private SeatModel[] models;

    public ShowSeatUI(SeatModel[] models) {
        super("Seats");
        this.models = models;
    }

    public void showFrame() {
        String[][] tableContent = new String[models.length][4];
        for (int i = 0; i < models.length; i++) {
            tableContent[i][0] = models[i].getSeatid().strip();
            tableContent[i][1] = models[i].getHallid().strip();
            tableContent[i][2] = models[i].getSeatType().strip();


        }
        String[] names = {
                "Seat",
                "Hall",
                "SeatType"


        };
        JTable table = new JTable(tableContent, names);

        JScrollPane scrollPane = new JScrollPane(table) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1200, 600);
            }
        };

        JPanel contentPane = new JPanel();
        this.setContentPane(contentPane);

        // layout components using the GridBag layout manager
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        contentPane.setLayout(gb);
        contentPane.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        // place the pane
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.insets = new Insets(0, 0, 0, 0);
        gb.setConstraints(scrollPane, c);
        contentPane.add(scrollPane);

        // size the window to obtain a best fit for the components
        this.pack();

        // center the frame
        Dimension d = this.getToolkit().getScreenSize();
        Rectangle r = this.getBounds();
        this.setLocation((d.width - r.width) / 2, (d.height - r.height) / 2);

        // make the window visible
        this.setVisible(true);
    }

}
