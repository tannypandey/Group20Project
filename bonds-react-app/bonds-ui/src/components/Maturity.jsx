import React from 'react'
import MaturityDetail from './MaturityDetail'
import { getAllMaturity } from '../services/bonds-service';
import { useEffect, useState } from 'react';
import Table from 'react-bootstrap/esm/Table';

const Maturity = () => {
  const [maturity, setMaturity] = useState([]);
  useEffect(()=>{
      getMaturityFromAPI();}, 
      []
  );

  const getMaturityFromAPI = ()=>{

      getAllMaturity().then(res => {
              setMaturity(res.data);
          }).catch(err => {
              setMaturity([]);
              console.log(err);
          })
  };
  

  return (
      <Table striped bordered hover>
              <thead>
                  <tr>
                      <th>id</th>
                      <th>status</th>
                      <th>type</th>
                      <th>trade date</th>
                      <th>maturity date</th>
                      <th>trade settlement date</th>
                  </tr>
                  </thead>
              <tbody>
                  {maturity.map(mat=>(
                          <MaturityDetail info={mat} key={mat.id.toString()} />
                          ))}
              </tbody>
      </Table>
  )
}

export default Maturity;