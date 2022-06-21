import java.awt.*;
import java.io.File;
import java.io.IOException;

public class customFonts {

    Font customFont;

    public customFonts() {

        createFont();
    }

    public void createFont() {
        try {
            //create the font to use. Specify the size!
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("src/Fonts/IrishGrover.ttf")).deriveFont(32f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(customFont);
        } catch (IOException e) {
            e.printStackTrace();
        } catch(FontFormatException e) {
            e.printStackTrace();
        }

    }
}
