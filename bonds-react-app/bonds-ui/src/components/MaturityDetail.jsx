import React from 'react'

const MaturityDetail = (props) => {
  return (
        <tr>
            <td>{props.info.id}</td>
            <td>{props.info.status}</td>
            <td>{props.info.trade_type}</td>
            <td>{props.info.trade_date}</td>
            <td>{props.info.maturity_date}</td>
            <td>{props.info.trade_settlement_date}</td>
        </tr>

  )
}

export default MaturityDetail;