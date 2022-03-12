import React from 'react';
import {GetApiAction} from '../action/Action';

import {useDispatch,useSelector} from 'react-redux';
import { useEffect } from 'react';

const Home = () =>{

    const dispatch = useDispatch();
    const responseData = useSelector(state =>state.Reducer.details);

    console.log('responseData is __________________',responseData);

    useEffect(()=>{

        dispatch(GetApiAction());


    },[dispatch]);

   
    const result = responseData.map((data,index)=>{

        return(

            <tr key ={index}>
            <th scope='row'>{data.id}</th>
            <td>{data.name}</td>
            <td>{data.email}</td>
            <td>{data.phone}</td>
            <td>{data.country}</td>

            </tr>
        )

    })

return <div> <h1>React Redux cred Operation  | react app</h1>

<div className='container'>

<table className='table table-dark'>
<thead>

    <tr>
        <th scope='col'> id</th>
        <th scope='col'> name</th>
        <th scope='col'> email</th>
        <th scope='col'> phone</th>
        <th scope='col'> country</th>


    </tr>
</thead>
<tbody >{result}</tbody>


</table>
</div>

</div>




}
export default Home;