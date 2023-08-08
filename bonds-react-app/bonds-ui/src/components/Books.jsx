import React from 'react';
import { find_tb1, find_tb2, find_tb3, find_tb4, find_tb6, getAllBooks } from '../services/bonds-service';
import { useEffect, useState } from 'react';
import Table from 'react-bootstrap/esm/Table';
import BookDetail from './BookDetail';
import Button from 'react-bootstrap/Button'
import Container from 'react-bootstrap/Container';
import Col from 'react-bootstrap/Col'
import Row from 'react-bootstrap/Row'


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
    <Container>
    <Row>
    <Col sm={4}>
      <Row><Button variant="primary" style={{marginBottom: '10px'}} onClick={findBook_1}>Trading Book 1</Button></Row>
      <Row><Button variant="primary" style={{marginBottom: '10px'}} onClick={findBook_2}>Trading Book 2</Button></Row>
      <Row><Button variant="primary" style={{marginBottom: '10px'}} onClick={findBook_3}>Trading Book 3</Button></Row>
      <Row><Button variant="primary" style={{marginBottom: '10px'}} onClick={findBook_4}>Trading Book 4</Button></Row>
      <Row><Button variant="primary" style={{marginBottom: '10px'}} onClick={findBook_6}>Trading Book 6</Button></Row>
    </Col>

    <Col sm={8}><Table responsive striped bordered hover size='sm'>
              <thead>
                  <tr>
                      <th>ID</th>
                      <th>Status</th>
                      <th>Type</th>
                      <th>Currency</th>
                      <th>CUSIP</th>
                  </tr>
                  </thead>
              <tbody>
                  {books.map(book=>(
                          <BookDetail info={book} key={book.id.toString()} />
                          ))}
              </tbody>
      </Table></Col>
      </Row>
      </Container>
      </>
  )
}

export default Books;