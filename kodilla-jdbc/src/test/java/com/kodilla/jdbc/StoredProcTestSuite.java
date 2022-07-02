package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement1 = dbManager.getConnection().createStatement();
        statement1.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs1 = statement1.executeQuery(sqlCheckTable);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        Statement statement2 = dbManager.getConnection().createStatement();
        statement2.executeUpdate(sqlProcedureCall);
        ResultSet rs2 = statement2.executeQuery(sqlCheckTable);

        //Then
        int howMany = -1;

        if (rs1.next()) {
            howMany = rs1.getInt("HOW_MANY");
        }
        assertEquals(5, howMany);

        if (rs2.next()) {
            howMany = rs2.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);

        rs1.close();
        rs2.close();
        statement1.close();
        statement2.close();
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=FALSE";
        Statement statement1 = dbManager.getConnection().createStatement();
        statement1.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=FALSE";
        ResultSet rs1 = statement1.executeQuery(sqlCheckTable);
        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        Statement statement2 = dbManager.getConnection().createStatement();
        statement2.execute(sqlProcedureCall);
        ResultSet rs2 = statement2.executeQuery(sqlCheckTable);
        //Then
        int howMany = -1;

        if (rs1.next()) {
            howMany = rs1.getInt("HOW_MANY");
        }
        assertEquals(5, howMany);

        if (rs2.next()) {
            howMany = rs2.getInt("HOW_MANY");
        }
        assertEquals(4, howMany);

        rs1.close();
        rs2.close();
        statement1.close();
        statement2.close();
    }
}
