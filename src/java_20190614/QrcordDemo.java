package java_20190614;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QrcordDemo {
	public static void main(String[] args) throws WriterException, IOException {
		QRCodeWriter wirter = new QRCodeWriter();
	
		BitMatrix grCode = wirter.encode("http://www.naver.com", BarcodeFormat.QR_CODE, 300, 300); // QR생성
		BufferedImage qrImage = MatrixToImageWriter. toBufferedImage(grCode); // 이미지 생성
	
		File f = new File ("c:\\down\\qrcode.png");
		boolean isSuccess = ImageIO.write(qrImage, "PNG", f);
		System.out.println(isSuccess);	
	}
	
	// 메소드화
	public boolean isCreateQRcode(String text)throws Exception {
		QRCodeWriter wirter = new QRCodeWriter();
		BitMatrix grCode = wirter.encode("text", BarcodeFormat.QR_CODE, 300, 300); // QR생성
		BufferedImage qrImage = MatrixToImageWriter. toBufferedImage(grCode); // 이미지 생성
	
		File f = new File ("c:\\down\\qrcode.png");
		// boolean isSuccess = ImageIO.write(qrImage, "PNG", f);
		// return isSuccess;
		return ImageIO.write(qrImage, "PNG", f);
	}
}

// 스트리밍체인

