package ktp;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;

public class kartu extends JFrame{
    JFrame frame = new JFrame();
    JLabel bg = new JLabel();
    JLabel pp = new JLabel();
    JLabel ttd = new JLabel();
    ImageIcon backgroundImage = new ImageIcon();
    ImageIcon photo = new ImageIcon();
    ImageIcon tanda = new ImageIcon();

    JLabel title1 = new JLabel();
    JLabel title2 = new JLabel();
    JLabel profil1 = new JLabel();
    JLabel profil2 = new JLabel();
    JLabel profil3 = new JLabel();
    JLabel profil4 = new JLabel();
    JLabel profil5 = new JLabel();
    JLabel profil6 = new JLabel();
    JLabel profil7 = new JLabel();
    JLabel profil8 = new JLabel();
    JLabel profil9 = new JLabel();
    JLabel profil10 = new JLabel();
    JLabel profil11 = new JLabel();
    JLabel profil12 = new JLabel();
    JLabel profil13 = new JLabel();
    JLabel profil14 = new JLabel();

    JLabel value1 = new JLabel();
    JLabel value2 = new JLabel();
    JLabel value3 = new JLabel();
    JLabel value4 = new JLabel();
    JLabel value5 = new JLabel();
    JLabel value6 = new JLabel();
    JLabel value7 = new JLabel();
    JLabel value8 = new JLabel();
    JLabel value9 = new JLabel();
    JLabel value10 = new JLabel();
    JLabel value11 = new JLabel();
    JLabel value12 = new JLabel();
    JLabel value13 = new JLabel();
    JLabel value14 = new JLabel();
    JLabel end1 = new JLabel();
    JLabel end2 = new JLabel();

    String prov = "PROVINSI JAWA TENGAH";
    String kab = "KABUPATEN SEOUL";
    public kartu(){

        title1.setText(prov);
        title1.setFont(new Font("Arial", 1, 17));
        title1.setBounds(0, 5, 450, 20);
        title1.setHorizontalAlignment(JLabel.CENTER);
        frame.add(title1);

        title2.setText(kab);
        title2.setFont(new Font("Arial", 1, 17));
        title2.setBounds(0, 22, 450, 20);
        title2.setHorizontalAlignment(JLabel.CENTER);
        frame.add(title2);

        profil1.setText("NIK");
        profil1.setFont(new Font("OCR A Extended", 1, 16));
        profil1.setBounds(15,45,150,20);
        profil1.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil1);

