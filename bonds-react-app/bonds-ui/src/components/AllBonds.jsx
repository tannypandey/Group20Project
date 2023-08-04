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
                        <th>id</th>
                        <th>isin</th>
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