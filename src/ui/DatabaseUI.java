package ui;

import delegates.DatabaseDelegate;

import javax.swing.*;
import java.awt.*;

public class DatabaseUI extends JFrame {

    private DatabaseDelegate delegate;

    public DatabaseUI() {
        super("Database");
    }

    public void showFrame(DatabaseDelegate delegate) {
        this.delegate = delegate;

        JButton theatreButton = new JButton("Theatre");
        JButton hallButton = new JButton("Hall");
        JButton seatButton = new JButton("seat");
        JButton orderButton = new JButton("order");
        JButton ticketButton = new JButton("ticket");


        JButton customerButton = new JButton("Customers");


        JPanel contentPane = new JPanel();
        this.setContentPane(contentPane);

        // layout components using the GridBag layout manager
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        contentPane.setLayout(gb);
        contentPane.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        // theatre button

        c.gridwidth = GridBagConstraints.REMAINDER;
        c.insets = new Insets(0, 0, 10, 0);
        gb.setConstraints(theatreButton, c);
        contentPane.add(theatreButton);

        // place the hall button
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.insets = new Insets(0, 0, 10, 0);
        gb.setConstraints(hallButton, c);
        contentPane.add(hallButton);

        // place the seat button
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.insets = new Insets(0, 0, 10, 0);
        gb.setConstraints(seatButton, c);
        contentPane.add(seatButton);

        //place the order button
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.insets = new Insets(0, 0, 10, 0);
        gb.setConstraints(orderButton, c);
        contentPane.add(orderButton);

        // place the ticket button
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.insets = new Insets(0, 0, 10, 0);
        gb.setConstraints(ticketButton, c);
        contentPane.add(ticketButton);




        // place the customer button
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.insets = new Insets(0, 0, 10, 0);
        gb.setConstraints(customerButton, c);
        contentPane.add(customerButton);


        customerButton.addActionListener(e -> this.delegate.showCustomers());
        theatreButton.addActionListener(e -> this.delegate.showTheaters());
        ticketButton.addActionListener(e -> this.delegate.showTickets());
        seatButton.addActionListener(e -> this.delegate.showSeats());
        hallButton.addActionListener(e -> this.delegate.showHalls());
        orderButton.addActionListener(e -> this.delegate.showOrders());

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
