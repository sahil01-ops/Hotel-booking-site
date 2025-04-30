package com.dailycodework.lakesidehotel.repository;

import com.dailycodework.lakesidehotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query("SELECT DISTINCT r.roomType FROM Room r")
    List<String> findDistinctRoomTypes();

    @Query("SELECT r FROM Room r " +
           "WHERE r.roomType LIKE %:roomType% " +
           "AND NOT EXISTS (" +
           "    SELECT br FROM BookedRoom br " +
           "    WHERE br.room = r " +
           "    AND NOT (br.checkOutDate < :checkInDate OR br.checkInDate > :checkOutDate)" +
           ")")
    List<Room> findAvailableRoomsByDatesAndType(LocalDate checkInDate, LocalDate checkOutDate, String roomType);
}