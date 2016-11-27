import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class GUI extends JPanel {

    private final int Divide = 600 / 8;
    private Rectangle2D rec;

    private Image TorreBranca = null;
    private Image CavaloBranco = null;
    private Image BispoBranco = null;
    private Image RainhaBranca = null;
    private Image ReiBranco = null;
    private Image PeaoBranco = null;
    private Image TorrePreta = null;
    private Image CavaloPreto = null;
    private Image BispoPreto = null;
    private Image RainhaPreta = null;
    private Image ReiPreto = null;
    private Image PeaoPreto = null;
    char tabuleir[][] = new char[8][8];

    public GUI (char[][] t) {
        tabuleir = t;
    }
    

	public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        
        int iWidth = 600;
        int iHeight = 600;

        TorreBranca = Toolkit.getDefaultToolkit().getImage("src\\Icons\\wr.gif");
        CavaloBranco = Toolkit.getDefaultToolkit().getImage("src\\Icons\\wn.gif");
        BispoBranco = Toolkit.getDefaultToolkit().getImage("src\\Icons\\wb.gif");
        RainhaBranca = Toolkit.getDefaultToolkit().getImage("src\\Icons\\wq.gif");
        ReiBranco = Toolkit.getDefaultToolkit().getImage("src\\Icons\\wk.gif");
        PeaoBranco = Toolkit.getDefaultToolkit().getImage("src\\Icons\\wp.gif");
        TorrePreta = Toolkit.getDefaultToolkit().getImage("src\\Icons\\br.gif");
        CavaloPreto = Toolkit.getDefaultToolkit().getImage("src\\Icons\\bn.gif");
        BispoPreto = Toolkit.getDefaultToolkit().getImage("src\\Icons\\bb.gif");
        RainhaPreta = Toolkit.getDefaultToolkit().getImage("src\\Icons\\bq.gif");
        ReiPreto = Toolkit.getDefaultToolkit().getImage("src\\Icons\\bk.gif");
        PeaoPreto = Toolkit.getDefaultToolkit().getImage("src\\Icons\\bp.gif");
        //apaga a tela antes de desenhar o tabuleiro com as pe�as
        g.setColor(Color.WHITE);

        // Desenha o tabuleiro
        for (int i = 0; i < 8; i = i + 2) {
            for (int j = 0; j < 8; j = j + 2) {

                g2.setColor(Color.BLUE);
                rec = new Rectangle2D.Double(j * iWidth / 8, (1 + i) * iHeight / 8, Divide, Divide);
                g2.fill(rec);
                rec = new Rectangle2D.Double((1 + j) * iWidth / 8, i * iHeight / 8, Divide, Divide);
                g2.fill(rec);

            }
        }

        //Atribui as pe�as
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {

                switch (tabuleir[j][i]) {
                    case 'R':
                        g.drawImage(TorreBranca, 75 * i + 20, 540 - (75 * j + 10), this);
                        break;
                    case 'r':
                        g.drawImage(TorrePreta, 75 * i + 20, 540 - (75 * j + 10), this);
                        break;
                    case 'B':
                        g.drawImage(BispoBranco, 75 * i + 20, 540 - (75 * j + 10), this);
                        break;
                    case 'b':
                        g.drawImage(BispoPreto, 75 * i + 20, 540 - (75 * j + 10), this);
                        break;
                    case 'N':
                        g.drawImage(CavaloBranco, 75 * i + 20, 540 - (75 * j + 10), this);
                        break;
                    case 'n':
                        g.drawImage(CavaloPreto, 75 * i + 20, 540 - (75 * j + 10), this);
                        break;
                    case 'Q':
                        g.drawImage(RainhaBranca, 75 * i + 20, 530 - (75 * j + 5), this);
                        break;
                    case 'q':
                        g.drawImage(RainhaPreta, 75 * i + 20, 530 - (75 * j + 5), this);
                        break;
                    case 'k':
                        g.drawImage(ReiPreto, 75 * i + 20, 530 - (75 * j + 3), this);
                        break;
                    case 'K':
                        g.drawImage(ReiBranco, 75 * i + 20, 530 - (75 * j + 10), this);
                        break;
                    case 'p':
                        g.drawImage(PeaoPreto, 75 * i + 20, 540 - (75 * j + 10), this);
                        break;
                    case 'P':
                        g.drawImage(PeaoBranco, 75 * i + 20, 540 - (75 * j + 10), this);
                        break;
                    default:
                    //desenha nada
                }

            }

        }
    }
}