package java_20190604.step1;
// �䱸����
// 1. �и� ������� ��� �ð��� ����� �ּ���.
// �� �䱸������ ����� �� ����. -> �߰� ���� �䱸���� : ���뼼���� �߰�, �и�~���� �����ϰ� ���ּ���.

public class FootStopWatch {
	public long startTime;
	public long endTime;
	
	public double getElapsedTime(){
		return (double) (endTime - startTime) / (double) 1000;
	}
	
	public static void mian(String[] args) {
		FootStopWatch f = new FootStopWatch();
		f.startTime = System.currentTimeMillis(); // currentTimeMillis() : 1970�� 1�� 1�� ���� ���ݱ����� �ð��� �и�������� ��ȯ�Ѵ�.
		
		for (int i=0 ; i <2_200_000_000l ; i++) {
		
		}
		f.endTime = System.currentTimeMillis();
		
		double elapsedTime = f.getElapsedTime();		
		System.out.println("����� �ð� : " + elapsedTime); 
	}
}
