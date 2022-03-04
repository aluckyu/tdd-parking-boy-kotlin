package com.tw.parking.boy;

class ParkingBoy(val parkingLots: List<ParkingLot>) {

    fun parking(car: Car): Ticket? {
        if (parkingLots[0].hasCapacity()) {
            return parkingLots[0].parking(car)
        }

        if (parkingLots[1].hasCapacity()) {
            return parkingLots[1].parking(car)
        }
        return null
    }
}
