package com.tw.parking.boy

import java.util.*

class ParkingLot(val capacity: Int) {
    private val cars: MutableList<Car> = ArrayList()

    fun parking(car: Car): Ticket {
        if (cars.size >= capacity) {
            throw NoCapacityException()
        }

        cars.add(car)
        return Ticket()
    }

    fun takeCar(ticket: Ticket): Car {
        return cars[0]
    }
}
