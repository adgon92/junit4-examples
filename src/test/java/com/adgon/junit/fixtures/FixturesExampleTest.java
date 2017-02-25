package com.adgon.junit.fixtures;

import org.junit.*;

import java.io.Closeable;
import java.io.IOException;

public class FixturesExampleTest {

    private static ExpensiveManagedResource myExpensiveManagedResource;
    private ManagedResource myManagedResource;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("@BeforeClass setUpClass");
        myExpensiveManagedResource = new ExpensiveManagedResource();
    }

    @AfterClass
    public static void tearDownClass() throws IOException {
        System.out.println("@AfterClass tearDownClass");
        myExpensiveManagedResource.close();
        myExpensiveManagedResource = null;
    }

    @Before
    public void setUp() {
        this.println("@Before setUp");
        this.myManagedResource = new ManagedResource();
    }

    @After
    public void tearDown() throws IOException {
        this.println("@After tearDown");
        this.myManagedResource.close();
        this.myManagedResource = null;
    }

    @Test
    public void test1() {
        this.println("@Test test1()");
    }

    @Test
    public void test2() {
        this.println("@Test test2()");
    }

    private void println(String string) {
        System.out.println(string);
    }

    static class ExpensiveManagedResource implements Closeable {
        @Override
        public void close() throws IOException {
        }
    }

    static class ManagedResource implements Closeable {
        @Override
        public void close() throws IOException {
        }
    }
}