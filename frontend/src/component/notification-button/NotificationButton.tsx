import Logo from '../../asset/img/notification-icon.svg';
import './NotificationButton.css';

export const NotificationButton = () => {
  return (
    <>
      <div className="dsmeta-red-btn">
        <img src={Logo} alt="Notificar" />
      </div>
    </>
  );
};
