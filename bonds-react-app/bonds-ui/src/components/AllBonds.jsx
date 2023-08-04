import React from 'react'
import BondDetail from './BondDetail'
import { getAllBonds } from '../services/bonds-service';
import { useEffect, useState } from 'react';
import Table from 'react-bootstrap/esm/Table';


const AllBonds = () => {
//     const bonds = [
//     // {"id":1, "isip": "XS1988387210","cusip": "123456780","issuer_name":"Darius","maturity_date":"12-12-2001", "coupon": 4.37,"type": "CORP","face_value": 1000,"currency": "USD","status": "buy"},
//     // {"id":2, "isip": "XS1988387210","cusip": "123456780","issuer_name":"Darius","maturity_date":"12-12-2001", "coupon": 4.37,"type": "CORP","face_value": 1000,"currency": "USD","status": "buy"}

// ]
    const [bonds,setBonds] = useState([]);
    useEffect(()=>{
        getBondsFromAPI();}, 
        []
    );

    const getBondsFromAPI = ()=>{

        getAllBonds().then(res => {
                setBonds(res.data);
            }).catch(err => {
                setBonds([]);
                console.log(err);
            })
    };
    

    return (
        <Table striped bordered hover>
                <thead>
                    <tr>
                        <th>id</th>
                        <th>isip</th>
                        <th>cusip</th>
                        <th>issuer_name</th>
                        <th>maturity_date</th>
                        <th>coupon</th>
                        <th>type</th>
                        <th>face_value</th>
                        <th>currency</th>
                        <th>status</th>
                    </tr>
                    </thead>
                <tbody>
                    {bonds.map(bond=>(
                            <BondDetail info={bond} key={bond.id.toString()} />
                            ))}
                </tbody>
        </Table>
    )
 
}

export default AllBonds