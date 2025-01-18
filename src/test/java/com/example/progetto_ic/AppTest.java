/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.progetto_ic;

/**
 *
 * @author giuseppearcuti
 */
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testSubtract() {
        Progetto_IC app = new Progetto_IC();
        Assert.assertEquals(1, app.subtract(3, 2)); // Test che fallirà intenzionalmente
    }
}
