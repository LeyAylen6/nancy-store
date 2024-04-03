import axios from "axios";

// Your computer's IP must be used (cmd -> ipConfig), if you use localhost, the application maps localhost to the 
// virtual machine's IP instead of using the actual local IP.
const BASE_URL = 'http://192.168.100.19:8080';

axios.interceptors.response.use(
    (response) => response,
    (error) => {
        console.error('Axios Code: ', error.code);
        console.error('Axios response:', error.response);
        console.error('Axios request:', error.request);
        console.error('Axios message:', error.message);

      return Promise.reject(error);
    }
);

export const getAllProducts = async() => {
    try {
        const { data } = await axios.get(`${BASE_URL}/product`)
        return data;

    } catch(error: any) {
        console.error('Error fetching user:', error);
    } 
}

export const getProductById = async(id: number) => {
    try {
        const { data } = await axios.get(`${BASE_URL}/product/${id}`)
        return data;

    } catch(error: any) {
        console.error('Error fetching user:', error);
    } 
}