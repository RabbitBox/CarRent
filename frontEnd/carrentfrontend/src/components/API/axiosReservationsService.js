import axios from "./customAxios";
import qs from 'qs';


const reservationService = {
    fetchReservations: ()=> {
        return axios.get("reservations");
    },
    fetchActiveReservations: ()=> {
        return axios.get("reservations/active");
    },
    fetchReservationsByRenterId: (id)=> {
        return axios.get(`reservations?renterId=${id}`);
    },
    fetchReservationsByClientId: (id)=> {
        return axios.get(`reservations?clientId=${id}`);
    },
    addReservation: (reservation) => {

        const formParams = qs.stringify(reservation);
        return axios.post("reservations",formParams, {
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
                'clientId': 1,
                'carId': 1,
            }
        });
    },
    searchReservations: (name) => {
        return axios.get(`reservations?name=${name}`);
    },

};

export default reservationService;