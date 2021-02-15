package com.oracle.oops.part3;

public class EnumEx1 {
public static void main(String[] args) {
	//B Logic for booking the ticket ....
	
	//displayStatus(BookingStatus.RAC);
	
	//displayStatus("Ticket Confirmed");
	printStatus(TicketBookingStatus.CNF);
}

static void printStatus(TicketBookingStatus status) {
	switch (status) {
	case CNF:
		System.out.println("Your ticket is confired");
		break;
	case RAC:
		System.out.println("Your ticket is RAC");
		break;
	case WL :
		System.out.println("Your ticket is WL");
		break;
	case CAN:
		System.out.println("Your ticket is cancelled..");
		break;
	}
}
static void displayStatus(String status) {
	switch (status) {
	case "CNF":
		System.out.println("Your ticket is confired");
		
		break;
	case "WL":
		System.out.println("Your ticket is in Waiting list");
		
		break;
	case "RAC":
		System.out.println("Your ticket is RAC");
		
		break;
	case "CAN":
		System.out.println("Your ticket is Cancelled");
		
		break;

	default:
		System.out.println("????????????/");
		break;
	}
}
}
