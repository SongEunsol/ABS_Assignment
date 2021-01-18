package ex02;

import java.util.HashMap;
import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String data = null;
		
		while(true) {
			System.out.print("���� �Է�: ");
			data = sc.nextLine();
			
			if(data.equals("END")) {
				System.out.print("���α׷� ����");
				break;
			}
			if(data.length()>200) {
				System.out.print("������ ���̰� �ʹ� ��ϴ�!");
				break;
			}
			
			String[] result = data.split(" ", 30);
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			for(int i = 0; i < result.length; i++) {
				Integer count = map.get(result[i]);
				if (count == null) {
					map.put(result[i], 1);
				} else {
					map.put(result[i], count + 1);
				}
			}
			
			for(String key: map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}
			System.out.println();
		}
		
		sc.close();

	}
}
