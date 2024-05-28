package a;

import java.io.File;

import net.sourceforge.tess4j.*;

public class Tesseract {
    public static void main(String[] args) {
        File imageFile = new File("C:\\000030_2.jpg"); // OCR을 수행할 이미지 파일 경로

        ITesseract instance = new Tesseract(); // Tesseract 인스턴스 생성
        instance.setDatapath("tessdata"); // 테서렉트의 tessdata 디렉터리 경로 설정

        try {
            String result = instance.doOCR(imageFile); // 이미지에서 텍스트 추출
            System.out.println(result); // 추출된 텍스트 출력
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}
