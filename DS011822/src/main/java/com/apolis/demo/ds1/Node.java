package com.apolis.demo.ds1;

public class Node {
	private int value;
	private Node left;
	private Node right;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public Node(int value) {
		super();
		this.value = value;
		left = null;
		right = null;
	}

	public void add(int value) {
		if (value < this.value) {
			if (left != null) {
				left.add(value);
			} else {
				left = new Node(value);
			}
		} else {
			if (right != null) {
				right.add(value);
			} else {
				right = new Node(value);
			}
		}

	}

	public static void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	public static void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.value);
		}
	}

	public void traverseLevelOrder() {
		if (left != null)
			left.traverseLevelOrder();
		System.out.print(" " + value);
		if (right != null)
			right.traverseLevelOrder();

	}
}
