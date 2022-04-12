/*
Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
APCS pd7
HW89 -- Queue Two Ways
2022-04-11
time spent: 0.1 hr

DISCO

QCC

*/

import java.util.LinkedList;
public class LLQueue<T> implements Queue<T> {
	private LinkedList<T> _list;
	public LLQueue(){
		_list = new LinkedList<T>();
	}
	public void enqueue(T val){
		_list.addLast(val);
	}
	public T dequeue(){
		if(!isEmpty()){
			return _list.removeFirst();
		}
		return null;
	}
	public T peekFront(){
		return _list.getFirst();
	}
	public boolean isEmpty(){
		return _list.isEmpty();
	}
	public static void main(String[] args) {
		LLQueue<Integer> q = new LLQueue<Integer>();
		for (int i = 0; i < 80; i+=2 ) {
			q.enqueue(i);
		}
		while (!q.isEmpty()){
			System.out.println(q.peekFront());
			q.dequeue();
		}
	}
}
