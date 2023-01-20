package com.gl.TicketManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.TicketManagementSystem.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
