import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
public class ch11_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"������", "�����", "������"};
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		System.out.println(list);
		List<String> al1 = new ArrayList<>(list);
		System.out.println("nCopies : " + al1);
		al1.set(0, "��");
		al1.set(1, "��");
		System.out.println("'��'�� ä�� �� : " + al1);
		for(String i : s) {
			al1.add(i);
		}
		System.out.println("����Ʈ�� ��� �߰��� �� : " + al1);
		Collections.sort(al1);
		System.out.println("����Ʈ�� ���� �� : " + al1);
		Collections.reverse(al1);
		System.out.println("����Ʈ�� �������� ������ �� : " + al1);
		System.out.println("����Ʈ���� �ּ� : " + Collections.min(al1));
		System.out.println("����Ʈ���� �ִ� : " + Collections.max(al1));
		System.out.println("����Ʈ���� ���� �� : " + Collections.frequency(al1, "��"));
	}
}
