package com.tw.parking.boy;

class ParkingBoy(val parkingLots: List<ParkingLot>) {

    fun parking(car: Car): Ticket {
        return parkingLots[0].parking(car)
    }
}
