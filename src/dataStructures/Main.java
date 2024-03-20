package dataStructures;

public class Main {
	public static void main(String[] args) {
		DynamicArray array = new DynamicArray(3);
		array.push(15);
		array.push(70);
		array.push(97);
		array.push(86);
		array.push(78);
		array.removeAt(3);
		array.remove(70);
		array.print();
		System.out.println(array.indexOf(15));
	}
}
