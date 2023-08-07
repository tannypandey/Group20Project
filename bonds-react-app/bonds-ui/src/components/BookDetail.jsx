import React from 'react';

const BookDetail = (props) => {
  return (
        <tr>
            <td>{props.info.id}</td>
            <td>{props.info.status}</td>
            <td>{props.info.type}</td>
            <td>{props.info.currency}</td>
            <td>{props.info.cusip}</td>
        </tr>

  )
}

export default BookDetail;