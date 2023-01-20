package com.gl.TicketManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "tickets")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ticket_title", nullable = false)
	private String tickettitle;
	
	@Column(name = "ticket_short_description")
	private String ticketshortdescription;
	
	
	@Column(name = "ticket_created_on")
	private String ticketcreatedon;
	
	public Ticket() {
		
	}

	public Ticket(String tickettitle, String ticketshortdescription, String ticketcreatedon) {
		super();
		this.tickettitle = tickettitle;
		this.ticketshortdescription = ticketshortdescription;
		this.ticketcreatedon = ticketcreatedon;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTickettitle() {
		return tickettitle;
	}

	public void setTickettitle(String tickettitle) {
		this.tickettitle = tickettitle;
	}

	public String getTicketshortdescription() {
		return ticketshortdescription;
	}

	public void setTicketshortdescription(String ticketshortdescription) {
		this.ticketshortdescription = ticketshortdescription;
	}

	public String getTicketcreatedon() {
		return ticketcreatedon;
	}

	public void setTicketcreatedon(String ticketcreatedon) {
		this.ticketcreatedon = ticketcreatedon;
	}
	
	
}
