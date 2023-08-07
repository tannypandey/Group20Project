import React from 'react'
import BondDetail from './BondDetail'
import { getAllBonds } from '../services/bonds-service';
import { useEffect, useState } from 'react';
import Table from 'react-bootstrap/esm/Table';


const AllBonds = () => {

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
                        <th>ID</th>
                        <th>ISIN</th>
                        <th>CUSIP</th>
                        <th>ISSUER NAME</th>
                        <th>MATURITY DATE</th>
                        <th>COUPON</th>
                        <th>TYPE</th>
                        <th>FACE VALUE</th>
                        <th>CURRENCY</th>
                        <th>STATUS</th>
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