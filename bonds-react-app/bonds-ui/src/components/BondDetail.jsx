import React from 'react'
import Table from 'react-bootstrap/Table';
const BondDetail = (props) => {
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
        <tr>
            <td>{props.info.id}</td>
            <td>{props.info.isip}</td>
            <td>{props.info.cusip}</td>
            <td>{props.info.issuer_name}</td>
            <td>{props.info.maturity_date}</td>
            <td>{props.info.coupon}</td>
            <td>{props.info.type}</td>
            <td>{props.info.face_value}</td>
            <td>{props.info.currency}</td>
            <td>{props.info.status}</td>
        </tr>
        </tbody>
        </Table>
  )
}

export default BondDetail;