import axios from 'axios';
import logo from '../../asset/img/notification-icon.svg';
import './NotificationButton.css';
import { toast } from 'react-toastify';
import { BASE_URL } from '../../enviroment/BaseURL';

interface Props {
  saleId: number;
}

export const NotificationButton: React.FC<Props> = ({ saleId }) => {
  function handleClick(saleId: number) {
    axios.get(`${BASE_URL}/sales/${saleId}/notification`).then(() => {
      toast.info('SMS enviado com sucesso');
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
