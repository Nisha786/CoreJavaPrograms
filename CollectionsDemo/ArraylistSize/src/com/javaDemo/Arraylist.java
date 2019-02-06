package com.javaDemo;

import java.util.Arrays;

public class Arraylist {

	public boolean add(E e) {
		ensureCapacity(size + 1); // Increments modCount
		elementData[size++] = e;
		return true;

	}

	// ArrayList add method
	public void ensureCapacity(int minCapacity) {
		modCount++;
		int oldCapacity = elementData.length;
		if (minCapacity > oldCapacity) {
			Object oldData[] = elementData;
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			// minCapacity is usually close to size, so this is a win
			elementData = Arrays.copyOf(elementData, newCapacity);
			// ensureCapacity Method to Handle ArrayList Size
		}
	}
}
