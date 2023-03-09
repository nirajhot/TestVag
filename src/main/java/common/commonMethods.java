package common;

public class commonMethods {

	final int capacity = 3;
	String Queue[] = new String[capacity];
	int size;
	int front;
	int rear;

	public void enQue(String song) throws Exception{
		if(size<capacity){
			Queue[rear] = song;
			size = size + 1;
			rear = (rear + 1)%capacity;
		}else{
			System.out.print("Size of queue is exeeded");
			throw new Exception();
		}
	}

	public String deQue(){
		System.out.println();
		String data = Queue[front];
		front= (front + 1)%capacity;
		size = size - 1;
		return data;
	}

	public void show(String song){
		if(song=="S4"){
			System.out.print("When "+ song + " song is played, the playlist looks like ->> ");
		}else if(song=="S2"){
			System.out.print("When "+ song + " song is played, the playlist looks like ->> ");
		}else if(song=="S1"){
			System.out.print("When "+ song + " song is played, the playlist looks like ->> ");
		}else if(song=="orignal"){
			System.out.print("The orginal playlist would look like ->> ");
		}
		for(int i=0;i<size;i++){
			System.out.print(Queue[(front + i)%capacity]+ " ");
		}
	}

	public void play(String song) throws Exception{
		deQue();
		enQue(song);
		show(song);
	}
}