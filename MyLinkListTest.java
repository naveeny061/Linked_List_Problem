package com.assignment;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkListTest {

	@Test
	public void given3NumberWhenAddedToTheLinkedListShouldBeAddedOnTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkList myLinkedList = new MyLinkList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		boolean result = myThirdNode.getNext().equals(mySecondNode)
				&& myThirdNode.getNext().getNext().equals(myFirstNode);
		Assert.assertTrue(result);
	}
	@Test
	public void given3NumberWhenAppendToTheLinkedListShouldBeAddedOnLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkList myLinkedList = new MyLinkList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode)
				&& myFirstNode.getNext().getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
	@Test
	public void given3NumberWhenInsertingSecondToTheLinkedListShouldPassLinkListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkList myLinkedList = new MyLinkList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode)
				&& myFirstNode.getNext().getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
	@Test
	public void givenFirstNumberWhenDeletedToTheLinkedListShouldPassLinkListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkList myLinkedList = new MyLinkList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.pop();
		boolean result = mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
	@Test
	public void givenLastNumberWhenDeletedToTheLinkedListShouldPassLinkListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkList myLinkedList = new MyLinkList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.popLast();
		boolean result = myFirstNode.getNext().equals(mySecondNode);
		Assert.assertTrue(result);
	}

}
