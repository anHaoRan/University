package work20210307;
// 教材136页
//第一题
//1C4C5A
//第二题
public class ClassRoom0307_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int[] b = new int[2];
			b[0] = 1;
			b[1] = 0;
			b[2] = 3;
			for(int i=0;i<1;i++)
				System.out.println(a/b[i]);
		} catch (ArithmeticException e) {
			System.out.println("除数为零，产生异常");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界，产生异常");
		} catch (Exception e) {
			System.out.println("其他异常");
		} finally {
			System.out.println("finally");
		}
		System.out.println("程序结束");
	}

}
