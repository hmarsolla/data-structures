package dataStructures;

import java.util.Iterator;

public class DynamicArray {

	private int[] items;
	private int count;
	
	public DynamicArray(int lenght) {
		count = 0;
		items = new int[lenght];
	}
	
	public DynamicArray(int[] numbers) {
		count = numbers.length;
		items = numbers;
	}
	
	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
	
	public void push(int item) {
		if (items.length == count) {
			int[] newArray = new int[count * 2];
			
			for (int i = 0; i < count; i++) {
				newArray[i] = items[i];
			}
			
			items = newArray;
		}
		
		items[count++] = item;
	}
	
	public void removeAt(int index) {
		if (index < 0 || index >= count) {
			throw new IllegalArgumentException();
		}
		
		for (int i = index; i < count; i++) {
			items[i] = items[i+1];
		}
		
		count--;
	}
	
	public void remove(int item) {
		int index = this.indexOf(item);
		if (index != -1) {
			this.removeAt(index);			
		}
	}
	
	public int indexOf(int item) {
		for (int i = 0; i < count; i++) {
			if (items[i] == item) {
				return i;				
			}
		}
		
		return -1;
	}
	
}
