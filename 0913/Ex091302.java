package top03;

import java.util.Scanner;

public class Ex091302 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		String[] Str = { "math", "eng", "chn" };
		int[] Nums = { -2, 1, 99, 5, 10, 55, 100, 0, -1 };
		String Ex = "chn";
		Data quStr = new Data();
		System.out.println(quStr.equalsStr(Str, Ex));
		System.out.println("-------------");
		System.out.println("取最大值:" + quStr.getmax(Nums));
		System.out.println("取最小值:" + quStr.getmin(Nums));
		System.out.println("-------------");
		/*----判斷成績區間----*/
		int score = 70;
		if (score >= 80) {
			System.out.println("成績:" + score + " 為優等");
		} else if (score >= 60) {
			System.out.println("成績:" + score + " 為甲等");
		} else if (score >= 55) {
			System.out.println("請補考測驗~");
		} else
			System.out.println("成績不合格");
		/*----巢狀判斷式----*/
		Scanner inputS = new Scanner(System.in);
		System.out.println("請輸入數學成績:");
		int math = inputS.nextInt();
		if (math >= 0 && math <= 100) {
			if (math >= 80) {
				System.out.println("成績:" + math + " 為優等");
			} else if (math >= 60) {
				System.out.println("成績:" + math + " 為甲等");
			} else if (math >= 55) {
				System.out.println("請補考測驗~");
			} else
				System.out.println("成績不合格");
		} else {
			System.out.println("成績輸入錯誤");
		}

	}
}
