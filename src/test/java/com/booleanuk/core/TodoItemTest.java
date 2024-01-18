package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Morning activity
class TodoItemTest {

    @Test
    public void testGetTitle() {
        TodoItem t = new TodoItem("Run", "Long", "Done");
        Assertions.assertEquals("Run", t.getTitle());
    }
    @Test
    public void testGetDetail() {
        TodoItem t = new TodoItem("Run", "Long", "Done");
        Assertions.assertEquals("Long", t.getDetail());
    }
    @Test
    public void testGetStatus() {
        TodoItem t = new TodoItem("Run", "Long", "Done");
        Assertions.assertEquals("Done", t.getStatus());
    }
    @Test
    public void testSetTitle() {
        TodoItem t = new TodoItem("Run", "Long", "Done");
        t.setTitle("Walk");
        Assertions.assertEquals("Walk", t.getTitle());
    }
    @Test
    public void testSetDetail() {
        TodoItem t = new TodoItem("Run", "Long", "Done");
        t.setDetail("Short");
        Assertions.assertEquals("Short", t.getDetail());
    }
    @Test
    public void testSetStatus() {
        TodoItem t = new TodoItem("Run", "Long", "Done");
        t.setStatus("Undone");
        Assertions.assertEquals("Undone", t.getStatus());
    }
}