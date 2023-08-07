import React from 'react'
import CounterpartyDetail from './CounterpartyDetail'
import { getAllCounterparty } from '../services/bonds-service';
import { useEffect, useState } from 'react';
import Table from 'react-bootstrap/esm/Table';


const Counterparty = () => {
  const [counterpartys,setCounterpartys] = useState([]);
  useEffect(()=>{
      getCounterpartysFromAPI();}, 
      []
  );

  const getCounterpartysFromAPI = ()=>{

      getAllCounterparty().then(res => {
              setCounterpartys(res.data);
          }).catch(err => {
              setCounterpartys([]);
              console.log(err);
          })
  };
  

  return (
      <Table striped bordered hover>
              <thead>
                  <tr>
                      <th>ID</th>
                      <th>STATUS</th>
                      <th>TYPE</th>
                      <th>BOND HOLDER</th>
                  </tr>
                  </thead>
              <tbody>
                  {counterpartys.map(counterparty=>(
                          <CounterpartyDetail info={counterparty} key={counterparty.id.toString()} />
                          ))}
              </tbody>
      </Table>
  )
}

export default Counterparty;