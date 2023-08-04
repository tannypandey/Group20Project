import React from 'react'
import Table from 'react-bootstrap/Table';
const BondDetail = (props) => {
  return (
    // <div>
    //     <p> id: {props.info.id} </p>
    //     <p> isip: {props.info.isip}</p>
    //     <p> cusip: {props.info.cusip}</p>
    //     <p> issuer_name: {props.info.issuer_name}</p>
    //     <p> maturity_date:{props.info.Id}</p>
    //     <p> coupon:{props.info.Id} </p>
    //     <p> type: {props.info.Id}</p>
    //     <p> face_value: {props.info.Id}</p>
    //     <p> currency:{props.info.Id} </p>
    //     <p> status: {props.info.Id}</p>
    // </div>

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

export default BondDetail