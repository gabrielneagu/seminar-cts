package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "gabita";
		Student student = new Student(nume);
		assertEquals("a picat numele", nume, student.getNume());
		assertNotNull("au picat notele", student.getNote());
	}

	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		assertNotNull("au picat notele", student.getNote());
		assertNotNull("a picat numele", student.getNume());
	}

	@Test
	public void testSetterNume() {
		String nume = "gabita";
		Student student = new Student();
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}

	@Test
	public void testAdaugareNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
}
