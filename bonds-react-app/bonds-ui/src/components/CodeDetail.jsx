import React from 'react'

const CodeDetail = (props) => {
  return (
        <tr>
            <td>{props.info.id}</td>
            <td>{props.info.status}</td>
            <td>{props.info.type}</td>
            <td>{props.info.currency}</td>
            <td>{props.info.isin}</td>
            <td>{props.info.cusip}</td>
        </tr>

  )
}

export default CodeDetail;