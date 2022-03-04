package com.tw.parking.boy

import io.kotest.core.spec.style.WordSpec
import org.junit.jupiter.api.Assertions

class ParkingBoySpec : WordSpec({

    "parking boy" should {
        "should_parking_1st_parking_lot_when_parking_given_manage_two_parking_lot_both_has_capacity" {
            val car = Car()
            val firstParkingLot = ParkingLot(10)
            val secondParkingLot = ParkingLot(10)
            val parkingLots = listOf(firstParkingLot, secondParkingLot)
            val parkingBoy = ParkingBoy(parkingLots)

            val ticket = parkingBoy.parking(car)

            Assertions.assertNotNull(ticket)
            Assertions.assertEquals(car, firstParkingLot.takeCar(ticket))
        }

        "should_parking_2nd_parking_lot_when_parking_given_manage_two_parking_lot_1st_his_full_2nd_has_capacity" {
            val car = Car()
            val firstParkingLot = ParkingLot(0)
            val secondParkingLot = ParkingLot(10)
            val parkingLots = listOf(firstParkingLot, secondParkingLot)
            val parkingBoy = ParkingBoy(parkingLots)

            val ticket = parkingBoy.parking(car)

            Assertions.assertNotNull(ticket)
            Assertions.assertEquals(car, secondParkingLot.takeCar(ticket))

        }
    }
})