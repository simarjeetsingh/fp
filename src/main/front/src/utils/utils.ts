import axios from 'axios';
import AxiosInstance from 'axios';

// const HTTP: any = axios.create({
//     baseURL: 'http://localhost:8080/'
// });
//
// HTTP.defaults.headers.common['Authorization'] = 'Basic YXBpOnBhc3N3b3Jk';
//
// export default HTTP;

export const HTTP: any = axios.create({
    baseURL: `http://localhost:8080/`,
    headers: {
        // Authorization: 'Bearer {token}'
        Authorization: 'Basic YXBpOnBhc3N3b3Jk'
    }
});