import React from 'react'
import BondDetail from './BondDetail'

const AllBonds = () => {
    const bonds = [
    {"id":1, "isip": "XS1988387210","cusip": "123456780","issuer_name":"Darius","maturity_date":"12-12-2001", "coupon": 4.37,"type": "CORP","face_value": 1000,"currency": "USD","status": "buy"},
    {"id":2, "isip": "XS1988387210","cusip": "123456780","issuer_name":"Darius","maturity_date":"12-12-2001", "coupon": 4.37,"type": "CORP","face_value": 1000,"currency": "USD","status": "buy"}

]
    return (
    bonds.map(bond=>(
            <BondDetail info={bond} key={bond.id.toString()} />
            )
        )
    )
 
}

export default AllBonds