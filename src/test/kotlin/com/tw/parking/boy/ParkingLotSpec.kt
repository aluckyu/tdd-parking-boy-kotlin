package com.tw.parking.boy

import io.kotest.core.spec.style.WordSpec
import org.junit.jupiter.api.Assertions

class ParkingLotSpec : WordSpec({
    "parking lot" should {
        "should_return_ticket_when_parking_given_parking_lot_has_available_capacity" {
            val car = Car()
            val parkingLot = ParkingLot(10)

            val ticket = parkingLot.parking(car)

            Assertions.assertNotNull(ticket)
        }
    }
})
