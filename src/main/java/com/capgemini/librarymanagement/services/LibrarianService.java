package com.capgemini.librarymanagement.services;

import java.util.List;

import com.capgemini.librarymanagement.dto.BooksInventory;
import com.capgemini.librarymanagement.dto.BooksRegistration;
import com.capgemini.librarymanagement.dto.BooksTransaction;
import com.capgemini.librarymanagement.dto.Users;

public interface LibrarianService {

	// librarian operations
	public BooksInventory addNewBook(BooksInventory booksInvent);

	public BooksInventory updateBook(BooksInventory booksInvent);

	public Boolean deleteBook(String bookId);

	public List<BooksRegistration> getBookRequest();

	public Boolean cancelBookRequest(Integer registrationId);

	public BooksTransaction responseBookRequest(Integer registrationId);

	public Users addNewStudent(Users student);
	
	public Users updateStudent(Users student);

	public List<Users> searchStudent();

	public Boolean deleteStudent(String studentId);
	
	public List<BooksInventory> searchBook();

}
