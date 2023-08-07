import React from 'react'

const IssuerDetail = (props) => {
  return (
        <tr>
            <td>{props.info.id}</td>
            <td>{props.info.status}</td>
            <td>{props.info.trade_type}</td>
            <td>{props.info.issuer}</td>
        </tr>

  )
}

export default IssuerDetail;