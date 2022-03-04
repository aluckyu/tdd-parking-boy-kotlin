package com.tw.parking.boy;

class ParkingBoy(val parkingLots: List<ParkingLot>) {

    fun parking(car: Car): Ticket? {
        return parkingLots.stream().filter { parkingLot -> parkingLot.hasCapacity() }.findFirst()
            .map { parkingLot -> parkingLot.parking(car) }
            .orElseThrow { NoCapacityException() }
    }

    fun takeCar(ticket: Ticket?): Car {
        return parkingLots.stream().filter { parkingLot -> parkingLot.hasCar(ticket) }.findFirst()
            .map { parkingLot -> parkingLot.takeCar(ticket) }
            .orElse(null)
    }
}
