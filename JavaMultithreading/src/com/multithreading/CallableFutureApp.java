package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MovieTicket{
	
	String movieName;
	String seatNum;
	boolean isTicketBooked;
	String emailUser;
	static int ticketNum;
	
	public MovieTicket() {
		
	}
	
	public MovieTicket(String movieName, String seatNum, boolean isTicketBooked, String emailUser) {
		this.movieName = movieName;
		this.seatNum = seatNum;
		this.isTicketBooked = isTicketBooked;
		this.emailUser = emailUser;
	}

	@Override
	public String toString() {
		return "MovieTicket [movieName=" + movieName + ", seatNum=" + seatNum + ", isTicketBooked=" + isTicketBooked
				+ ", emailUser=" + emailUser + "]";
	}
	
	
}

class MovieTicketBookingTask implements Callable<String>{

	MovieTicket ticket;
	
	public MovieTicketBookingTask(MovieTicket ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public String call() throws Exception {
		synchronized (ticket) {
		
		ticket.seatNum = "A" + MovieTicket.ticketNum;
		ticket.isTicketBooked = true;
		MovieTicket.ticketNum++;
		System.out.println("Paying for the ticket seat: " + ticket.seatNum + " for user: " + ticket.emailUser);
		
		System.out.println("Ticket booked for " + ticket.emailUser);
		ticket.seatNum = "A" + MovieTicket.ticketNum;
		
		System.out.println();
		
		return "Ticket Booked for " + ticket.emailUser + " with seat num: " + ticket.seatNum;
		}
	}
	
}

public class CallableFutureApp {

	public static void main(String[] args) {

		System.out.println("Movie Ticket Booking App Started");
		
		MovieTicket mTicket1 = new MovieTicket("Avengers", "A1", false, "john123@gmail.com");	
		MovieTicket mTicket2 = new MovieTicket("Avengers", "A2", false, "sam123@gmail.com");
		MovieTicket mTicket3 = new MovieTicket("Avengers", "A3", false, "chris123@gmail.com");
		MovieTicket mTicket4 = new MovieTicket("Avengers", "A4", false, "caleb123@gmail.com");
		MovieTicket mTicket5 = new MovieTicket("Avengers", "A5", false, "diego123@gmail.com");
		
		System.out.println(mTicket1);
		System.out.println(mTicket2);
		System.out.println(mTicket3);
		System.out.println(mTicket4);
		System.out.println(mTicket5);
		
		System.out.println("Processors: " + Runtime.getRuntime().availableProcessors());
		
		Callable task1 = new MovieTicketBookingTask(mTicket1);
		Callable task2 = new MovieTicketBookingTask(mTicket2);
		Callable task3 = new MovieTicketBookingTask(mTicket3);
		Callable task4 = new MovieTicketBookingTask(mTicket4);
		Callable task5 = new MovieTicketBookingTask(mTicket5);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		Future<String> future1 = service.submit(task1);
		Future<String> future2 = service.submit(task2);
		Future<String> future3 = service.submit(task3);
		Future<String> future4 = service.submit(task4);
		Future<String> future5 = service.submit(task5);
		
		
		try { 
			System.out.println("Task1 Result: " + future1.get());
			System.out.println("Task2 Result: " + future2.get());
			System.out.println("Task3 Result: " + future3.get());
			System.out.println("Task4 Result: " + future4.get());
			System.out.println("Task5 Result: " + future5.get()); 
		} catch (InterruptedException | ExecutionException e) { 
			// TODO Auto-generated catch block 
			e.printStackTrace(); 
		}
		
		System.out.println("Movie Ticket Booking App Finished");
	
	}

}
