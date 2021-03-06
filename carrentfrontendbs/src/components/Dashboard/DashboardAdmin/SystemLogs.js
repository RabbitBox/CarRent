import React, {useState, useEffect} from 'react';
import {MDBBtn, MDBDataTable, MDBIcon, MDBTooltip} from 'mdbreact';
import "../../../myStyle/carStyle.css"
import adminService from "../../../API/axiosAdminService";

const SystemLogs = (props) => {

    useEffect(() =>{
        loadLogs();
    },[]);

    const [logs, setLogs] = useState([]);


    const loadLogs = () => {
        adminService.fetchLogs().then(response=>{
            let list = response.data;
            list.sort((a, b) => (a.id > b.id) ? 1 : -1)
            setLogs(list);
        })
    };

    const data = {
        columns: [
            {
                label: 'ID',
                field: 'id',
                sort: 'asc',
                width: 100
            },
            {
                label: 'User Role',
                field: 'role',
                sort: 'asc',
                width: 100
            },
            {
                label: 'username',
                field: 'username',
                sort: 'asc',
                width: 150
            },
            {
                label: 'IP address',
                field: 'ip',
                sort: 'asc',
                width: 100
            },
            {
                label: 'Log-in Time',
                field: 'login',
                sort: 'asc',
                width: 250
            },
            {
                label: 'Log-out Time',
                field: 'logout',
                sort: 'asc',
                width: 100
            },
            {
                label: 'Total Minutes',
                field: 'total',
                sort: 'asc',
                width: 100
            },

            {
                label: 'Is successful',
                field: 'success',
                sort: 'asc',
                width: 100
            },
            {
                label: 'JWT Token',
                field: 'jwt',
                sort: 'asc',
                width: 100
            }
        ],
        rows: [
            ...logs.map((log) => ({
                    id: log.id,
                    role: log.roll,
                    username:log.userName,
                    ip: log.ipAddress,
                    login: log.fromTime,
                    logout: log.toTime,
                    total: log.totalHours,
                    success: log.success +"",
                    jwt:(
                       <div title={log.sessionId}>
                           <MDBIcon icon="eye" size="lg" />
                       </div>
                    )
                })

            )
        ]
    };

    return(
        <div id="dasReservations" className="app" >
            <h2 className="text-center" style={{color: "rgb(60,64,68)"}}>А complete list of <b>logs within the system</b>!</h2>
            <p className="text-center" id="car-paragraph" style={{color: "rgb(112,120,128)"}}>The lgos that are
                listed down are some text just to look nice.<br/>Same here, no idea!</p>
            <div id="ccc1">
                {console.log(logs)}
                <MDBDataTable
                    responsive
                    striped
                    hover
                    data={data}
                />

            </div>
        </div>
    );
};

export default SystemLogs;