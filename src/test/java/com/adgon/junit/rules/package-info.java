/**
 * Rules allow very flexible addition or redefinition of the behavior of each test method in a test class.
 * Testers can reuse or extend one of the provided Rules below, or write their own.
 * <p>
 * From {@link org.junit.rules.TestRule}:
 * <ul>
 * <li>{@link org.junit.rules.ErrorCollector}: collect multiple errors in one test method</li>
 * <li>{@link org.junit.rules.ExpectedException}: make flexible assertions about thrown exceptions</li>
 * <li>{@link org.junit.rules.ExternalResource}: start and stop a server, for example</li>
 * <li>{@link org.junit.rules.TemporaryFolder}: create fresh files, and delete after test</li>
 * <li>{@link org.junit.rules.TestName}: remember the test name for use during the method</li>
 * <li>{@link org.junit.rules.TestWatcher}: add logic at events during method execution</li>
 * <li>{@link org.junit.rules.Timeout}: cause test to fail after a set time</li>
 * <li>{@link org.junit.rules.Verifier}: fail test if object state ends up incorrect</li>
 * </ul>
 */
package com.adgon.junit.rules;