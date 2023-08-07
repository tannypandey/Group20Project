import React from 'react'

const CounterpartyDetail = (props) => {
  return (
        <tr>
            <td>{props.info.id}</td>
            <td>{props.info.status}</td>
            <td>{props.info.trade_type}</td>
            <td>{props.info.bond_holder}</td>
        </tr>

  )
}

export default CounterpartyDetail;