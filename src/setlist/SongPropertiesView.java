package setlist;

import javax.swing.*;
import java.awt.*;

public class SongPropertiesView extends JPanel {

    private JTextField titleTextField = new JTextField();
    private JTextField composerTextField = new JTextField();
    private JTextField keyTextField = new JTextField();
    private JTextField genreTextField = new JTextField();
    private JTextField lengthTextField = new JTextField();
    private JTextField tempoTextField = new JTextField();
    private JTextField introTextField = new JTextField();
    private JCheckBox archiveCheckBox = new JCheckBox();

    private void create(Song s) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Dimension d = new Dimension(200, 20);

        JLabel titleLabel = new JLabel("Title: ");
        titleLabel.setPreferredSize(d);
        JLabel composerLabel = new JLabel("Composer: ");
        composerLabel.setPreferredSize(d);
        JLabel keyLabel = new JLabel("Key: ");
        keyLabel.setPreferredSize(d);
        JLabel genreLabel = new JLabel("Genre: ");
        genreLabel.setPreferredSize(d);
        JLabel lengthLabel = new JLabel("Length (in seconds): ");
        lengthLabel.setPreferredSize(d);
        JLabel tempoLabel = new JLabel("Tempo (in beats per minute): ");
        tempoLabel.setPreferredSize(d);
        JLabel introLabel = new JLabel("Intro (in seconds): ");
        introLabel.setPreferredSize(d);
        JLabel archiveLabel = new JLabel("Archive: ");
        archiveLabel.setPreferredSize(d);

        titleTextField.setText(s.getTitle());
        titleTextField.setPreferredSize(d);
        composerTextField.setText(s.getComposer());
        composerTextField.setPreferredSize(d);
        keyTextField.setText(s.getKey());
        keyTextField.setPreferredSize(d);
        genreTextField.setText(s.getGenre());
        genreTextField.setPreferredSize(d);
        lengthTextField.setText(String.valueOf(s.getLength()));
        lengthTextField.setPreferredSize(d);
        tempoTextField.setText(String.valueOf(s.getTempo()));
        tempoTextField.setPreferredSize(d);
        introTextField.setText(String.valueOf(s.getIntro()));
        introTextField.setPreferredSize(d);
        archiveCheckBox.setSelected(s.isArchive());

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.X_AXIS));
        titlePanel.add(titleLabel);
        titlePanel.add(titleTextField);

        JPanel composerPanel = new JPanel();
        composerPanel.setLayout(new BoxLayout(composerPanel, BoxLayout.X_AXIS));
        composerPanel.add(composerLabel);
        composerPanel.add(composerTextField);

        JPanel keyPanel = new JPanel();
        keyPanel.setLayout(new BoxLayout(keyPanel, BoxLayout.X_AXIS));
        keyPanel.add(keyLabel);
        keyPanel.add(keyTextField);

        JPanel genrePanel = new JPanel();
        genrePanel.setLayout(new BoxLayout(genrePanel, BoxLayout.X_AXIS));
        genrePanel.add(genreLabel);
        genrePanel.add(genreTextField);

        JPanel lengthPanel = new JPanel();
        lengthPanel.setLayout(new BoxLayout(lengthPanel, BoxLayout.X_AXIS));
        lengthPanel.add(lengthLabel);
        lengthPanel.add(lengthTextField);

        JPanel tempoPanel = new JPanel();
        tempoPanel.setLayout(new BoxLayout(tempoPanel, BoxLayout.X_AXIS));
        tempoPanel.add(tempoLabel);
        tempoPanel.add(tempoTextField);

        JPanel introPanel = new JPanel();
        introPanel.setLayout(new BoxLayout(introPanel, BoxLayout.X_AXIS));
        introPanel.add(introLabel);
        introPanel.add(introTextField);

        JPanel archivePanel = new JPanel();
        archivePanel.setLayout(new BoxLayout(archivePanel, BoxLayout.X_AXIS));
        archivePanel.add(archiveLabel);
        archivePanel.add(archiveCheckBox);

        add(titlePanel);
        add(composerPanel);
        add(keyPanel);
        add(genrePanel);
        add(lengthPanel);
        add(tempoPanel);
        add(introPanel);
        add(archivePanel);
    }

    public SongPropertiesView() {
        Song s = new Song("", "", "", "", 0, 0, 0, false);
        create(s);
    }

    public SongPropertiesView(Song s) {
        create(s);
    }

    public SongPropertiesView(SongPropertiesView spv) {
        create(new Song(spv.getTitle(), spv.getComposer(), spv.getKey(), spv.getGenre(), spv.getLength(), spv.getTempo(), spv.getIntro(), spv.getArchive()));
    }

    public SongPropertiesView(String title, String composer, String key, String genre, int length, int tempo, int intro, boolean archive) {
        Song s = new Song(title, composer, key, genre, length, tempo, intro, archive);
        create(s);
    }

    public void changeSong(Song s) {
        titleTextField.setText(s.getTitle());
        composerTextField.setText(s.getComposer());
        keyTextField.setText(s.getKey());
        genreTextField.setText(s.getGenre());
        lengthTextField.setText(String.valueOf(s.getLength()));
        tempoTextField.setText(String.valueOf(s.getTempo()));
        introTextField.setText(String.valueOf(s.getIntro()));
        archiveCheckBox.setSelected(s.isArchive());
    }

    public String getTitle() {
        if (titleTextField.getText() == "") {
            return " ";
        } else {
            return titleTextField.getText();
        }
    }

    public String getComposer() {
        if (composerTextField.getText() == "") {
            return " ";
        } else {
            return composerTextField.getText();
        }
    }

    public String getKey() {
        if (keyTextField.getText() == "") {
            return " ";
        } else {
            return keyTextField.getText();
        }
    }

    public String getGenre() {
        if (genreTextField.getText() == "") {
            return " ";
        } else {
            return genreTextField.getText();
        }
    }

    public int getLength() {
        int n;
        try {
            n = Integer.parseInt(lengthTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Length may have been entered incorrectly", "Error", JOptionPane.ERROR_MESSAGE);
            n = 0;
        }
        return n;
    }

    public int getTempo() {
        int n;
        try {
            n = Integer.parseInt(tempoTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Tempo may have been entered incorrectly", "Error", JOptionPane.ERROR_MESSAGE);
            n = 0;
        }
        return n;
    }

    public int getIntro() {
        int n;
        try {
            n = Integer.parseInt(introTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Intro may have been entered incorrectly", "Error", JOptionPane.ERROR_MESSAGE);
            n = 0;
        }
        return n;
    }

    public boolean getArchive() {
        return archiveCheckBox.isSelected();
    }
}