import React from 'react'
import IssuerDetail from './IssuerDetail'
import { getAllIssuer } from '../services/bonds-service';
import { useEffect, useState } from 'react';
import Table from 'react-bootstrap/esm/Table';


const Issuer = () => {
  const [issuers,setIssuers] = useState([]);
  useEffect(()=>{
      getIssuersFromAPI();}, 
      []
  );

  const getIssuersFromAPI = ()=>{

      getAllIssuer().then(res => {
              setIssuers(res.data);
          }).catch(err => {
              setIssuers([]);
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
                      <th>ISSUER</th>
                  </tr>
                  </thead>
              <tbody>
                  {issuers.map(issuer=>(
                          <IssuerDetail info={issuer} key={issuer.id.toString()} />
                          ))}
              </tbody>
      </Table>
  )
}

export default Issuer;