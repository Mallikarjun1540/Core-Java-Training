package threads;

class BookMyShow {
	static int total_tickets = 10;

	synchronized public void bookTickets(int ticket) {
		if (total_tickets >= ticket) {
			total_tickets = total_tickets - ticket;
			System.out.println(ticket + " has bookets has been booked & remaining are" + total_tickets);
		} else {
			System.out.println("Ticket is not booked only " + total_tickets + " are available ");
		}
	}

}

public class MyMovieApp extends Thread {
	static BookMyShow book;
	int t;

	public void run() {
		book.bookTickets(t);
	}

	public static void main(String[] args) {

		book = new BookMyShow();

		MyMovieApp Arjun = new MyMovieApp();
		Arjun.t = 3;
		Arjun.start();

		MyMovieApp Praveen = new MyMovieApp();
		Praveen.t = 5;
		Praveen.start();
		
		MyMovieApp Amith = new MyMovieApp();
		Amith.t = 5;
		Amith.start();

	}

}