        profil2.setText("Nama");
        profil2.setFont(new Font("Arial", 1, 10));
        profil2.setBounds(16,65,150,20);
        profil2.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil2);

        profil3.setText("Tempat/Tgl Lahir");
        profil3.setFont(new Font("Arial", 1, 10));
        profil3.setBounds(16,78,150,20);
        profil3.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil3);

        profil4.setText("Jenis Kelamin");
        profil4.setFont(new Font("Arial", 1, 10));
        profil4.setBounds(16,91,150,20);
        profil4.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil4);

        profil5.setText("Alamat");
        profil5.setFont(new Font("Arial", 1, 10));
        profil5.setBounds(16,104,150,20);
        profil5.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil5);
        
        profil6.setText("RT/RW");
        profil6.setFont(new Font("Arial", 1, 10));
        profil6.setBounds(36,117,150,20);
        profil6.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil6);

        profil7.setText("Kel/Desa");
        profil7.setFont(new Font("Arial", 1, 10));
        profil7.setBounds(36,130,150,20);
        profil7.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil7);

        profil8.setText("Kecamatan");
        profil8.setFont(new Font("Arial", 1, 10));
        profil8.setBounds(36,143,150,20);
        profil8.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil8);

        profil9.setText("Agama");
        profil9.setFont(new Font("Arial", 1, 10));
        profil9.setBounds(16,156,150,20);
        profil9.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil9);

        profil10.setText("Status Perkawinan");
        profil10.setFont(new Font("Arial", 1, 10));
        profil10.setBounds(16,169,150,20);
        profil10.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil10);

        profil11.setText("Pekerjaan");
        profil11.setFont(new Font("Arial", 1, 10));
        profil11.setBounds(16,182,150,20);
        profil11.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil11);

        profil12.setText("Kewarganegaraan");
        profil12.setFont(new Font("Arial", 1, 10));
        profil12.setBounds(16,195,150,20);
        profil12.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil12);

        profil13.setText("Berlaku Hingga");
        profil13.setFont(new Font("Arial", 1, 10));
        profil13.setBounds(16,208,150,20);
        profil13.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil13);

        value1.setText(": 3200128970002999");
        value1.setFont(new Font("OCR A Extended", 1, 16));
        value1.setBounds(100,45,250,20);
        value1.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value1);

        value2.setText(": LEE DO HYUN");
        value2.setFont(new Font("Arial", 1, 10));
        value2.setBounds(110,65,110,20);
        value2.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value2);

        value3.setText(": GOYANG, 11-04-1995");
        value3.setFont(new Font("Arial", 1, 10));
        value3.setBounds(110,78,110,20);
        value3.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value3);

        value4.setText(": LAKI-LAKI");
        value4.setFont(new Font("Arial", 1, 10));
        value4.setBounds(110,91,110,20);
        value4.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value4);

        value5.setText(": JL. JALAN");
        value5.setFont(new Font("Arial", 1, 10));
        value5.setBounds(110,104,110,20);
        value5.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value5);
        
        value6.setText(": 001/012");
        value6.setFont(new Font("Arial", 1, 10));
        value6.setBounds(110,117,110,20);
        value6.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value6);

        value7.setText(": GOYANG");
        value7.setFont(new Font("Arial", 1, 10));
        value7.setBounds(110,130,110,20);
        value7.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value7);

        value8.setText(": GYEONGGI-DO");
        value8.setFont(new Font("Arial", 1, 10));
        value8.setBounds(110,143,110,20);
        value8.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value8);

        value9.setText(": UNKNOWN");
        value9.setFont(new Font("Arial", 1, 10));
        value9.setBounds(110,156,110,20);
        value9.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value9);

        value10.setText(": BELUM KAWIN");
        value10.setFont(new Font("Arial", 1, 10));
        value10.setBounds(110,169,110,20);
        value10.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value10);

        value11.setText(": PELAJAR/MAHASISWA");
        value11.setFont(new Font("Arial", 1, 10));
        value11.setBounds(110,182,115,20);
        value11.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value11);

        value12.setText(": WNA");
        value12.setFont(new Font("Arial", 1, 10));
        value12.setBounds(110,195,110,20);
        value12.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value12);

        value13.setText(": SEUMUR HIDUP");
        value13.setFont(new Font("Arial", 1, 10));
        value13.setBounds(110,208,110,20);
        value13.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value13);

        profil14.setText("Gol Darah");
        profil14.setFont(new Font("Arial", 1, 10));
        profil14.setBounds(215,91,110,20);
        profil14.setHorizontalAlignment(JLabel.LEFT);
        frame.add(profil14);

        value14.setText(": -");
        value14.setFont(new Font("Arial", 1, 10));
        value14.setBounds(265,91,110,20);
        value14.setHorizontalAlignment(JLabel.LEFT);
        frame.add(value14);

        end1.setText("GYEONGGI");
        end1.setFont(new Font("Arial", 1, 10));
        end1.setBounds(335,187,105,20);
        end1.setHorizontalAlignment(JLabel.LEFT);
        frame.add(end1);

        end2.setText("06-01-2021");
        end2.setFont(new Font("Arial", 1, 10));
        end2.setBounds(338,200,110,20);
        end2.setHorizontalAlignment(JLabel.LEFT);
        frame.add(end2);

        photo = new ImageIcon(this.getClass().getResource("ppp.jpg"));
        Image photoo = photo.getImage();
        int lebar = 100;
        int tinggi = 130;
        Image photoobaru = photoo.getScaledInstance(lebar, tinggi, Image.SCALE_SMOOTH);
        pp.setIcon(new ImageIcon(photoobaru));
        pp.setHorizontalAlignment(JLabel.CENTER);
        pp.setBounds(314, 60, 100, 130);
        frame.add(pp);

        tanda = new ImageIcon(this.getClass().getResource("ttd.png"));
        Image tanda2 = tanda.getImage();
        int l = 120;
        int t = 80;
        Image tandatangan = tanda2.getScaledInstance(l, t, Image.SCALE_SMOOTH);
        ttd.setIcon(new ImageIcon(tandatangan));
        ttd.setHorizontalAlignment(JLabel.CENTER);
        ttd.setBounds(340, 220, 50, 30);
        frame.add(ttd);

        backgroundImage = new ImageIcon(this.getClass().getResource("ktp.jpeg"));
        bg.setIcon(backgroundImage);
        bg.setBounds(0, 0, 450, 300);
        frame.add(bg);

        setFrame();
    }
    public void setFrame(){
        frame.setLayout(null);
        frame.setTitle("KTP");
        frame.setSize(450, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

