import React from 'react'

const BondDetail = (props) => {
  return (
        <tr>
            <td>{props.info.id}</td>
            <td>{props.info.isin}</td>
            <td>{props.info.cusip}</td>
            <td>{props.info.issuer_name}</td>
            <td>{props.info.maturity_date}</td>
            <td>{props.info.coupon}</td>
            <td>{props.info.type}</td>
            <td>{props.info.face_value}</td>
            <td>{props.info.currency}</td>
            <td>{props.info.status}</td>
        </tr>

  )
}

export default BondDetail;