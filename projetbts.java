import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class projetbts extends JFrame {
    private JLabel prenomlabel = new JLabel("Prénom :");
    private JTextField textField1 = new JTextField(20); // Crée un champ de texte de 20 colonnes
    private JLabel nomlabel = new JLabel("Nom :");
    private JTextField textField2 = new JTextField(20); // Crée un champ de texte de 20 colonnes

    private JLabel emaillabel = new JLabel("Email :");
    private JTextField textField3 = new JTextField(20); // Crée un champ de texte de 20 colonnes

    private JLabel demandelabel = new JLabel("Votre demande :");
    private JTextField textField4 = new JTextField(20); // Crée un champ de texte de 20 colonnes



    public projetbts() {
        // Configuration de la fenêtre
        setTitle("Exemple de JLabel et JTextField");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));


        // Ajout du champ de texte et du label au conteneur
        JPanel panel = new JPanel();
        panel.add(prenomlabel);
        panel.add(textField1);
        panel.add(nomlabel);
        panel.add(textField2);
        panel.add(emaillabel);
        panel.add(textField3);
        panel.add(demandelabel);
        panel.add(textField4);
        add(panel);

        // Création d'un JComboBox pour le menu déroulant
        String[] optionsToChoose = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(optionsToChoose);

        // Ajout du JComboBox
        add(comboBox);

        comboBox.setMinimumSize(new Dimension(10, comboBox.getPreferredSize().height));

        // Configuration de la taille de la fenêtre
        setSize(400, 100);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            projetbts fenetre = new projetbts();
            fenetre.setVisible(true);
        });
    }
}
