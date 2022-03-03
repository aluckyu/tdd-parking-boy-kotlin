package com.tw.parking.boy

import io.kotest.core.spec.style.WordSpec
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.assertThrows

class ParkingLotSpec : WordSpec({
    "parking lot" should {
        "should_return_ticket_when_parking_given_parking_lot_has_available_capacity" {
            val car = Car()
            val parkingLot = ParkingLot(10)

            val ticket = parkingLot.parking(car)

            Assertions.assertNotNull(ticket)
        }

        "should_return_no_capacity_when_parking_boy_parking_given_parking_lot_has_no_available_capacity" {
            val car = Car()
            val parkingLot = ParkingLot(0)

            assertThrows<NoCapacityException> { parkingLot.parking(car) }
        }

        "should_success_when_take_car_given_valid_ticket" {
            val car = Car()
            val parkingLot = ParkingLot(10)
            val ticket = parkingLot.parking(car)

            val takingCar = parkingLot.takeCar(ticket)

            Assertions.assertNotNull(takingCar)
            Assertions.assertEquals(car, takingCar)
        }

        "should_return_invalid_ticket_when_take_car_given_invalid_ticket" {
            val car = Car()
            val parkingLot = ParkingLot(10)
            parkingLot.parking(car)

            assertThrows<InvalidTicketException> { parkingLot.takeCar(null) }
        }
    }
})
