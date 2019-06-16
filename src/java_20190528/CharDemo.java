package java_20190528;

public class CharDemo {
	public static void main (String[] args){
		//¹®ÀÚ Ç¥Çö¹ı
		char a = 'q';
		
		// À¯´ÏÄÚµå Ç¥Çö¹ı '\u0000'
		char b = '\uC548';
		char c = '\uC9C0';
		char d = '\uD61C';
		
		System.out.println(b); // println ÇÁ¸°Æ® ¶óÀÎÀº ­‹·Â ÈÄ °³Çà
		System.out.println(c);
		System.out.println(d);
		
		System.out.print(b); // print Ãâ·Â
		System.out.print(c);
		System.out.print(d);
		
		// Çö ¼öÁØ¿¡¼­ ÇÑ ÁÙ·Î Ãâ·ÂÇÏ±â ÄÚµå´Â º¹ÀâÇÏ´Ï PASS
		
		// ¾Æ½ºÅ°ÄÚµå Ç¥Çö¹ı
		char e = 97;
		System.out.println(e);
		
		//ÀÌ½ºÄÉÀÌÇÁ Ä³¸¯ÅÍ
		System.out.println("¼º¿µÇÑ\t¸¸¼¼"); // t\ tab ¸¸Å­ ¶ç¾î ÁÜ
		System.out.println("C:\\Users\\user\\Desktop\\anjh_0527"); // ¹é½½·¡½Ã¸¦ Ãß·ÂÇÏ±â À§ÇØ¼± '//'À¸·Î ÃÄ¾ß ÇÔ.
	
		System.out.println("\""); // ½Öµû¿ÈÇ¥ \" , 
		System.out.println("¼º¿µÇÑ '¸¸¼¼'"); // È¬µû¿ÈÇ¥´Â ÀÎ½ÄÇÔ. ÀÌ½ºÄÉÀÌÇÁ char ºÒÇÊ¿ä	
		// ¹®ÀÚ¿­ Áß¿¡¼­ ÀÎ½Ä ¸øÇÏ´Â °Í µü 2°¡Áö : "(½Öµû¿ÈÇ¥), \(¹é½½·¹½Ã) ´Â ±×´ë·Î ¾²¸é ¹®ÀÚ·Î ÀÎ½ÄÇÏÁö ¸ø ÇÔ. ¾Õ¿¡ ¹é½½·¡½Ã(\)¸¦ ºÙ¿©¼­ ¹®ÀÚ·Î ÀÎ½Ä½ÃÄÑ¾ß ÇÔ.
	
		// ¹®ÀÚ¿¡¼­ \, ' µÎ°³ÀÇ ¹®ÀÚ´Â ¹®ÀÚ¿¡¼­ char¿¡¼­ ÀÎ½ÄÀ» ¸øÇÏ±â ¶§¹®¿¡ µÎ ¹®ÀÚ ¾Ğ¿¡ \¸¦ ºÙ¿© ÁØ´Ù.
		char f = '\\';
		char g = '\'';
		char h = '"';
			
	}
}
