import logo from '../../asset/img/notification-icon.svg';
import './NotificationButton.css';

export const NotificationButton = () => {
  return (
    <>
      <div className="dsmeta-red-btn">
        <img src={logo} alt="Notificar" />
      </div>
    </>
  );
};
