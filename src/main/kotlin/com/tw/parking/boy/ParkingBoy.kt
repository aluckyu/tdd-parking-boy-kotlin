package com.tw.parking.boy;

class ParkingBoy(val parkingLots: List<ParkingLot>) {

    fun parking(car: Car): Ticket? {
        return parkingLots.stream().filter { parkingLot -> parkingLot.hasCapacity() }.findFirst()
            .map { parkingLot -> parkingLot.parking(car) }
            .orElse(null)
    }
}
