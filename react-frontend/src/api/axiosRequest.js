import axios from "axios";

export async function AxiosRequest(url,method,header,params){

return params?axios({
    url :url,
    method:method,
    header:header,
    data:params,
    timeout:1000
})
: axios({
    url :url,
    method:method,
    header:header,
    data: {},
    timeout:1000
});


}
const GetApiDetails = ()=>{

    const headers ={

        'Content-Type':'application/json',

    };

        return AxiosRequest('http://localhost:3000/details','GET',headers,{});

};



const PostApiDetails = (data)=>{

    const headers = {

        'Content-Type':'application/json',

    };

        return AxiosRequest('http://localhost:3000/details','POST',headers,data);

};
export {GetApiDetails, PostApiDetails};