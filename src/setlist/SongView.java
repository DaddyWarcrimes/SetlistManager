package setlist;

import javax.swing.*;
import javax.swing.border.Border;

public class SongView extends JPanel {

    private String title;
    private String composer;
    private String key;
    private String genre;
    private int length;
    private int tempo;
    private int intro;
    private boolean archive;

    private JLabel titleDataLabel;
    private JLabel composerDataLabel;
    private JLabel keyDataLabel;
    private JLabel genreDataLabel;
    private JLabel lengthDataLabel;
    private JLabel tempoDataLabel;
    private JLabel introDataLabel;
    private JLabel archiveDataLabel;

    private void create() {
        if (title.equals("")) {
            title = " ";
        }
        if (composer.equals("")) {
            composer = " ";
        }
        if (key.equals("")) {
            key = " ";
        }
        if (genre.equals("")) {
            genre = " ";
        }

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        JPanel labels = new JPanel();
        BoxLayout labelsLayout = new BoxLayout(labels, BoxLayout.Y_AXIS);
        labels.setLayout(labelsLayout);

        JPanel data = new JPanel();
        BoxLayout dataLayout = new BoxLayout(data, BoxLayout.Y_AXIS);
        data.setLayout(dataLayout);

        Border labelBorder = BorderFactory.createEmptyBorder(1,1,1,20);

        JLabel titleLabel = new JLabel("Title: ");
        titleLabel.setBorder(labelBorder);
        JLabel composerLabel = new JLabel("Composer: ");
        composerLabel.setBorder(labelBorder);
        JLabel keyLabel = new JLabel("Key: ");
        keyLabel.setBorder(labelBorder);
        JLabel genreLabel = new JLabel("Genre: ");
        genreLabel.setBorder(labelBorder);
        JLabel lengthLabel = new JLabel("Length: ");
        lengthLabel.setBorder(labelBorder);
        JLabel tempoLabel = new JLabel("Tempo: ");
        tempoLabel.setBorder(labelBorder);
        JLabel introLabel = new JLabel("Intro: ");
        introLabel.setBorder(labelBorder);
        JLabel archiveLabel = new JLabel("Archive: ");
        archiveLabel.setBorder(labelBorder);

        titleDataLabel = new JLabel(title);
        titleDataLabel.setBorder(labelBorder);
        composerDataLabel = new JLabel(composer);
        composerDataLabel.setBorder(labelBorder);
        keyDataLabel = new JLabel(key);
        keyDataLabel.setBorder(labelBorder);
        genreDataLabel = new JLabel(genre);
        genreDataLabel.setBorder(labelBorder);
        lengthDataLabel = new JLabel(String.valueOf(length));
        lengthDataLabel.setBorder(labelBorder);
        tempoDataLabel = new JLabel(String.valueOf(tempo));
        tempoDataLabel.setBorder(labelBorder);
        introDataLabel = new JLabel(String.valueOf(intro));
        introDataLabel.setBorder(labelBorder);
        archiveDataLabel = new JLabel(String.valueOf(archive));
        archiveDataLabel.setBorder(labelBorder);

        labels.add(titleLabel);
        labels.add(composerLabel);
        labels.add(keyLabel);
        labels.add(genreLabel);
        labels.add(lengthLabel);
        labels.add(tempoLabel);
        labels.add(introLabel);
        labels.add(archiveLabel);

        data.add(titleDataLabel);
        data.add(composerDataLabel);
        data.add(keyDataLabel);
        data.add(genreDataLabel);
        data.add(lengthDataLabel);
        data.add(tempoDataLabel);
        data.add(introDataLabel);
        data.add(archiveDataLabel);

        add(labels);
        add(data);

        setBorder(BorderFactory.createRaisedBevelBorder());
    }

    public SongView() {
        title = " ";
        composer = " ";
        key = " ";
        genre = " ";
        length = 0;
        tempo = 0;
        intro = 0;
        archive = false;
        create();
    }

    public SongView(Song s) {
        title = s.getTitle();
        composer = s.getComposer();
        key = s.getKey();
        genre = s.getGenre();
        length = s.getLength();
        tempo = s.getTempo();
        intro = s.getIntro();
        archive = s.isArchive();
        create();
    }

    public SongView(String title, String composer, String key, String genre, int length, int tempo, int intro, boolean archive) {
        this.title = title;
        this.composer = composer;
        this.key = key;
        this.genre = genre;
        this.length = length;
        this.tempo = tempo;
        this.intro = intro;
        this.archive = archive;
        create();
    }

    public void changeSong(Song s) {
        title = s.getTitle();
        composer = s.getComposer();
        key = s.getKey();
        genre = s.getGenre();
        length = s.getLength();
        tempo = s.getTempo();
        intro = s.getIntro();
        archive = s.isArchive();

        if (title.equals("")) {
            title = " ";
        }
        if (composer.equals("")) {
            composer = " ";
        }
        if (key.equals("")) {
            key = " ";
        }
        if (genre.equals("")) {
            genre = " ";
        }

        titleDataLabel.setText(title);
        composerDataLabel.setText(composer);
        keyDataLabel.setText(key);
        genreDataLabel.setText(genre);
        lengthDataLabel.setText(String.valueOf(length));
        tempoDataLabel.setText(String.valueOf(tempo));
        introDataLabel.setText(String.valueOf(intro));
        archiveDataLabel.setText(String.valueOf(archive));
    }

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }

    public String getKey() {
        return key;
    }

    public String getGenre() {
        return genre;
    }

    public int getLength() {
        return length;
    }

    public int getTempo() {
        return tempo;
    }

    public int getIntro() {
        return intro;
    }

    public boolean getArchive() {
        return archive;
    }
}