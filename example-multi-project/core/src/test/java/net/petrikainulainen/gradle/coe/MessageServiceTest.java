package net.petrikainulainen.gradle.coe;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import net.petrikainulainen.gradle.core.MessageService;

/**
 * @author Petri Kainulainen
 */
public class MessageServiceTest {

	private MessageService messageService;

	@Before
	public void setUp() {
		messageService = new MessageService();
	}

	@Test
	public void getMessage_ShouldReturnMessage() {
		assertEquals("Hello World!", messageService.getMessage());
	}
}