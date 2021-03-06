package com.koitt.async;

public class TestDrive {
	public static void main(String[] args) {
		// 동기적 실행 (Sync): 코드를 작성한 순서대로 실행
		System.out.println("1");
		System.out.println("2");				// println("1") 실행이 끝난 이후에 실행
		
		// 비동기적 실행
		Thread th1 = new Thread(new MyThread());				// Thread-0
		Thread th2 = new Thread(new MyThread());				// Thread-1
		Thread th3 = new Thread(new MyThread());				// Thread-2
		th1.start();
		th2.start();
		th3.start();
	}
}

/*
 *	Thread 생성 방법
 *	1. Thread 클래스를 상속 받아 구현
 *	2. Runnable 인터페이스를 상속 받아 구현
 *
 * 	이 중 방법2로 아래와 같이 Thread를 구현
 */

class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}