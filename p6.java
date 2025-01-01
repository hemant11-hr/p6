import javax.swing.*;
import java.awt.*;

public class ColorAndFonts {

    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame frame = new JFrame("Color and Font Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a JLabel instance
        JLabel label = new JLabel("Hello, colorful world!");
        
        // Set font of the JLabel
        label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));

        // Set foreground color of the JLabel
        label.setForeground(new Color(0, 128, 255)); // Blue color

        // Set background color (requires opaque to be true)
        label.setOpaque(true);
        label.setBackground(new Color(255, 228, 225)); // Light pink

        // Center align the text
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Add the label to the frame
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
