import React from 'react';
import { find_tb1, find_tb2, find_tb3, find_tb4, find_tb6, getAllBooks } from '../services/bonds-service';
import { useEffect, useState } from 'react';
import Table from 'react-bootstrap/esm/Table';
import BookDetail from './BookDetail';
import Button from 'react-bootstrap/Button'


const Books = () => {

  const [books,setBooks] = useState([]);
  useEffect(()=>{
      getBooksFromAPI();}, 
      []
  );

  const getBooksFromAPI = ()=>{

      getAllBooks().then(res => {
              setBooks(res.data);
          }).catch(err => {
              setBooks([]);
              console.log(err);
          })
  };

  
  const findBook_1 = (event) => {
    find_tb1().then(res => {
        setBooks(res.data);
      }).catch(err => {
        setBooks([]);
        console.log(err);
      })

  };

  const findBook_2 = (event) => {
    find_tb2().then(res => {
        setBooks(res.data);
      }).catch(err => {
        setBooks([]);
        console.log(err);
      })

  };
  const findBook_3 = (event) => {
    find_tb3().then(res => {
        setBooks(res.data);
      }).catch(err => {
        setBooks([]);
        console.log(err);
      })

  };
  const findBook_4 = (event) => {
    find_tb4().then(res => {
        setBooks(res.data);
      }).catch(err => {
        setBooks([]);
        console.log(err);
      })

  };
  const findBook_6 = (event) => {
    find_tb6().then(res => {
        setBooks(res.data);
      }).catch(err => {
        setBooks([]);
        console.log(err);
      })

  };


  return (
    <>
    <Button variant="primary" onClick={findBook_1}>Trading Book 1</Button>
    <Button variant="primary" onClick={findBook_2}>Trading Book 2</Button>
    <Button variant="primary" onClick={findBook_3}>Trading Book 3</Button>
    <Button variant="primary" onClick={findBook_4}>Trading Book 4</Button>
    <Button variant="primary" onClick={findBook_6}>Trading Book 6</Button>
    <Table striped bordered hover>
              <thead>
                  <tr>
                      <th>id</th>
                      <th>status</th>
                      <th>type</th>
                      <th>currency</th>
                      <th>cusip</th>
                  </tr>
                  </thead>
              <tbody>
                  {books.map(book=>(
                          <BookDetail info={book} key={book.id.toString()} />
                          ))}
              </tbody>
      </Table>
      {/* <Button variant="primary" onClick={getByBookFromAPI()}>Trading Book 2</Button>
      <Button variant="primary" onClick={getByBookFromAPI()}>Trading Book 3</Button>
      <Button variant="primary" onClick={getByBookFromAPI()}>Trading Book 4</Button>
      <Button variant="primary" onClick={getByBookFromAPI()}>Trading Book 6</Button> */}
      </>
  )
}

export default Books;