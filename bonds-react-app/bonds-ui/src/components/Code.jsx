import React from 'react'
import CodeDetail from './CodeDetail'
import { getAllCode } from '../services/bonds-service';
import { useEffect, useState } from 'react';
import Table from 'react-bootstrap/esm/Table';

const Code = () => {
  const [codes,setCodes] = useState([]);
  useEffect(()=>{
      getCodesFromAPI();}, 
      []
  );

  const getCodesFromAPI = ()=>{

      getAllCode().then(res => {
              setCodes(res.data);
          }).catch(err => {
              setCodes([]);
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
                      <th>CURRENCY</th>
                      <th>ISIN</th>
                      <th>CUSIP</th>
                  </tr>
                  </thead>
              <tbody>
                  {codes.map(code=>(
                          <CodeDetail info={code} key={code.id.toString()} />
                          ))}
              </tbody>
      </Table>
  )
}

export default Code;