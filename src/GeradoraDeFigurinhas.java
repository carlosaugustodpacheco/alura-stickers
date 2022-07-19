import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {

    public void cria(InputStream inputStream, String nomeArquivo) throws Exception {
        // leitura da imagem
        //InputStream inputStream = new FileInputStream("E:/CARLOS.PACHECO/Alura/Alura-ImersaoJava/alura-stickers/entrada/TopMovies_1.jpg"); 
         //   InputStream inputStream = 
        //           new URL("https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,3,128,176_AL_.jpg")
        //                   .openStream();
        //BufferedImage imagemOriginal = ImageIO.read(new File("/entrada/TopMovies_1.jpg"));
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // cria nova imagem em memoria com transparencia e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar a imagem original para novo imagem (em memoria)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, null, 0, 0);

        // configurar a fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.pink);
        graphics.setFont(fonte);
        // escrever uma frase na nova imagem
        graphics.drawString("TOP, CONFIA", 0, novaAltura - 50);

        // escrever a nova imagem em um arquivo

        //ImageIO.write(novaImagem, "png", new File("/saida/figurinha.png"));
        ImageIO.write(novaImagem, "png", new File(nomeArquivo));

        
    }
}