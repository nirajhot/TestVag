package common;

import org.apache.log4j.Logger;

public class commonMethods {

	final int capacity = 3;
	protected String Queue[] = new String[capacity];
	protected int size;
	int front;
	int rear;
	static Logger log = Logger.getLogger(commonMethods.class);
	
	public void enQue(String song) throws Exception{
		if(size<capacity){
			Queue[rear] = song;
			size = size + 1;
			rear = (rear + 1)%capacity;
		}else{
			log.error("Size of queue is full");
			//throw new Exception();
		}
	}

	public String deQue(){
		String data = Queue[front];
		front= (front + 1)%capacity;
		size = size - 1;
		return data;
	}

	public String show(String song){
		String currentPool="";
		if(song=="S4"){
			log.info("When "+ song + " song is played, the playlist looks like ->> ");
		}else if(song=="S2"){
			log.info("When "+ song + " song is played, the playlist looks like ->> ");
		}else if(song=="S1"){
			log.info("When "+ song + " song is played, the playlist looks like ->> ");
		}else if(song=="orignal"){
			log.info("The original playlist would look like ->> ");
		}
		for(int i=0;i<size;i++){
			log.info(Queue[(front + i)%capacity]+ " ");
			currentPool= currentPool+Queue[(front + i)%capacity];
		}
		return currentPool;
	}

	public void play(String song) throws Exception{
		deQue();
		enQue(song);
		//show(song);
	}
}