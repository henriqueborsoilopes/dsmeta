import axios from 'axios';
import logo from '../../asset/img/notification-icon.svg';
import './NotificationButton.css';

interface Props {
  saleId: number;
}

export const NotificationButton: React.FC<Props> = ({ saleId }) => {
  function handleClick(saleId: number) {
    axios
      .get(`http://localhost:8080/sales/${saleId}/notification`)
      .then((response) => {
        console.log('sucesso' + response.data);
      });
  }

  return (
    <>
      <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
        <img src={logo} alt="Notificar" />
      </div>
    </>
  );
};
