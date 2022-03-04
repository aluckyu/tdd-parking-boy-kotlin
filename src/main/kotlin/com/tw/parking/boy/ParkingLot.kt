package com.tw.parking.boy

import java.util.*

class ParkingLot(val capacity: Int) {
    private val ticketCarMap: MutableMap<Ticket, Car> = HashMap()

    fun parking(car: Car): Ticket {
        if (ticketCarMap.size >= capacity) {
            throw NoCapacityException()
        }

        val ticket = Ticket()
        ticketCarMap[ticket] = car
        return ticket
    }

    fun takeCar(ticket: Ticket?): Car {
        val car = ticketCarMap[ticket] ?: throw InvalidTicketException()
        ticketCarMap.remove(ticket)
        return car
    }

    fun hasCapacity(): Boolean {
        return ticketCarMap.size < capacity
    }
}
