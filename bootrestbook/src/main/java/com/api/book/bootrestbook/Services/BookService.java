package com.api.book.bootrestbook.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;
@Component
public class BookService {
    @Autowired
    private BookRepository bookReprository;
    // private static List<Book> list =new ArrayList<>();
    // static{
    //     list.add(new Book(12,"Java","xhgdyz"));
    //     list.add(new Book(1762,"Java","xyjdz"));
    //     list.add(new Book(142,"Jayertyhva","xyz"));
    //     list.add(new Book(1322,"Jgdhava","xhrtdyz"));
    //     list.add(new Book(152,"Javmnbva","xghdfz"));
    //     list.add(new Book(15542,"Jahgfva","xdfyz"));
    //     list.add(new Book(132,"Jahjfva","xhgdz"));
    //     list.add(new Book(122,"Jarteva","xyhdz"));
    //     list.add(new Book(1762,"Jabvva","xyghdgz"));
    //     list.add(new Book(1652,"Jnvbva","xyhfgz"));
    // }
    //get all books
    public List<Book>getAllBooks(){
        
      List<Book> list=(List<Book>)this.bookReprository.findAll();
      return list;
    }

    //get single book by ID
    public Book getBookById(int id){
        Book book=null;
        try{
            // book=list.stream().filter(e->e.getId()==id).findFirst().get();
         book=this.bookReprository.findById(id);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return book;
    }
    //Add a book
    public Book addBook(Book b){
      Book result=  bookReprository.save(b);
        return result;
    }

    //Delete the book
    public void deletebook(int bid){
    //    list= list.stream().filter(e->e.getId()!=bid).collect(Collectors.toList());
    bookReprository.deleteById(bid);
    }

    //Update a book
public void updateBook(Book book, int bid){
   
//   list=  list.stream().map(e->{
// if(e.getId()==bid){
//   e.setAuthor(book.getAuthor());
//   e.setTitle(book.getTitle());
// }return e;
    
//     }).collect(Collectors.toList());

book.setId(bid);
bookReprository.save(book);
}
}