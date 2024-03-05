import java.awt.Color;

public class Editor4 {

	public static void main (String[] args) {
		String file = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] fileImage = Runigram.read(file);
        Color[][] greyImage = Runigram.grayScaled(fileImage);
		//Color[][] targetImage = Runigram.morph(fileImage, greyImage, n);
		Runigram.setCanvas(fileImage);
		Runigram.morph(fileImage, greyImage, n);
	}   
}
