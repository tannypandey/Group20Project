import http from './axios-common';
export function getAllBonds(){
        return http.get("/bonds");
        
}
export function getAllCode(){
        return http.get("/code");
        
}
export function getAllBooks(){
        return http.get("/books");
}
export function find_tb1(){
        return http.get('/books/trading_book_1');
}

export function find_tb2(){
        return http.get('/books/trading_book_2');
}

export function find_tb3(){
        return http.get('/books/Trading_book_3');
}

export function find_tb4(){
        return http.get('/books/Trading_book_4');
}

export function find_tb6(){
        return http.get('/books/Trading_book_6');
}
// export function findByBookName(book_name){
//         return http.get('/books/{book_name}');
// }

export function getAllMaturity(){
        return http.get("/maturity");
}

export function getAllIssuer(){
        return http.get("/issuer");
        
}
export function getAllCounterparty(){
        return http.get("/counterparty");
        
}